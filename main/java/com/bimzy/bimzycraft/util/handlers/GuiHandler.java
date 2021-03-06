package com.bimzy.bimzycraft.util.handlers;

import com.bimzy.bimzycraft.blocks.interactable.alchemisttable.ContainerAlchemistTable;
import com.bimzy.bimzycraft.blocks.interactable.alchemisttable.GuiAlchemistTable;
import com.bimzy.bimzycraft.blocks.interactable.alchemisttable.TileEntityAlchemistTable;
import com.bimzy.bimzycraft.blocks.interactable.crusher.ContainerCrusher;
import com.bimzy.bimzycraft.blocks.interactable.crusher.GuiCrusher;
import com.bimzy.bimzycraft.blocks.interactable.crusher.TileEntityCrusher;
import com.bimzy.bimzycraft.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_CRUSHER) return new ContainerCrusher(player.inventory, (TileEntityCrusher)world.getTileEntity(new BlockPos(x, y, z)));
		if(ID == Reference.GUI_ALCHEMIST_TABLE) return new ContainerAlchemistTable(player.inventory, (TileEntityAlchemistTable)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_CRUSHER) return new GuiCrusher(player.inventory, (TileEntityCrusher)world.getTileEntity(new BlockPos(x, y, z)));
		if(ID == Reference.GUI_ALCHEMIST_TABLE) return new GuiAlchemistTable(player.inventory, (TileEntityAlchemistTable)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}
	
}
