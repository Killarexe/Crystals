package github.killarexe.crystals.forge;

import github.killarexe.crystals.CrystalsMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(CrystalsMod.MOD_ID)
public class CrystalsModForge {
    public CrystalsModForge() {
    	MinecraftForge.EVENT_BUS.register(this);
    }
}
