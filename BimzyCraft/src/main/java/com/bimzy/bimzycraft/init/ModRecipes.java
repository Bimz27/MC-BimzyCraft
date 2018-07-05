package com.bimzy.bimzycraft.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init()
	{
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(ModItems.STEEL_INGOT, 1), 1.5f);
	}
	
}
