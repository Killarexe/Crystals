package github.killarexe.crystals.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PointedDripstoneBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;

import java.util.Optional;

public class EnrichedOre extends Block {

  protected Block spawnBlock;

  public EnrichedOre(Properties properties, Block spawnBlock) {
    super(properties);
    this.spawnBlock = spawnBlock;
  }

  @Override
  protected void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
    Optional<BlockPos> stactitePosition = Optional.ofNullable(PointedDripstoneBlock.findStalactiteTipAboveCauldron(serverLevel, blockPos));
    stactitePosition.ifPresent((position) -> {
      Fluid fluid = PointedDripstoneBlock.getCauldronFillFluidType(serverLevel, position);
      BlockPos above = blockPos.above();
      if (fluid == Fluids.WATER || fluid == Fluids.FLOWING_WATER && serverLevel.getBlockState(above).isAir()) {
        serverLevel.setBlock(above, spawnBlock.defaultBlockState(), Block.UPDATE_ALL);
      }
    });
    super.randomTick(blockState, serverLevel, blockPos, randomSource);
  }
}
