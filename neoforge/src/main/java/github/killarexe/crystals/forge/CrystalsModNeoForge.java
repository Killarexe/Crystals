package github.killarexe.crystals.forge;

import github.killarexe.crystals.CrystalsMod;
import github.killarexe.crystals.forge.registry.CrystalsModNeoForgeBlocks;
import github.killarexe.crystals.forge.registry.CrystalsModNeoForgeFeatures;
import github.killarexe.crystals.forge.registry.CrystalsModNeoForgeItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(CrystalsMod.MOD_ID)
public class CrystalsModNeoForge {
	public CrystalsModNeoForge(IEventBus bus, ModContainer container) {
		CrystalsModNeoForgeBlocks.BLOCKS.register(bus);
		CrystalsModNeoForgeItems.register(bus);
		CrystalsModNeoForgeFeatures.FEATURES.register(bus);
		bus.addListener(CrystalsModNeoForgeItems::addItemsToCreativeTabs);
	}
}
