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
import thepoptartcrpr.ef.blocks.machines.BlockOven;
import thepoptartcrpr.ef.blocks.machines.BlockTable;
import thepoptartcrpr.ef.blocks.machines.BlockTableCuttingBoard;
import thepoptartcrpr.ef.blocks.machines.BlockTableMixingBowl;

public class EFBlocks {
	
	// Ores
	public static Block saltOre;
	
	// Crops
	public static Block cornCrop;
	
	// Machines
	public static Block oven;
	public static Block tableEmpty;
	public static Block tableCuttingBoard;
	public static Block tableMixingBowl;
	
	public static void init() {
		// Ores
		saltOre = new EFBlock("salt_ore", "salt_ore", Material.ROCK, 2, 2);
	
		// Crops
		cornCrop = new BlockCornCrop("corn_crop");
		
		// Machines
		oven = new BlockOven("oven");
		tableEmpty = new BlockTable("table_empty", "table_empty", Material.WOOD, 1, 1);
		tableCuttingBoard = new BlockTableCuttingBoard("table_cutting_board", "table_cutting_board", Material.WOOD, 1, 1);
		tableMixingBowl = new BlockTableMixingBowl("table_mixing_bowl", "table_mixing_bowl", Material.WOOD, 1, 1);
	}
	
	public static void register() {
		// Ores
		registerBlock(saltOre, EnhancedFood.ores);
		
		// Crops
		registerBlock(cornCrop);
		
		// Machines
		registerBlock(oven, EnhancedFood.machines);
		registerBlock(tableEmpty, EnhancedFood.machines);
		registerBlock(tableCuttingBoard, EnhancedFood.machines);
		registerBlock(tableMixingBowl, EnhancedFood.machines);
	}
	
	public static void registerRenders() {
		// Ores
		registerRender(saltOre);
		
		// Crops
		registerRender(cornCrop);
		
		// Machines
		registerRender(oven);
		registerRender(tableEmpty);
		registerRender(tableCuttingBoard);
		registerRender(tableMixingBowl);
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
