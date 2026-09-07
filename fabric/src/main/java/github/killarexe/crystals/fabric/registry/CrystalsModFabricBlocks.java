package github.killarexe.crystals.fabric.registry;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

import github.killarexe.crystals.CrystalsMod;
import github.killarexe.crystals.blocks.EnrichedOre;
import github.killarexe.crystals.blocks.RedstoneClusterBlock;
import github.killarexe.crystals.blocks.RedstoneEnrichedOre;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CrystalsModFabricBlocks {
	public static final HashMap<String, Block> BLOCKS = new HashMap<>();

	public static final Block SMALL_DIAMOND_CRYSTAL = createBlock(
			"small_diamond_crystal",
			properties -> new AmethystClusterBlock(3, 8, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.SMALL_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block MEDIUM_DIAMOND_CRYSTAL = createBlock(
			"medium_diamond_crystal",
			properties -> new AmethystClusterBlock(4, 10, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.MEDIUM_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block LARGE_DIAMOND_CRYSTAL = createBlock(
			"large_diamond_crystal",
			properties -> new AmethystClusterBlock(5, 10, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block DIAMOND_CRYSTAL = createBlock(
			"diamond_crystal",
			properties -> new AmethystClusterBlock(7, 10, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_CLUSTER).requiresCorrectToolForDrops()
	);

	public static final Block SMALL_EMERALD_CRYSTAL = createBlock(
			"small_emerald_crystal",
			properties -> new AmethystClusterBlock(3, 8, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.SMALL_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block MEDIUM_EMERALD_CRYSTAL = createBlock(
			"medium_emerald_crystal",
			properties -> new AmethystClusterBlock(4, 10, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.MEDIUM_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block LARGE_EMERALD_CRYSTAL = createBlock(
			"large_emerald_crystal",
			properties -> new AmethystClusterBlock(5, 10, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block EMERALD_CRYSTAL = createBlock(
			"emerald_crystal",
			properties -> new AmethystClusterBlock(7, 10, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);

	public static final Block SMALL_LAPIS_CRYSTAL = createBlock(
					"small_lapis_crystal",
					properties -> new AmethystClusterBlock(3, 8, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.SMALL_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block MEDIUM_LAPIS_CRYSTAL = createBlock(
					"medium_lapis_crystal",
					properties -> new AmethystClusterBlock(4, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.MEDIUM_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block LARGE_LAPIS_CRYSTAL = createBlock(
					"large_lapis_crystal",
					properties -> new AmethystClusterBlock(5, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block LAPIS_CRYSTAL = createBlock(
			"lapis_crystal",
			properties -> new AmethystClusterBlock(7, 10, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);

	public static final Block SMALL_REDSTONE_CRYSTAL = createBlock(
					"small_redstone_crystal",
					properties -> new AmethystClusterBlock(3, 8, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.SMALL_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block MEDIUM_REDSTONE_CRYSTAL = createBlock(
					"medium_redstone_crystal",
					properties -> new AmethystClusterBlock(4, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.MEDIUM_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block LARGE_REDSTONE_CRYSTAL = createBlock(
					"large_redstone_crystal",
					properties -> new AmethystClusterBlock(5, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block REDSTONE_CRYSTAL = createBlock(
			"redstone_crystal",
			properties -> new RedstoneClusterBlock(7, 10, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);

	public static final Block SMALL_GLOWSTONE_CRYSTAL = createBlock(
					"small_glowstone_crystal",
					properties -> new AmethystClusterBlock(3, 8, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.SMALL_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block MEDIUM_GLOWSTONE_CRYSTAL = createBlock(
					"medium_glowstone_crystal",
					properties -> new AmethystClusterBlock(4, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.MEDIUM_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block LARGE_GLOWSTONE_CRYSTAL = createBlock(
					"large_glowstone_crystal",
					properties -> new AmethystClusterBlock(5, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block GLOWSTONE_CRYSTAL = createBlock(
			"glowstone_crystal",
			properties -> new AmethystClusterBlock(7, 10, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).lightLevel(_state -> 10).requiresCorrectToolForDrops()
	);

	public static final Block SMALL_QUARTZ_CRYSTAL = createBlock(
					"small_quartz_crystal",
					properties -> new AmethystClusterBlock(3, 8, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.SMALL_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block MEDIUM_QUARTZ_CRYSTAL = createBlock(
					"medium_quartz_crystal",
					properties -> new AmethystClusterBlock(4, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.MEDIUM_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block LARGE_QUARTZ_CRYSTAL = createBlock(
					"large_quartz_crystal",
					properties -> new AmethystClusterBlock(5, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Block QUARTZ_CRYSTAL = createBlock(
			"quartz_crystal",
			properties -> new AmethystClusterBlock(7, 10, properties),
			BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);

	//TODO: Balance values
  public static final Block ENRICHED_DIAMOND_ORE = createBlock(
      "enriched_diamond_ore",
			properties -> new EnrichedOre(properties, Blocks.DIAMOND_ORE, 1.0f / 4.0f),
      BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).randomTicks()
  );
	public static final Block ENRICHED_EMERALD_ORE = createBlock(
					"enriched_emerald_ore",
					properties -> new EnrichedOre(properties, Blocks.EMERALD_ORE, 1.0f / 4.0f),
					BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE).randomTicks()
	);
	public static final Block ENRICHED_LAPIS_ORE = createBlock(
					"enriched_lapis_ore",
					properties -> new EnrichedOre(properties, Blocks.LAPIS_ORE, 1.0f / 4.0f),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_ORE).randomTicks()
	);
	public static final Block ENRICHED_REDSTONE_ORE = createBlock(
					"enriched_redstone_ore",
					properties -> new RedstoneEnrichedOre(properties, Blocks.REDSTONE_ORE, 1.0f / 4.0f),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_ORE).randomTicks()
	);
	public static final Block ENRICHED_NETHER_QUARTZ_ORE = createBlock(
					"enriched_nether_quartz_ore",
					properties -> new EnrichedOre(properties, Blocks.NETHER_QUARTZ_ORE, 1.0f / 4.0f),
					BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE).randomTicks()
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

		//TODO: Balance values
		EnrichedOre.putCrystallisation(
						ENRICHED_DIAMOND_ORE,
						List.of(Blocks.AIR, SMALL_DIAMOND_CRYSTAL, MEDIUM_DIAMOND_CRYSTAL, LARGE_DIAMOND_CRYSTAL, DIAMOND_CRYSTAL),
						List.of(0.10f, 0.10f, 0.10f, 0.10f)
		);
		EnrichedOre.putCrystallisation(
						ENRICHED_EMERALD_ORE,
						List.of(Blocks.AIR, SMALL_EMERALD_CRYSTAL, MEDIUM_EMERALD_CRYSTAL, LARGE_EMERALD_CRYSTAL, EMERALD_CRYSTAL),
						List.of(0.10f, 0.10f, 0.10f, 0.10f)
		);
		EnrichedOre.putCrystallisation(
						ENRICHED_LAPIS_ORE,
						List.of(Blocks.AIR, SMALL_LAPIS_CRYSTAL, MEDIUM_LAPIS_CRYSTAL, LARGE_LAPIS_CRYSTAL, LAPIS_CRYSTAL),
						List.of(0.10f, 0.10f, 0.10f, 0.10f)
		);
		EnrichedOre.putCrystallisation(
						ENRICHED_REDSTONE_ORE,
						List.of(Blocks.AIR, SMALL_REDSTONE_CRYSTAL, MEDIUM_REDSTONE_CRYSTAL, LARGE_REDSTONE_CRYSTAL, REDSTONE_CRYSTAL),
						List.of(0.10f, 0.10f, 0.10f, 0.10f)
		);
		EnrichedOre.putCrystallisation(
						ENRICHED_NETHER_QUARTZ_ORE,
						List.of(Blocks.AIR, SMALL_QUARTZ_CRYSTAL, MEDIUM_QUARTZ_CRYSTAL, LARGE_QUARTZ_CRYSTAL, QUARTZ_CRYSTAL),
						List.of(0.10f, 0.10f, 0.10f, 0.10f)
		);
	}
}
