package github.killarexe.crystals.forge.registry;

import github.killarexe.crystals.CrystalsMod;
import github.killarexe.crystals.worldgen.feature.CrystalFeature;
import github.killarexe.crystals.worldgen.feature.CrystalFeatureConfig;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CrystalsModForgeFeatures {
	public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, CrystalsMod.MOD_ID);
	
	public static final RegistryObject<CrystalFeature> CRYSTAL_FEATURE = FEATURES.register("crystal_feature", () -> new CrystalFeature(CrystalFeatureConfig.CODEC));
}
