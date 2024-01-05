package github.killarexe.crystals.fabric.registry;

import github.killarexe.crystals.CrystalsMod;
import github.killarexe.crystals.worldgen.feature.CrystalFeature;
import github.killarexe.crystals.worldgen.feature.CrystalFeatureConfig;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class CrystalsModFabricFeatures {
	
	public static final ResourceKey<PlacedFeature> DIAMOND_CRYSTALS_FEATURE = createKey("diamond_crystals");
	public static final ResourceKey<PlacedFeature> EMERALD_CRYSTALS_FEATURE = createKey("emerald_crystals");
	public static final ResourceKey<PlacedFeature> LAPIS_CRYSTALS_FEATURE = createKey("lapis_crystals");
	public static final ResourceKey<PlacedFeature> REDSTONE_CRYSTALS_FEATURE = createKey("redstone_crystals");
	public static final ResourceKey<PlacedFeature> GLOWSTONE_CRYSTALS_FEATURE = createKey("glowstone_crystals");
	
	private static ResourceKey<PlacedFeature> createKey(String id) {
		return ResourceKey.create(Registries.PLACED_FEATURE, CrystalsMod.id(id));
	}
	
	public static void register() {
		Registry.register(BuiltInRegistries.FEATURE, CrystalsMod.id("crystal_feature"), new CrystalFeature(CrystalFeatureConfig.CODEC));
		
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_DECORATION, DIAMOND_CRYSTALS_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_DECORATION, EMERALD_CRYSTALS_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_DECORATION, LAPIS_CRYSTALS_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_DECORATION, REDSTONE_CRYSTALS_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_DECORATION, GLOWSTONE_CRYSTALS_FEATURE);
	}
}
