package github.killarexe.crystals.fabric.registry;

import java.util.HashMap;
import java.util.function.Function;

import github.killarexe.crystals.CrystalsMod;
import github.killarexe.crystals.blocks.RedstoneClusterBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CrystalsModFabricBlocks {
	public static final HashMap<String, Block> BLOCKS = new HashMap<String, Block>();
	
	public static final Block DIAMOND_CRYSTAL = createBlock(
			"diamond_crystal",
			properties -> new AmethystClusterBlock(5, 3, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block EMERALD_CRYSTAL = createBlock(
			"emerald_crystal",
			properties -> new AmethystClusterBlock(5, 3, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block LAPIS_CRYSTAL = createBlock(
			"lapis_crystal",
			properties -> new AmethystClusterBlock(5, 3, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block REDSTONE_CRYSTAL = createBlock(
			"redstone_crystal",
			properties -> new RedstoneClusterBlock(5, 3, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block GLOWSTONE_CRYSTAL = createBlock(
			"glowstone_crystal",
			properties -> new AmethystClusterBlock(5, 3, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).lightLevel(_state -> 10).requiresCorrectToolForDrops()
	);
	public static final Block QUARTZ_CRYSTAL = createBlock(
			"quartz_crystal",
			properties -> new AmethystClusterBlock(5, 3, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);

	private static Block createBlock(String id, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties properties) {
		ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, CrystalsMod.id(id));
		Block block = function.apply(properties.setId(blockKey));
		BLOCKS.put(id, block);
		return block;
	}
	
	public static void register() {
		BLOCKS.forEach((id, block) -> {
			Registry.register(BuiltInRegistries.BLOCK, CrystalsMod.id(id), block);
		});
	}
}
