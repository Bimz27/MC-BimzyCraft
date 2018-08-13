package com.bimzy.bimzycraft.blocks.interactable.alchemisttable;

import java.util.Map;
import java.util.Map.Entry;

import com.bimzy.bimzycraft.init.ModItems;
import com.google.common.collect.Maps;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class AlchemistTableRecipes {
	private static final AlchemistTableRecipes INSTANCE = new AlchemistTableRecipes();
	private final Map<ItemStack[], ItemStack> craftingList = Maps.<ItemStack[], ItemStack>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static AlchemistTableRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private AlchemistTableRecipes() 
	{
		addAlchemistTableRecipe(new ItemStack[] {new ItemStack(ModItems.AMETHYST_DUST), 
												 new ItemStack(ModItems.DIAMOND_DUST),
												 new ItemStack(ModItems.TOPAZ_DUST),
												 new ItemStack(ModItems.RUBY_DUST)}, 
				new ItemStack(ModItems.OMNI_GEM), 5.0F);
	}

	public void addAlchemistTableRecipe(ItemStack[] inputs, ItemStack result, float experience) 
	{
		if(getAlchemistTableResult(inputs) != ItemStack.EMPTY) return;
		this.craftingList.put(inputs, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getAlchemistTableResult(ItemStack[] inputs) 
	{
		for (Entry<ItemStack[], ItemStack> entry : this.craftingList.entrySet())
        {
            if (this.compareItemStacks(inputs, entry.getKey()))
            {
                return entry.getValue();
            }
        }

        return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack[] stack1, ItemStack[] stack2)
	{
		int counter = 0;
		
		for (ItemStack item2 : stack2)
		{
			for(ItemStack item1 : stack1)
			{
				if(item1.getItem() == item2.getItem())
				{
					counter++;
					break;
				}
			}
		}
		
		return (counter == stack2.length);
	}
	
	public Map<ItemStack[], ItemStack> getCraftingList() 
	{
		return this.craftingList;
	}
	
	public Map<ItemStack, Float> getExperienceList() 
	{
		return this.experienceList;
	}
}