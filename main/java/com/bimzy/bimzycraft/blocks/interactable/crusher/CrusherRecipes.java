package com.bimzy.bimzycraft.blocks.interactable.crusher;

import java.util.Map;
import java.util.Map.Entry;

import com.bimzy.bimzycraft.init.ModItems;
import com.google.common.collect.Maps;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CrusherRecipes {
	private static final CrusherRecipes INSTANCE = new CrusherRecipes();
	private final Map<ItemStack, ItemStack> smeltingList = Maps.<ItemStack, ItemStack>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static CrusherRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private CrusherRecipes() 
	{
		addCrusherRecipe(new ItemStack(ModItems.AMETHYST), new ItemStack(ModItems.AMETHYST_DUST), 5.0F);
		addCrusherRecipe(new ItemStack(ModItems.RUBY), new ItemStack(ModItems.RUBY_DUST), 5.0F);
		addCrusherRecipe(new ItemStack(ModItems.TOPAZ), new ItemStack(ModItems.TOPAZ_DUST), 5.0F);
		addCrusherRecipe(new ItemStack(Items.DIAMOND), new ItemStack(ModItems.DIAMOND_DUST), 5.0F);
	}

	public void addCrusherRecipe(ItemStack input, ItemStack result, float experience) 
	{
		if(getCrusherResult(input) != ItemStack.EMPTY) return;
		this.smeltingList.put(input, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getCrusherResult(ItemStack input) 
	{
		for (Entry<ItemStack, ItemStack> entry : this.smeltingList.entrySet())
        {
            if (this.compareItemStacks(input, entry.getKey()))
            {
                return entry.getValue();
            }
        }

        return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Map<ItemStack, ItemStack> getSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getCrusherExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}
