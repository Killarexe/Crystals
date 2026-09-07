package github.killarexe.crystals.fabric.generation.data;

import github.killarexe.crystals.CrystalsMod;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CrystalsDataGenerator implements DataGeneratorEntrypoint {
  @Override
  public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
    FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
    CrystalsMod.LOGGER.info("Crystals Generating Lang en_us...");
    pack.addProvider(CrystalsEnUsLangProvider::new);
    CrystalsMod.LOGGER.info("Crystals Generating Loot Table...");
    pack.addProvider(CrystalsLootTableProvider::new);
    CrystalsMod.LOGGER.info("Crystals Generating Models...");
    pack.addProvider(CrystalsModelProvider::new);
    CrystalsMod.LOGGER.info("Crystals Generating Tags...");
    pack.addProvider(CrystalsTagsProvider::new);
  }
}
