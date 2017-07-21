package thepoptartcrpr.ef.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thepoptartcrpr.ef.init.EFItems;

public class RecipeHandler {
	
	public static void registerCraftingRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(EFItems.filletedTuna, 1), new Object[]{EFItems.fishTuna});
	}
	
	public static void registerSmeltingRecipes() {
		GameRegistry.addSmelting(EFItems.breadDough, new ItemStack(Items.BREAD), 0.3f);
	}
	
	private static void registerToolRecipe(Item ingot, Item pickaxe, Item axe, Item shovel, Item hoe, Item sword) {
		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[] { "III", " S ", " S ", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] { "II", "IS", " S", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] { "I", "S", "S", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] { "II", " S", " S", 'I', ingot, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] { "I", "I", "S", 'I', ingot, 'S', Items.STICK });
	}

}
