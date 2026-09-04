package github.killarexe.crystals;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrystalsMod {
    public static final String MOD_ID = "crystals";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    public static ResourceLocation id(String id) {
    	return ResourceLocation.fromNamespaceAndPath(MOD_ID, id);
    }
}
