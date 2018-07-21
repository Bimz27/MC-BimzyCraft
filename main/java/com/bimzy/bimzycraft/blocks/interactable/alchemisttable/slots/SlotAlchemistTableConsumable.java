package com.bimzy.bimzycraft.blocks.interactable.alchemisttable.slots;

import com.bimzy.bimzycraft.blocks.interactable.alchemisttable.TileEntityAlchemistTable;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotAlchemistTableConsumable extends Slot {

	public SlotAlchemistTableConsumable(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityAlchemistTable.isItemConsumable(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
	
}
