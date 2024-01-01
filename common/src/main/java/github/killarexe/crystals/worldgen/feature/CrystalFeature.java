package github.killarexe.crystals.worldgen.feature;

import java.util.ArrayList;
import java.util.Optional;

import com.mojang.serialization.Codec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
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
		
		if(!level.getBlockState(origin).isAir()) {
			return false;
		}
		
		Optional<Direction> direction = getDirection(origin, targetBlockState, level, random);
		if(direction.isPresent()) {
			try {
				level.setBlock(origin, targetBlockState.state.setValue(BlockStateProperties.FACING, direction.get()), Block.UPDATE_ALL_IMMEDIATE);
				return true;
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	private Optional<Direction> getDirection(BlockPos origin, TargetBlockState targetBlockState, WorldGenLevel level, RandomSource source) {
		ArrayList<Direction> availableDirections = new ArrayList<Direction>();
		RuleTest rule = targetBlockState.target;
		if(rule.test(level.getBlockState(origin.north()), source)) {
			availableDirections.add(Direction.SOUTH);
		}
		if(rule.test(level.getBlockState(origin.south()), source)) {
			availableDirections.add(Direction.NORTH);
		}
		if(rule.test(level.getBlockState(origin.west()), source)) {
			availableDirections.add(Direction.EAST);
		}
		if(rule.test(level.getBlockState(origin.east()), source)) {
			availableDirections.add(Direction.WEST);
		}
		if(rule.test(level.getBlockState(origin.above()), source)) {
			availableDirections.add(Direction.DOWN);
		}
		if(rule.test(level.getBlockState(origin.below()), source)) {
			availableDirections.add(Direction.UP);
		}
		if(availableDirections.isEmpty()) {
			return Optional.empty();
		}
		return Optional.ofNullable(availableDirections.get(source.nextIntBetweenInclusive(0, availableDirections.size() - 1)));
	}
}
