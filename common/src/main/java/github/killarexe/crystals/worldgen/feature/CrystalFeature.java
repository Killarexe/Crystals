package github.killarexe.crystals.worldgen.feature;

import com.mojang.serialization.Codec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration.TargetBlockState;

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
		
		//FIXME: Needs optimization...
		return
				tryPlace(targetBlockState, origin, origin.north(), Direction.SOUTH, random, level) ||
				tryPlace(targetBlockState, origin, origin.south(), Direction.NORTH, random, level) ||
				tryPlace(targetBlockState, origin, origin.west(), Direction.EAST, random, level) ||
				tryPlace(targetBlockState, origin, origin.east(), Direction.WEST, random, level) ||
				tryPlace(targetBlockState, origin, origin.above(), Direction.DOWN, random, level) ||
				tryPlace(targetBlockState, origin, origin.below(), Direction.UP, random, level);
	}
	
	private boolean tryPlace(TargetBlockState targetBlockState, BlockPos origin, BlockPos pos, Direction direction, RandomSource random, WorldGenLevel level) {
		BlockState blockState = level.getBlockState(pos);
		if(targetBlockState.target.test(blockState, random)) {
			try {
				level.setBlock(origin, targetBlockState.state.trySetValue(BlockStateProperties.FACING, direction), Block.UPDATE_ALL_IMMEDIATE);
			}catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		return false;
	}
}
