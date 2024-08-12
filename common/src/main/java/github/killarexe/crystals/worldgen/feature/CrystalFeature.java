package github.killarexe.crystals.worldgen.feature;

import java.util.ArrayList;
import java.util.Optional;

import com.mojang.serialization.Codec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration.TargetBlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class CrystalFeature extends Feature<CrystalFeatureConfig> {

	public CrystalFeature(Codec<CrystalFeatureConfig> codec) {
		super(codec);
	}

	@Override
	public boolean place(FeaturePlaceContext<CrystalFeatureConfig> featurePlaceContext) {
		WorldGenLevel level = featurePlaceContext.level();
		CrystalFeatureConfig config = featurePlaceContext.config();
		BlockPos origin = featurePlaceContext.origin();
		TargetBlockState targetBlockState = config.target();
		RandomSource random = level.getRandom();
		BlockState currentState = level.getBlockState(origin);
		boolean isWaterLogged = currentState.is(Blocks.WATER);

		if(!(currentState.isAir() || isWaterLogged)) {
			return false;
		}

		Optional<Direction> direction = getDirection(origin, targetBlockState, level, random);
		if(direction.isPresent()) {
			level.setBlock(origin, targetBlockState.state.setValue(BlockStateProperties.FACING, direction.get()).setValue(BlockStateProperties.WATERLOGGED, isWaterLogged), 3);
			level.getChunk(origin).markPosForPostprocessing(origin);
			return true;
		}
		return false;
	}

	private Optional<Direction> getDirection(BlockPos origin, TargetBlockState targetBlockState, WorldGenLevel level, RandomSource source) {
		ArrayList<Direction> availableDirections = new ArrayList<>();
		RuleTest rule = targetBlockState.target;

		for (Direction direction : Direction.values()) {
			BlockPos adjacentPos = origin.relative(direction);
			if (level.hasChunkAt(adjacentPos)) {
				if (rule.test(level.getBlockState(adjacentPos), source)) {
					availableDirections.add(direction.getOpposite());
				}
			}
		}

		if(availableDirections.isEmpty()) {
			return Optional.empty();
		}
		return Optional.ofNullable(availableDirections.get(source.nextIntBetweenInclusive(0, availableDirections.size() - 1)));
	}
}
