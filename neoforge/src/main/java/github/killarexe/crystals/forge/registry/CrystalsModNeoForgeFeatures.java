package github.killarexe.crystals.forge.registry;

import github.killarexe.crystals.CrystalsMod;
import github.killarexe.crystals.worldgen.feature.CrystalFeature;
import github.killarexe.crystals.worldgen.feature.CrystalFeatureConfig;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CrystalsModNeoForgeFeatures {
	public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(BuiltInRegistries.FEATURE, CrystalsMod.MOD_ID);
	
	public static final DeferredHolder<Feature<?>, CrystalFeature> CRYSTAL_FEATURE = FEATURES.register("crystal_feature", () -> new CrystalFeature(CrystalFeatureConfig.CODEC));
}
