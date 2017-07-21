package thepoptartcrpr.ef.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thepoptartcrpr.ef.EnhancedFood;
import thepoptartcrpr.ef.Variables;
import thepoptartcrpr.ef.items.EFFood;
import thepoptartcrpr.ef.items.EFItem;

public class EFItems {
	
	// Ingredients
	public static Item salt;
	public static Item filletedTuna;
	public static Item breadDough;
	
	// Seeds
	public static Item cornSeeds;
	
	// Crop food
	public static Item corn;
	
	// Fish
	public static Item fishTuna;
	
	public static void init() {
		// Ingredients
		salt = new EFItem("salt", "salt");
		filletedTuna = new EFItem("filleted_tuna", "filleted_tuna");
		breadDough = new EFItem("dough_bread", "dough_bread");
		
		// Seeds
		cornSeeds = new ItemSeeds(EFBlocks.cornCrop, Blocks.FARMLAND).setUnlocalizedName("corn_seeds").setRegistryName(new ResourceLocation(Variables.MODID, "corn_seeds"));
		
		// Crop food
		corn = new EFFood("corn", 2, 2, false);
		
		// Fish
		fishTuna = new EFItem("tuna_fish", "tuna_fish");
	}
	
	public static void register() {
		// Ingredients
		registerItem(salt, EnhancedFood.ingredients);
		registerItem(filletedTuna, EnhancedFood.ingredients);
		registerItem(breadDough, EnhancedFood.ingredients);
		
		// Seeds
		registerItem(cornSeeds, EnhancedFood.crops);
		
		// Crop food
		registerItem(corn, EnhancedFood.crops);
		
		// Fish
		registerItem(fishTuna, EnhancedFood.ingredients);
	}
	
	public static void registerRenders() {
		// Ingredients
		registerRender(salt);
		registerRender(filletedTuna);
		registerRender(breadDough);
		
		// Seeds
		registerRender(cornSeeds);
		
		// Crop food
		registerRender(corn);
		
		// Fish
		registerRender(fishTuna);
	}
	
	public static void registerItem(Item item) {
		GameRegistry.register(item);
	}
	
	public static void registerItem(Item item, CreativeTabs tab) {
		item.setCreativeTab(tab);
		GameRegistry.register(item);
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Variables.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}

}
