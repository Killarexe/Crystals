package github.killarexe.crystals.forge.registry;


import github.killarexe.crystals.CrystalsMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CrystalsModNeoForgeItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, CrystalsMod.MOD_ID);

	public static void register(IEventBus bus) {
		CrystalsModNeoForgeBlocks.BLOCKS.getEntries().forEach(block -> {
			ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
		});
		ITEMS.register(bus);
	}
	
	public static void addItemsToCreativeTabs(BuildCreativeModeTabContentsEvent event) {
		ITEMS.getEntries().forEach(item -> {
			if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
				event.accept(item.get());
			}
		});
	}
}
