package com.bimzy.bimzycraft.blocks.interactable.alchemisttable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerAlchemistTable extends Container
{	

	private final TileEntityAlchemistTable tileentity;
	
	public ContainerAlchemistTable(InventoryPlayer playerInventory, TileEntityAlchemistTable tileentity)
    {
		this.tileentity = tileentity;
    }
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) 
	{
		return this.tileentity.isUsableByPlayer(playerIn);
	}
}
