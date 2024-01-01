package github.killarexe.crystals;

import net.minecraft.resources.ResourceLocation;

public class CrystalsMod {
    public static final String MOD_ID = "crystals";
    
    public static ResourceLocation id(String id) {
    	return new ResourceLocation(MOD_ID, id);
    }
}
