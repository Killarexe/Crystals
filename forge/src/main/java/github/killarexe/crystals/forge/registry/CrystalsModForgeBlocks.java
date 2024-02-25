package github.killarexe.crystals.forge.registry;

import github.killarexe.crystals.CrystalsMod;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CrystalsModForgeBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CrystalsMod.MOD_ID);
	
	public static final RegistryObject<Block> DIAMOND_CRYSTAL = BLOCKS.register("diamond_crystal", () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)));
	public static final RegistryObject<Block> EMERALD_CRYSTAL = BLOCKS.register("emerald_crystal", () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)));
	public static final RegistryObject<Block> LAPIS_CRYSTAL = BLOCKS.register("lapis_crystal", () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)));
	public static final RegistryObject<Block> REDSTONE_CRYSTAL = BLOCKS.register("redstone_crystal", () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)));
	public static final RegistryObject<Block> GLOWSTONE_CRYSTAL = BLOCKS.register("glowstone_crystal", () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)));
}
