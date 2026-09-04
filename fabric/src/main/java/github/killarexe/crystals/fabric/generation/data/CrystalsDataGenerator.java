package github.killarexe.crystals.fabric.generation.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CrystalsDataGenerator implements DataGeneratorEntrypoint {
  @Override
  public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
    FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
    pack.addProvider(CrystalsEnUsLangProvider::new);
    pack.addProvider(CrystalsLootTableProvider::new);
    pack.addProvider(CrystalsModelProvider::new);
    pack.addProvider(CrystalsTagsProvider::new);
  }
}
