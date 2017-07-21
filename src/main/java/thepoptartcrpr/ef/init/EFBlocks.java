package thepoptartcrpr.ef.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thepoptartcrpr.ef.EnhancedFood;
import thepoptartcrpr.ef.Variables;
import thepoptartcrpr.ef.blocks.EFBlock;
import thepoptartcrpr.ef.blocks.crops.BlockCornCrop;
import thepoptartcrpr.ef.blocks.machines.Oven;

public class EFBlocks {
	
	// Ores
	public static Block saltOre;
	
	// Crops
	public static Block cornCrop;
	
	// Machines
	public static Block oven;
	
	public static void init() {
		// Ores
		saltOre = new EFBlock("salt_ore", "salt_ore", Material.ROCK, 2, 2);
	
		// Crops
		cornCrop = new BlockCornCrop("corn_crop");
		
		// Machines
		oven = new Oven("oven");
	}
	
	public static void register() {
		// Ores
		registerBlock(saltOre, EnhancedFood.ores);
		
		// Crops
		registerBlock(cornCrop);
		
		// Machines
		registerBlock(oven, EnhancedFood.machines);
	}
	
	public static void registerRenders() {
		// Ores
		registerRender(saltOre);
		
		// Crops
		registerRender(cornCrop);
		
		// Machines
		registerRender(oven);
	}
	
	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	
	public static void registerBlock(Block block, CreativeTabs tab) {
		block.setCreativeTab(tab);
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	
	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Variables.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
	}

}
