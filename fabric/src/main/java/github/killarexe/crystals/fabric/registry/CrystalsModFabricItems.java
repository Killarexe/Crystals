package github.killarexe.crystals.fabric.registry;

import github.killarexe.crystals.CrystalsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;

public class CrystalsModFabricItems {
	public static void register() {
		CrystalsModFabricBlocks.BLOCKS.forEach((id, block) -> {
			BlockItem blockItem = new BlockItem(block, new FabricItemSettings());
			Registry.register(BuiltInRegistries.ITEM, CrystalsMod.id(id), blockItem);
			ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register((group) -> group.accept(blockItem));
		});
	}
}
