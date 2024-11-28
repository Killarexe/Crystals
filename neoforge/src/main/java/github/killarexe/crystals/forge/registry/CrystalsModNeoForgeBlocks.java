package github.killarexe.crystals.forge.registry;

import github.killarexe.crystals.CrystalsMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class CrystalsModNeoForgeBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, CrystalsMod.MOD_ID);
	
	public static final Supplier<Block> DIAMOND_CRYSTAL = createBlock(
			"diamond_crystal",
			properties -> () -> new AmethystClusterBlock(5, 3, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD)
	);
	public static final Supplier<Block> EMERALD_CRYSTAL = createBlock(
			"emerald_crystal",
			properties -> () -> new AmethystClusterBlock(5, 3, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD)
	);
	public static final Supplier<Block> LAPIS_CRYSTAL = createBlock(
			"lapis_crystal",
			properties -> () -> new AmethystClusterBlock(5, 3, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD)
	);
	public static final Supplier<Block> REDSTONE_CRYSTAL = createBlock(
			"redstone_crystal",
			properties -> () -> new AmethystClusterBlock(5, 3, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD)
	);
	public static final Supplier<Block> GLOWSTONE_CRYSTAL = createBlock(
			"glowstone_crystal",
			properties -> () -> new AmethystClusterBlock(5, 3, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).lightLevel(_state -> 10)
	);
	public static final Supplier<Block> QUARTZ_CRYSTAL = createBlock(
			"quartz_crystal",
			properties -> () -> new AmethystClusterBlock(5, 3, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD)
	);

	private static <T extends Block> Supplier<T> createBlock(String id, Function<BlockBehaviour.Properties, Supplier<T>> function, BlockBehaviour.Properties properties) {
		ResourceKey<Block> blockId = ResourceKey.create(Registries.BLOCK, CrystalsMod.id(id));
		Supplier<T> block = function.apply(properties.setId(blockId));
		return BLOCKS.register(id, block);
	}
}
