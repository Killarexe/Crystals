package github.killarexe.crystals.fabric.generation.data;

import github.killarexe.crystals.fabric.registry.CrystalsModFabricBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class CrystalsEnUsLangProvider extends FabricLanguageProvider {
  protected CrystalsEnUsLangProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
    super(dataOutput, "en_us", registryLookup);
  }

  @Override
  public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
    translationBuilder.add(CrystalsModFabricBlocks.ENRICHED_DIAMOND_ORE.asItem(), "Enriched Diamond Ore");
    translationBuilder.add(CrystalsModFabricBlocks.DIAMOND_CRYSTAL.asItem(), "Diamond Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.LARGE_DIAMOND_CRYSTAL.asItem(), "Large Diamond Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.MEDIUM_DIAMOND_CRYSTAL.asItem(), "Medium Diamond Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.SMALL_DIAMOND_CRYSTAL.asItem(), "Small Diamond Crystal");

    translationBuilder.add(CrystalsModFabricBlocks.ENRICHED_EMERALD_ORE.asItem(), "Enriched Emerald Ore");
    translationBuilder.add(CrystalsModFabricBlocks.EMERALD_CRYSTAL.asItem(), "Emerald Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.LARGE_EMERALD_CRYSTAL.asItem(), "Large Emerald Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.MEDIUM_EMERALD_CRYSTAL.asItem(), "Medium Emerald Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.SMALL_EMERALD_CRYSTAL.asItem(), "Small Emerald Crystal");

    translationBuilder.add(CrystalsModFabricBlocks.ENRICHED_LAPIS_ORE.asItem(), "Enriched Lapis Ore");
    translationBuilder.add(CrystalsModFabricBlocks.LAPIS_CRYSTAL.asItem(), "Lapis Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.LARGE_LAPIS_CRYSTAL.asItem(), "Large Lapis Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.MEDIUM_LAPIS_CRYSTAL.asItem(), "Medium Lapis Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.SMALL_LAPIS_CRYSTAL.asItem(), "Small Lapis Crystal");

    translationBuilder.add(CrystalsModFabricBlocks.GLOWSTONE_CRYSTAL.asItem(), "Glowstone Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.LARGE_GLOWSTONE_CRYSTAL.asItem(), "Large Glowstone Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.MEDIUM_GLOWSTONE_CRYSTAL.asItem(), "Medium Glowstone Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.SMALL_GLOWSTONE_CRYSTAL.asItem(), "Small Glowstone Crystal");

    translationBuilder.add(CrystalsModFabricBlocks.ENRICHED_REDSTONE_ORE.asItem(), "Enriched Redstone Ore");
    translationBuilder.add(CrystalsModFabricBlocks.REDSTONE_CRYSTAL.asItem(), "Redstone Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.LARGE_REDSTONE_CRYSTAL.asItem(), "Large Redstone Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.MEDIUM_REDSTONE_CRYSTAL.asItem(), "Medium Redstone Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.SMALL_REDSTONE_CRYSTAL.asItem(), "Small Redstone Crystal");

    translationBuilder.add(CrystalsModFabricBlocks.ENRICHED_NETHER_QUARTZ_ORE.asItem(), "Enriched Nether Quartz Ore");
    translationBuilder.add(CrystalsModFabricBlocks.QUARTZ_CRYSTAL.asItem(), "Quartz Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.LARGE_QUARTZ_CRYSTAL.asItem(), "Large Quartz Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.MEDIUM_QUARTZ_CRYSTAL.asItem(), "Medium Quartz Crystal");
    translationBuilder.add(CrystalsModFabricBlocks.SMALL_QUARTZ_CRYSTAL.asItem(), "Small Quartz Crystal");
  }
}
