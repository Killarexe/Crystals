package github.killarexe.crystals.fabric.registry;

import java.util.HashMap;

import github.killarexe.crystals.CrystalsMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CrystalsModFabricBlocks {
	public static final HashMap<String, Block> BLOCKS = new HashMap<>();
	
	public static final Block DIAMOND_CRYSTAL = createBlock("diamond_crystal");
	public static final Block EMERALD_CRYSTAL = createBlock("emerald_crystal");
	public static final Block LAPIS_CRYSTAL = createBlock("lapis_crystal");
	public static final Block REDSTONE_CRYSTAL = createBlock("redstone_crystal");
	public static final Block GLOWSTONE_CRYSTAL = createBlock("glowstone_crystal");
	public static final Block QUARTZ_CRYSTAL = createBlock("quartz_crystal");

	private static Block createBlock(String id) {
		Block block = new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops());
		BLOCKS.put(id, block);
		return block;
	}
	
	public static void register() {
		BLOCKS.forEach((id, block) -> {
			Registry.register(BuiltInRegistries.BLOCK, CrystalsMod.id(id), block);
		});
	}
}
