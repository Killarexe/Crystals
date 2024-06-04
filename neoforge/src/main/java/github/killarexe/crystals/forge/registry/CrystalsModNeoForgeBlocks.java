package github.killarexe.crystals.forge.registry;

import github.killarexe.crystals.CrystalsMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CrystalsModNeoForgeBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, CrystalsMod.MOD_ID);
	
	public static final Supplier<Block> DIAMOND_CRYSTAL = BLOCKS.register("diamond_crystal", () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD)));
	public static final Supplier<Block> EMERALD_CRYSTAL = BLOCKS.register("emerald_crystal", () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD)));
	public static final Supplier<Block> LAPIS_CRYSTAL = BLOCKS.register("lapis_crystal", () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD)));
	public static final Supplier<Block> REDSTONE_CRYSTAL = BLOCKS.register("redstone_crystal", () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD)));
	public static final Supplier<Block> GLOWSTONE_CRYSTAL = BLOCKS.register("glowstone_crystal", () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD)));
	public static final Supplier<Block> QUARTZ_CRYSTAL = BLOCKS.register("quartz_crystal", () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD)));
}
