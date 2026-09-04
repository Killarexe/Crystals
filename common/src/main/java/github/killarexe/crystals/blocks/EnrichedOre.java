package github.killarexe.crystals.blocks;

import github.killarexe.crystals.CrystalsMod;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BuddingAmethystBlock;
import net.minecraft.world.level.block.PointedDripstoneBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import oshi.util.tuples.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class EnrichedOre extends Block {

  public static final HashMap<Block, HashMap<Block, Pair<Block, Float>>> CRYSTALLISATION_MAP = new HashMap<>();

  protected final Block oreBlock;
  protected final float oreChance;

  /*
   * If we mine, it will give 1.5x the amount of a normal ore
   * To prevent to be too OP there will be a few constraints:
   * - When the crystal achieved final stage, there will be a small chance that the enriched ore becomes a normal ore or a stone like block.
   */
  public EnrichedOre(Properties properties, Block oreBlock, float oreChance) {
    super(properties);
    this.oreBlock = oreBlock;
    this.oreChance = oreChance;
  }

  @Override
  protected void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
    BlockPos above = blockPos.above();
    Optional<BlockPos> stalactitePosition = Optional.ofNullable(PointedDripstoneBlock.findStalactiteTipAboveCauldron(serverLevel, above));
    if (stalactitePosition.isEmpty()) {
      CrystalsMod.LOGGER.info("No stalactite.");
      return;
    }

    Fluid fluid = PointedDripstoneBlock.getCauldronFillFluidType(serverLevel, stalactitePosition.get());
    if (!(fluid == Fluids.WATER || fluid == Fluids.FLOWING_WATER)) {
      CrystalsMod.LOGGER.info("No water.");
      return;
    }

    Optional<HashMap<Block, Pair<Block, Float>>> crystallisationMap = Optional.ofNullable(CRYSTALLISATION_MAP.get(this));
    if (crystallisationMap.isEmpty()) {
      CrystalsMod.LOGGER.info("No map found.");
      return;
    }

    BlockState aboveState = serverLevel.getBlockState(above);
    if (aboveState.isAir() && !BuddingAmethystBlock.canClusterGrowAtState(aboveState)) {
      CrystalsMod.LOGGER.info("Not enough space to create.");
      return;
    }

    Optional<Pair<Block, Float>> nextBlock = Optional.ofNullable(crystallisationMap.get().get(aboveState.getBlock()));
    if (nextBlock.isEmpty()) {
      CrystalsMod.LOGGER.info("No next block.");
      return;
    }

    Pair<Block, Float> pair = nextBlock.get();
    if (randomSource.nextFloat() > pair.getB()) {
      CrystalsMod.LOGGER.info("No chance.");
      return;
    }

    serverLevel.setBlock(above, pair.getA().defaultBlockState(), Block.UPDATE_ALL);

    if (!crystallisationMap.get().containsKey(aboveState.getBlock()) && randomSource.nextFloat() <= oreChance) {
      serverLevel.setBlock(blockPos, oreBlock.defaultBlockState(), Block.UPDATE_ALL);
    }
  }

  public static void putCrystallisation(Block ore, List<Block> blocks, List<Float> chances) {
    if (blocks.size() != (chances.size() + 1)) {
      return;
    }

    HashMap<Block, Pair<Block, Float>> map = new HashMap<>();
    for (int i = 0; i < chances.size(); i++) {
      map.put(blocks.get(i), new Pair<>(blocks.get(i + 1), chances.get(i)));
    }

    CRYSTALLISATION_MAP.put(ore, map);
  }
}
