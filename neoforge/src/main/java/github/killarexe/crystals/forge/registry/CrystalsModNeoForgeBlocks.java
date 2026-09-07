package github.killarexe.crystals.forge.registry;

import github.killarexe.crystals.CrystalsMod;
import github.killarexe.crystals.blocks.EnrichedOre;
import github.killarexe.crystals.blocks.RedstoneClusterBlock;
import github.killarexe.crystals.blocks.RedstoneEnrichedOre;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class CrystalsModNeoForgeBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, CrystalsMod.MOD_ID);

	public static final Supplier<Block> SMALL_DIAMOND_CRYSTAL = createBlock(
					"small_diamond_crystal",
					properties -> () -> new AmethystClusterBlock(3, 8, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.SMALL_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> MEDIUM_DIAMOND_CRYSTAL = createBlock(
					"medium_diamond_crystal",
					properties -> () -> new AmethystClusterBlock(4, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.MEDIUM_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> LARGE_DIAMOND_CRYSTAL = createBlock(
					"large_diamond_crystal",
					properties -> () -> new AmethystClusterBlock(5, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> DIAMOND_CRYSTAL = createBlock(
					"diamond_crystal",
					properties -> () -> new AmethystClusterBlock(7, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_CLUSTER).requiresCorrectToolForDrops()
	);

	public static final Supplier<Block> SMALL_EMERALD_CRYSTAL = createBlock(
					"small_emerald_crystal",
					properties -> () -> new AmethystClusterBlock(3, 8, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.SMALL_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> MEDIUM_EMERALD_CRYSTAL = createBlock(
					"medium_emerald_crystal",
					properties -> () -> new AmethystClusterBlock(4, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.MEDIUM_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> LARGE_EMERALD_CRYSTAL = createBlock(
					"large_emerald_crystal",
					properties -> () -> new AmethystClusterBlock(5, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> EMERALD_CRYSTAL = createBlock(
					"emerald_crystal",
					properties -> () -> new AmethystClusterBlock(7, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);

	public static final Supplier<Block> SMALL_LAPIS_CRYSTAL = createBlock(
					"small_lapis_crystal",
					properties -> () -> new AmethystClusterBlock(3, 8, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.SMALL_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> MEDIUM_LAPIS_CRYSTAL = createBlock(
					"medium_lapis_crystal",
					properties -> () -> new AmethystClusterBlock(4, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.MEDIUM_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> LARGE_LAPIS_CRYSTAL = createBlock(
					"large_lapis_crystal",
					properties -> () -> new AmethystClusterBlock(5, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> LAPIS_CRYSTAL = createBlock(
					"lapis_crystal",
					properties -> () -> new AmethystClusterBlock(7, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);

	public static final Supplier<Block> SMALL_REDSTONE_CRYSTAL = createBlock(
					"small_redstone_crystal",
					properties -> () -> new AmethystClusterBlock(3, 8, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.SMALL_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> MEDIUM_REDSTONE_CRYSTAL = createBlock(
					"medium_redstone_crystal",
					properties -> () -> new AmethystClusterBlock(4, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.MEDIUM_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> LARGE_REDSTONE_CRYSTAL = createBlock(
					"large_redstone_crystal",
					properties -> () -> new AmethystClusterBlock(5, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> REDSTONE_CRYSTAL = createBlock(
					"redstone_crystal",
					properties -> () -> new RedstoneClusterBlock(7, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);

	public static final Supplier<Block> SMALL_GLOWSTONE_CRYSTAL = createBlock(
					"small_glowstone_crystal",
					properties -> () -> new AmethystClusterBlock(3, 8, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.SMALL_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> MEDIUM_GLOWSTONE_CRYSTAL = createBlock(
					"medium_glowstone_crystal",
					properties -> () -> new AmethystClusterBlock(4, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.MEDIUM_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> LARGE_GLOWSTONE_CRYSTAL = createBlock(
					"large_glowstone_crystal",
					properties -> () -> new AmethystClusterBlock(5, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> GLOWSTONE_CRYSTAL = createBlock(
					"glowstone_crystal",
					properties -> () -> new AmethystClusterBlock(7, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).lightLevel(_state -> 10).requiresCorrectToolForDrops()
	);

	public static final Supplier<Block> SMALL_QUARTZ_CRYSTAL = createBlock(
					"small_quartz_crystal",
					properties -> () -> new AmethystClusterBlock(3, 8, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.SMALL_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> MEDIUM_QUARTZ_CRYSTAL = createBlock(
					"medium_quartz_crystal",
					properties -> () -> new AmethystClusterBlock(4, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.MEDIUM_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> LARGE_QUARTZ_CRYSTAL = createBlock(
					"large_quartz_crystal",
					properties -> () -> new AmethystClusterBlock(5, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);
	public static final Supplier<Block> QUARTZ_CRYSTAL = createBlock(
					"quartz_crystal",
					properties -> () -> new AmethystClusterBlock(7, 10, properties),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD).requiresCorrectToolForDrops()
	);

	//TODO: Balance values
	public static final Supplier<Block> ENRICHED_DIAMOND_ORE = createBlock(
					"enriched_diamond_ore",
					properties -> () -> new EnrichedOre(properties, Blocks.DIAMOND_ORE, 1.0f / 32.0f),
					BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).randomTicks()
	);
	public static final Supplier<Block> ENRICHED_EMERALD_ORE = createBlock(
					"enriched_emerald_ore",
					properties -> () -> new EnrichedOre(properties, Blocks.EMERALD_ORE, 1.0f / 32.0f),
					BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE).randomTicks()
	);
	public static final Supplier<Block> ENRICHED_LAPIS_ORE = createBlock(
					"enriched_lapis_ore",
					properties -> () -> new EnrichedOre(properties, Blocks.LAPIS_ORE, 1.0f / 32.0f),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_ORE).randomTicks()
	);
	public static final Supplier<Block> ENRICHED_REDSTONE_ORE = createBlock(
					"enriched_redstone_ore",
					properties -> () -> new RedstoneEnrichedOre(properties, Blocks.REDSTONE_ORE, 1.0f / 32.0f),
					BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_ORE).randomTicks()
	);
	public static final Supplier<Block> ENRICHED_NETHER_QUARTZ_ORE = createBlock(
					"enriched_nether_quartz_ore",
					properties -> () -> new EnrichedOre(properties, Blocks.NETHER_QUARTZ_ORE, 1.0f / 32.0f),
					BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE).randomTicks()
	);

	private static <T extends Block> Supplier<T> createBlock(String id, Function<BlockBehaviour.Properties, Supplier<T>> function, BlockBehaviour.Properties properties) {
		ResourceKey<Block> blockId = ResourceKey.create(Registries.BLOCK, CrystalsMod.id(id));
		Supplier<T> block = function.apply(properties.setId(blockId));
		return BLOCKS.register(id, block);
	}

	private static void commonSetup(final FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			//TODO: Balance values
			EnrichedOre.putCrystallisation(
							ENRICHED_DIAMOND_ORE.get(),
							List.of(Blocks.AIR, SMALL_DIAMOND_CRYSTAL.get(), MEDIUM_DIAMOND_CRYSTAL.get(), LARGE_DIAMOND_CRYSTAL.get(), DIAMOND_CRYSTAL.get()),
							List.of(0.10f, 0.10f, 0.10f, 0.10f)
			);
			EnrichedOre.putCrystallisation(
							ENRICHED_EMERALD_ORE.get(),
							List.of(Blocks.AIR, SMALL_EMERALD_CRYSTAL.get(), MEDIUM_EMERALD_CRYSTAL.get(), LARGE_EMERALD_CRYSTAL.get(), EMERALD_CRYSTAL.get()),
							List.of(0.10f, 0.10f, 0.10f, 0.10f)
			);
			EnrichedOre.putCrystallisation(
							ENRICHED_LAPIS_ORE.get(),
							List.of(Blocks.AIR, SMALL_LAPIS_CRYSTAL.get(), MEDIUM_LAPIS_CRYSTAL.get(), LARGE_LAPIS_CRYSTAL.get(), LAPIS_CRYSTAL.get()),
							List.of(0.10f, 0.10f, 0.10f, 0.10f)
			);
			EnrichedOre.putCrystallisation(
							ENRICHED_REDSTONE_ORE.get(),
							List.of(Blocks.AIR, SMALL_REDSTONE_CRYSTAL.get(), MEDIUM_REDSTONE_CRYSTAL.get(), LARGE_REDSTONE_CRYSTAL.get(), REDSTONE_CRYSTAL.get()),
							List.of(0.10f, 0.10f, 0.10f, 0.10f)
			);
			EnrichedOre.putCrystallisation(
							ENRICHED_NETHER_QUARTZ_ORE.get(),
							List.of(Blocks.AIR, SMALL_QUARTZ_CRYSTAL.get(), MEDIUM_QUARTZ_CRYSTAL.get(), LARGE_QUARTZ_CRYSTAL.get(), QUARTZ_CRYSTAL.get()),
							List.of(0.10f, 0.10f, 0.10f, 0.10f)
			);
		});
	}

	public static void register(IEventBus bus) {
		BLOCKS.register(bus);
		bus.addListener(CrystalsModNeoForgeBlocks::commonSetup);
	}
}
