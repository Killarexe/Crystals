package github.killarexe.crystals.fabric;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import github.killarexe.crystals.CrystalsMod;
import github.killarexe.crystals.fabric.registry.CrystalsModFabricBlocks;
import github.killarexe.crystals.fabric.registry.CrystalsModFabricFeatures;
import github.killarexe.crystals.fabric.registry.CrystalsModFabricItems;
import net.fabricmc.api.ModInitializer;

public class CrystalsModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
			CrystalsMod.LOGGER.info("Crystals Register Blocks...");
    	CrystalsModFabricBlocks.register();
			CrystalsMod.LOGGER.info("Crystals Register Items...");
    	CrystalsModFabricItems.register();
			CrystalsMod.LOGGER.info("Crystals Register Features...");
    	CrystalsModFabricFeatures.register();
    }
}
