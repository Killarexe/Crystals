package github.killarexe.crystals.fabric.generation.data;

import github.killarexe.crystals.fabric.registry.CrystalsModFabricBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class CrystalsLootTableProvider extends FabricBlockLootTableProvider {

  protected CrystalsLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
    super(dataOutput, registryLookup);
  }

  @Override
  public void generate() {
    add(CrystalsModFabricBlocks.ENRICHED_DIAMOND_ORE, createOreDrop(CrystalsModFabricBlocks.ENRICHED_DIAMOND_ORE, Items.DIAMOND));
    add(CrystalsModFabricBlocks.DIAMOND_CRYSTAL, createOreDrop(CrystalsModFabricBlocks.DIAMOND_CRYSTAL, Items.DIAMOND));
    add(CrystalsModFabricBlocks.ENRICHED_EMERALD_ORE, createOreDrop(CrystalsModFabricBlocks.ENRICHED_EMERALD_ORE, Items.EMERALD));
    add(CrystalsModFabricBlocks.EMERALD_CRYSTAL, createOreDrop(CrystalsModFabricBlocks.EMERALD_CRYSTAL, Items.EMERALD));
    add(CrystalsModFabricBlocks.ENRICHED_LAPIS_ORE, createOreDrop(CrystalsModFabricBlocks.ENRICHED_LAPIS_ORE, Items.LAPIS_LAZULI));
    add(CrystalsModFabricBlocks.LAPIS_CRYSTAL, createOreDrop(CrystalsModFabricBlocks.LAPIS_CRYSTAL, Items.LAPIS_LAZULI));
    add(CrystalsModFabricBlocks.GLOWSTONE_CRYSTAL, createOreDrop(CrystalsModFabricBlocks.GLOWSTONE_CRYSTAL, Items.GLOWSTONE_DUST));
    add(CrystalsModFabricBlocks.ENRICHED_REDSTONE_ORE, createOreDrop(CrystalsModFabricBlocks.ENRICHED_REDSTONE_ORE, Items.REDSTONE));
    add(CrystalsModFabricBlocks.REDSTONE_CRYSTAL, createOreDrop(CrystalsModFabricBlocks.REDSTONE_CRYSTAL, Items.REDSTONE));
    add(CrystalsModFabricBlocks.ENRICHED_NETHER_QUARTZ_ORE, createOreDrop(CrystalsModFabricBlocks.ENRICHED_NETHER_QUARTZ_ORE, Items.QUARTZ));
    add(CrystalsModFabricBlocks.QUARTZ_CRYSTAL, createOreDrop(CrystalsModFabricBlocks.QUARTZ_CRYSTAL, Items.QUARTZ));
  }

}
