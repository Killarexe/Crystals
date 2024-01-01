package github.killarexe.crystals.fabric;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import github.killarexe.crystals.CrystalsMod;
import github.killarexe.crystals.fabric.registry.CrystalsModFabricBlocks;
import github.killarexe.crystals.fabric.registry.CrystalsModFabricFeatures;
import github.killarexe.crystals.fabric.registry.CrystalsModFabricItems;
import net.fabricmc.api.ModInitializer;

public class CrystalsModFabric implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger(CrystalsMod.MOD_ID);
	
    @Override
    public void onInitialize() {
    	CrystalsModFabricBlocks.register();
    	CrystalsModFabricItems.register();
    	CrystalsModFabricFeatures.register();
    }
}
