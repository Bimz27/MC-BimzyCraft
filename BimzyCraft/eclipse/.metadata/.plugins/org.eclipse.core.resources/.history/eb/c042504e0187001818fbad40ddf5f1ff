package com.bimzy.bimzycraft.util.handlers;

import com.bimzy.bimzycraft.Main;
import com.bimzy.bimzycraft.init.EntityInit;
import com.bimzy.bimzycraft.init.ModBlocks;
import com.bimzy.bimzycraft.init.ModItems;
import com.bimzy.bimzycraft.util.interfaces.IHasModel;
import com.bimzy.bimzycraft.world.gen.WorldGenCustomOres;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
	
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries()
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	
	public static void InitRegistries()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}
}