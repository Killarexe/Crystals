package github.killarexe.crystals.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.state.BlockState;

public class RedstoneClusterBlock extends AmethystClusterBlock {

    public RedstoneClusterBlock(float f, float g, Properties properties) {
        super(f, g, properties);
    }

    @Override
    protected int getSignal(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, Direction direction) {
        return 4;
    }
}
