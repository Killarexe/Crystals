package github.killarexe.crystals.fabric.generation.data;

import github.killarexe.crystals.fabric.registry.CrystalsModFabricBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class CrystalsTagsProvider extends FabricTagProvider.BlockTagProvider {

  public CrystalsTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected void addTags(HolderLookup.Provider wrapperLookup) {
    valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(CrystalsModFabricBlocks.ENRICHED_DIAMOND_ORE)
            .add(CrystalsModFabricBlocks.DIAMOND_CRYSTAL)
            .add(CrystalsModFabricBlocks.LARGE_DIAMOND_CRYSTAL)
            .add(CrystalsModFabricBlocks.MEDIUM_DIAMOND_CRYSTAL)
            .add(CrystalsModFabricBlocks.SMALL_DIAMOND_CRYSTAL)
            .add(CrystalsModFabricBlocks.ENRICHED_EMERALD_ORE)
            .add(CrystalsModFabricBlocks.EMERALD_CRYSTAL)
            .add(CrystalsModFabricBlocks.LARGE_EMERALD_CRYSTAL)
            .add(CrystalsModFabricBlocks.MEDIUM_EMERALD_CRYSTAL)
            .add(CrystalsModFabricBlocks.SMALL_EMERALD_CRYSTAL)
            .add(CrystalsModFabricBlocks.ENRICHED_LAPIS_ORE)
            .add(CrystalsModFabricBlocks.LAPIS_CRYSTAL)
            .add(CrystalsModFabricBlocks.LARGE_LAPIS_CRYSTAL)
            .add(CrystalsModFabricBlocks.MEDIUM_LAPIS_CRYSTAL)
            .add(CrystalsModFabricBlocks.SMALL_LAPIS_CRYSTAL)
            .add(CrystalsModFabricBlocks.GLOWSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.LARGE_GLOWSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.MEDIUM_GLOWSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.SMALL_GLOWSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.ENRICHED_REDSTONE_ORE)
            .add(CrystalsModFabricBlocks.REDSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.LARGE_REDSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.MEDIUM_REDSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.SMALL_REDSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.ENRICHED_QUARTZ_ORE)
            .add(CrystalsModFabricBlocks.QUARTZ_CRYSTAL)
            .add(CrystalsModFabricBlocks.LARGE_QUARTZ_CRYSTAL)
            .add(CrystalsModFabricBlocks.MEDIUM_QUARTZ_CRYSTAL)
            .add(CrystalsModFabricBlocks.SMALL_QUARTZ_CRYSTAL);

    valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
            .add(CrystalsModFabricBlocks.ENRICHED_DIAMOND_ORE)
            .add(CrystalsModFabricBlocks.DIAMOND_CRYSTAL)
            .add(CrystalsModFabricBlocks.LARGE_DIAMOND_CRYSTAL)
            .add(CrystalsModFabricBlocks.MEDIUM_DIAMOND_CRYSTAL)
            .add(CrystalsModFabricBlocks.SMALL_DIAMOND_CRYSTAL)
            .add(CrystalsModFabricBlocks.ENRICHED_EMERALD_ORE)
            .add(CrystalsModFabricBlocks.EMERALD_CRYSTAL)
            .add(CrystalsModFabricBlocks.LARGE_EMERALD_CRYSTAL)
            .add(CrystalsModFabricBlocks.MEDIUM_EMERALD_CRYSTAL)
            .add(CrystalsModFabricBlocks.SMALL_EMERALD_CRYSTAL)
            .add(CrystalsModFabricBlocks.ENRICHED_LAPIS_ORE)
            .add(CrystalsModFabricBlocks.LAPIS_CRYSTAL)
            .add(CrystalsModFabricBlocks.LARGE_LAPIS_CRYSTAL)
            .add(CrystalsModFabricBlocks.MEDIUM_LAPIS_CRYSTAL)
            .add(CrystalsModFabricBlocks.SMALL_LAPIS_CRYSTAL)
            .add(CrystalsModFabricBlocks.GLOWSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.LARGE_GLOWSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.MEDIUM_GLOWSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.SMALL_GLOWSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.ENRICHED_REDSTONE_ORE)
            .add(CrystalsModFabricBlocks.REDSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.LARGE_REDSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.MEDIUM_REDSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.SMALL_REDSTONE_CRYSTAL)
            .add(CrystalsModFabricBlocks.ENRICHED_QUARTZ_ORE)
            .add(CrystalsModFabricBlocks.QUARTZ_CRYSTAL)
            .add(CrystalsModFabricBlocks.LARGE_QUARTZ_CRYSTAL)
            .add(CrystalsModFabricBlocks.MEDIUM_QUARTZ_CRYSTAL)
            .add(CrystalsModFabricBlocks.SMALL_QUARTZ_CRYSTAL);
  }
}
