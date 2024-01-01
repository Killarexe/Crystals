package github.killarexe.crystals.forge.registry;

import github.killarexe.crystals.CrystalsMod;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CrystalsModForgeItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CrystalsMod.MOD_ID);
	
	public static void addItemsToCreativeTabs(BuildCreativeModeTabContentsEvent event) {
		ITEMS.getEntries().forEach(item -> {
			if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
				event.accept(item);
			}
		});
	}
}
