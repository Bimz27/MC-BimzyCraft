package com.bimzy.bimzycraft.util.handlers;

import com.bimzy.bimzycraft.blocks.interactable.crusher.TileEntityCrusher;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {

	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityCrusher.class, "crusher");
	}
}
