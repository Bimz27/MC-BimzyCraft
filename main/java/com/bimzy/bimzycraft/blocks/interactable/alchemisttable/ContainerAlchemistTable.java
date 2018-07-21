package com.bimzy.bimzycraft.blocks.interactable.alchemisttable;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.bimzy.bimzycraft.blocks.interactable.alchemisttable.slots.SlotAlchemistTableConsumable;
import com.bimzy.bimzycraft.blocks.interactable.alchemisttable.slots.SlotAlchemistTableOutput;
import com.bimzy.bimzycraft.blocks.interactable.crusher.CrusherRecipes;
import com.bimzy.bimzycraft.blocks.interactable.crusher.TileEntityCrusher;
import com.bimzy.bimzycraft.blocks.interactable.crusher.slots.SlotCrusherFuel;
import com.bimzy.bimzycraft.blocks.interactable.crusher.slots.SlotCrusherOutput;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ContainerAlchemistTable extends Container
{	

	private final TileEntityAlchemistTable tileentity;
	
	public ContainerAlchemistTable(InventoryPlayer player, TileEntityAlchemistTable tileentity)
    {
		this.tileentity = tileentity;
		
		//create crafting slots
		int counter = 0;
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				this.addSlotToContainer(new Slot(tileentity, counter, 10 + (i * 18), 10 + (j * 18)));
				counter++;
			}
		}
		
		//this.addSlotToContainer(new SlotAlchemistTableConsumable(tileentity, 9, 56, 53)); 
		this.addSlotToContainer(new SlotAlchemistTableOutput(player.player, tileentity, 10, 116, 35));
		
		for(int y = 0; y < 3; y++)
		{
			for(int x = 0; x < 9; x++)
			{
				this.addSlotToContainer(new Slot(player, x + y*9 + 9, 8 + x*18, 84 + y*18));
			}
		}
		
		for(int x = 0; x < 9; x++)
		{
			this.addSlotToContainer(new Slot(player, x, 8 + x * 18, 142));
		}
    }
	
	@Override
	public void addListener(IContainerListener listener) 
	{
		super.addListener(listener);
		listener.sendAllWindowProperties(this, this.tileentity);
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) 
	{
		return this.tileentity.isUsableByPlayer(playerIn);
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) 
	{
		ItemStack stack = ItemStack.EMPTY;
		Slot slot = (Slot)this.inventorySlots.get(index);
		
		
		/*
		if(slot != null && slot.getHasStack()) 
		{
			ItemStack stack1 = slot.getStack();
			stack = stack1.copy();
			
			if(index != 2 && index != 1 && index != 0) 
			{		
				Slot slot1 = (Slot)this.inventorySlots.get(index + 1);
				
				if(!CrusherRecipes.getInstance().getCrusherResult(slot1.getStack()).isEmpty())
				{
					if(!this.mergeItemStack(stack1, 0, 2, false)) 
					{
						return ItemStack.EMPTY;
					}
					else if(TileEntityAlchemistTable.isItemConsumable(stack1))
					{
						if(!this.mergeItemStack(stack1, 9, 10, false)) return ItemStack.EMPTY;
					}
					else if(index >= 11 && index < 31)
					{
						if(!this.mergeItemStack(stack1, 31, 40, false)) return ItemStack.EMPTY;
					}
					else if(index >= 31 && index < 40 && !this.mergeItemStack(stack1, 11, 31, false))
					{
						return ItemStack.EMPTY;
					}
				}
			} 
			else if(!this.mergeItemStack(stack1, 11, 40, false)) 
			{
				return ItemStack.EMPTY;
			}
			if(stack1.isEmpty())
			{
				slot.putStack(ItemStack.EMPTY);
			}
			else
			{
				slot.onSlotChanged();
			}
			
			if(stack1.getCount() == stack.getCount()) return ItemStack.EMPTY;
			slot.onTake(playerIn, stack);
			
		}
		return stack;
		*/
		
		
		
		slot.onTake(playerIn, stack);
		return stack;
	}
}
