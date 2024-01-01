package github.killarexe.crystals.fabric.client;

import github.killarexe.crystals.fabric.registry.CrystalsModFabricBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

@Environment(EnvType.CLIENT)
public class CrystalsModFabricClient implements ClientModInitializer{

	@Override
	public void onInitializeClient() {
		CrystalsModFabricBlocks.BLOCKS.values().forEach(block -> {
			BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());
		});	
	}
}
