package com.bimzy.bimzycraft.util.handlers;

import com.bimzy.bimzycraft.blocks.interactable.ContainerCrusher;
import com.bimzy.bimzycraft.blocks.interactable.GuiCrusher;
import com.bimzy.bimzycraft.blocks.interactable.TileEntityCrusher;
import com.bimzy.bimzycraft.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		if(ID == Reference.GUI_CRUSHER) return new ContainerCrusher(player.inventory, (TileEntityCrusher)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_CRUSHER) return new GuiCrusher(player.inventory, (TileEntityCrusher)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}
	
}