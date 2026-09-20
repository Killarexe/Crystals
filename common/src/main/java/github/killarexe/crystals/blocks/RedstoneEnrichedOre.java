package github.killarexe.crystals.blocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class RedstoneEnrichedOre extends EnrichedOre {

  public static final MapCodec<RedstoneEnrichedOre> CODEC = simpleCodec(RedstoneEnrichedOre::new);
  public static final BooleanProperty LIT = BlockStateProperties.LIT;

  public RedstoneEnrichedOre(Properties properties) {
    super(properties, Blocks.REDSTONE_ORE, 1.0f / 128.0f);
    registerDefaultState(defaultBlockState().setValue(LIT, false));
  }

  @Override
  protected void attack(BlockState blockState, Level level, BlockPos blockPos, Player player) {
    interact(blockState, level, blockPos);
    super.attack(blockState, level, blockPos, player);
  }

  @Override
  public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
    if (!entity.isSteppingCarefully()) {
      interact(blockState, level, blockPos);
    }
    super.stepOn(level, blockPos, blockState, entity);
  }

  @Override
  protected @NotNull InteractionResult useItemOn(ItemStack itemStack, BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
    if (level.isClientSide()) {
      spawnParticles(level, blockPos);
    } else {
      interact(blockState, level, blockPos);
    }

    if (!(itemStack.getItem() instanceof BlockItem)) {
      return InteractionResult.SUCCESS;
    }

    BlockPlaceContext context = new BlockPlaceContext(player, interactionHand, itemStack, blockHitResult);
    if (!context.canPlace()) {
      return InteractionResult.SUCCESS;
    }

    return InteractionResult.PASS;
  }

  @Override
  protected void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
    if (blockState.getValue(LIT)) {
      serverLevel.setBlock(blockPos, blockState.setValue(LIT, false), Block.UPDATE_ALL);
    }
  }

  @Override
  protected void spawnAfterBreak(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, ItemStack itemStack, boolean bl) {
    super.spawnAfterBreak(blockState, serverLevel, blockPos, itemStack, bl);
    if (bl) {
      tryDropExperience(serverLevel, blockPos, itemStack, UniformInt.of(1, 5));
    }
  }

  @Override
  public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource randomSource) {
    if (blockState.getValue(LIT)) {
      spawnParticles(level, blockPos);
    }
  }

  @Override
  protected boolean isRandomlyTicking(BlockState blockState) {
    return blockState.getValue(LIT);
  }

  @Override
  protected @NotNull MapCodec<? extends Block> codec() {
    return CODEC;
  }

  @Override
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    builder.add(LIT);
  }

  private static void interact(BlockState blockState, Level level, BlockPos blockPos) {
    spawnParticles(level, blockPos);
    if (!blockState.getValue(LIT)) {
      level.setBlock(blockPos, blockState.setValue(LIT, true), 3);
    }
  }

  private static void spawnParticles(Level level, BlockPos blockPos) {
    RandomSource randomSource = level.random;
    for(Direction direction : Direction.values()) {

      BlockPos blockPos2 = blockPos.relative(direction);
      if (!level.getBlockState(blockPos2).isSolidRender()) {
        Direction.Axis axis = direction.getAxis();
        double offset_x = axis == Direction.Axis.X ? 0.5F + 0.5625F * direction.getStepX() : randomSource.nextFloat();
        double offset_y = axis == Direction.Axis.Y ? 0.5F + 0.5625F * direction.getStepY() : randomSource.nextFloat();
        double offset_z = axis == Direction.Axis.Z ? 0.5F + 0.5625F * direction.getStepZ() : randomSource.nextFloat();
        level.addParticle(
          DustParticleOptions.REDSTONE,
          blockPos.getX() + offset_x, blockPos.getY() + offset_y, blockPos.getZ() + offset_z,
          0.0F, 0.0F, 0.0F
        );
      }
    }
  }
}
