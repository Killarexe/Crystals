package github.killarexe.crystals.forge.registry;

import github.killarexe.crystals.CrystalsMod;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CrystalsModForgeBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CrystalsMod.MOD_ID);
	
	public static final RegistryObject<Block> DIAMOND_CRYSTAL = createBlock("diamond_crystal");
	public static final RegistryObject<Block> EMERALD_CRYSTAL = createBlock("emerald_crystal");
	public static final RegistryObject<Block> LAPIS_CRYSTAL = createBlock("lapis_crystal");
	public static final RegistryObject<Block> REDSTONE_CRYSTAL = createBlock("redstone_crystal");
	public static final RegistryObject<Block> GLOWSTONE_CRYSTAL = createBlock("glowstone_crystal");
	
	private static RegistryObject<Block> createBlock(String id) {
		Block block = new AmethystClusterBlock(5.0F, 3.0F, BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_AMETHYST_BUD));
		return BLOCKS.register(id, () -> block);
	}
}
