package github.killarexe.crystals.forge;

import github.killarexe.crystals.CrystalsMod;
import github.killarexe.crystals.forge.registry.CrystalsModForgeBlocks;
import github.killarexe.crystals.forge.registry.CrystalsModForgeItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CrystalsMod.MOD_ID)
public class CrystalsModForge {
    public CrystalsModForge() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	CrystalsModForgeBlocks.BLOCKS.register(bus);
    	CrystalsModForgeItems.ITEMS.register(bus);
    	bus.addListener(CrystalsModForgeItems::addItemsToCreativeTabs);
    	MinecraftForge.EVENT_BUS.register(this);
    }
}
