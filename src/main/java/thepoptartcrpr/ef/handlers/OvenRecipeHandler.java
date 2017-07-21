package thepoptartcrpr.ef.handlers;

import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Nullable;

import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thepoptartcrpr.ef.init.EFItems;
import thepoptartcrpr.ef.utils.Utils;

public class OvenRecipeHandler {
	
	private static final Map<ItemStack, ItemStack> ovenList = Maps.<ItemStack, ItemStack>newHashMap();
	
	public static void registerOvenRecipes() {
		addOvenRecipe(EFItems.breadDough, new ItemStack(Items.BREAD));
	}
	
	@Nullable
	public static ItemStack getOvenResult(ItemStack stack) {
		for (Entry<ItemStack, ItemStack> entry : ovenList.entrySet()) {
			if (compareItemStacks(stack, (ItemStack)entry.getKey())) {
				return (ItemStack)entry.getValue();
			}
		}
		return null;
	}
	
	private static boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}

	public void addOvenRecipe(Item input, Item output) {
		ItemStack inputStack = new ItemStack(input);
		ItemStack outputStack = new ItemStack(output);
		if (getOvenResult(inputStack) != null) {
			Utils.getConsole().info("Conflicting recipes, ignoring recipe for " + input);
		} else {
			this.ovenList.put(inputStack, outputStack);
		}
	}
	
	public void addOvenRecipe(Block input, Item output) {
		Item inputBlock = Item.getItemFromBlock(input);
		ItemStack inputStack = new ItemStack(inputBlock);
		ItemStack outputStack = new ItemStack(output);
		if (getOvenResult(inputStack) != null) {
			Utils.getConsole().info("Conflicting recipes, ignoring recipe for " + input);
		} else {
			this.ovenList.put(inputStack, outputStack);
		}
	}
	
	public void addOvenRecipe(Item input, ItemStack output) {
		ItemStack inputStack = new ItemStack(input);
		if (getOvenResult(inputStack) != null) {
			Utils.getConsole().info("Conflicting recipes, ignoring recipe for " + input);
		} else {
			this.ovenList.put(inputStack, output);
		}
	}
	
	public void addOvenRecipe(Block input, ItemStack output) {
		Item inputBlock = Item.getItemFromBlock(input);
		ItemStack inputStack = new ItemStack(inputBlock);
		if (getOvenResult(inputStack) != null) {
			Utils.getConsole().info("Conflicting recipes, ignoring recipe for " + input);
		} else {
			this.ovenList.put(inputStack, output);
		}
	}
	
}
