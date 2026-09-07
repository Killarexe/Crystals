package github.killarexe.crystals.fabric.generation.data;

import github.killarexe.crystals.fabric.registry.CrystalsModFabricBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public class CrystalsModelProvider extends FabricModelProvider {

  public CrystalsModelProvider(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
    blockStateModelGenerator.createTrivialCube(CrystalsModFabricBlocks.ENRICHED_DIAMOND_ORE);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.DIAMOND_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.LARGE_DIAMOND_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.MEDIUM_DIAMOND_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.SMALL_DIAMOND_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.DIAMOND_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.LARGE_DIAMOND_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.MEDIUM_DIAMOND_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.SMALL_DIAMOND_CRYSTAL);

    blockStateModelGenerator.createTrivialCube(CrystalsModFabricBlocks.ENRICHED_EMERALD_ORE);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.EMERALD_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.LARGE_EMERALD_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.MEDIUM_EMERALD_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.SMALL_EMERALD_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.EMERALD_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.LARGE_EMERALD_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.MEDIUM_EMERALD_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.SMALL_EMERALD_CRYSTAL);

    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.GLOWSTONE_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.LARGE_GLOWSTONE_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.MEDIUM_GLOWSTONE_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.SMALL_GLOWSTONE_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.GLOWSTONE_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.LARGE_GLOWSTONE_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.MEDIUM_GLOWSTONE_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.SMALL_GLOWSTONE_CRYSTAL);

    blockStateModelGenerator.createTrivialCube(CrystalsModFabricBlocks.ENRICHED_LAPIS_ORE);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.LAPIS_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.LARGE_LAPIS_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.MEDIUM_LAPIS_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.SMALL_LAPIS_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.LAPIS_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.LARGE_LAPIS_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.MEDIUM_LAPIS_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.SMALL_LAPIS_CRYSTAL);

    blockStateModelGenerator.createTrivialCube(CrystalsModFabricBlocks.ENRICHED_REDSTONE_ORE);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.REDSTONE_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.LARGE_REDSTONE_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.MEDIUM_REDSTONE_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.SMALL_REDSTONE_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.REDSTONE_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.LARGE_REDSTONE_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.MEDIUM_REDSTONE_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.SMALL_REDSTONE_CRYSTAL);

    blockStateModelGenerator.createTrivialCube(CrystalsModFabricBlocks.ENRICHED_NETHER_QUARTZ_ORE);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.QUARTZ_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.LARGE_QUARTZ_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.MEDIUM_QUARTZ_CRYSTAL);
    blockStateModelGenerator.createAmethystCluster(CrystalsModFabricBlocks.SMALL_QUARTZ_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.QUARTZ_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.LARGE_QUARTZ_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.MEDIUM_QUARTZ_CRYSTAL);
    blockStateModelGenerator.registerSimpleFlatItemModel(CrystalsModFabricBlocks.SMALL_QUARTZ_CRYSTAL);
  }

  @Override
  public void generateItemModels(ItemModelGenerators itemModelGenerator) {
  }
}
