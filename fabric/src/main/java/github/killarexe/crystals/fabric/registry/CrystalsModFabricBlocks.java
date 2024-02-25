package github.killarexe.crystals.fabric.registry;

import java.util.HashMap;

import github.killarexe.crystals.CrystalsMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class CrystalsModFabricBlocks {
	public static final HashMap<String, Block> BLOCKS = new HashMap<String, Block>();
	
	public static final Block DIAMOND_CRYSTAL = createBlock("diamond_crystal");
	public static final Block EMERALD_CRYSTAL = createBlock("emerald_crystal");
	public static final Block LAPIS_CRYSTAL = createBlock("lapis_crystal");
	public static final Block REDSTONE_CRYSTAL = createBlock("redstone_crystal");
	public static final Block GLOWSTONE_CRYSTAL = createBlock("glowstone_crystal");
	
	private static Block createBlock(String id) {
		Block block = new AmethystClusterBlock(5, 3, FabricBlockSettings.copyOf(Blocks.LARGE_AMETHYST_BUD));
		BLOCKS.put(id, block);
		return block;
	}
	
	public static void register() {
		BLOCKS.forEach((id, block) -> {
			Registry.register(BuiltInRegistries.BLOCK, CrystalsMod.id(id), block);
		});
	}
}
