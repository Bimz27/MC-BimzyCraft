package com.bimzy.bimzycraft.util.handlers;

import com.bimzy.bimzycraft.entity.EntityArcaneGolem;
import com.bimzy.bimzycraft.entity.EntityEarthGolem;
import com.bimzy.bimzycraft.entity.EntityGolem;
import com.bimzy.bimzycraft.entity.EntityIceGolem;
import com.bimzy.bimzycraft.entity.EntityMagmaGolem;
import com.bimzy.bimzycraft.entity.EntityUndeadChicken;
import com.bimzy.bimzycraft.entity.render.RenderGolem;
import com.bimzy.bimzycraft.entity.render.RenderUndeadChicken;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderHandler {
	
	private static RenderHandler instance = new RenderHandler();
	
	public static RenderHandler instance()
	{
		return instance;
	};
	
	public void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityUndeadChicken.class, new IRenderFactory<EntityUndeadChicken>()
		{
			@Override
			public Render<? super EntityUndeadChicken> createRenderFor(RenderManager manager)
			{
				return new RenderUndeadChicken(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityEarthGolem.class, new IRenderFactory<EntityEarthGolem>()
		{
			@Override
			public Render<? super EntityEarthGolem> createRenderFor(RenderManager manager)
			{
				return new RenderGolem(manager);
			}
		});

		RenderingRegistry.registerEntityRenderingHandler(EntityIceGolem.class, new IRenderFactory<EntityIceGolem>()
		{
			@Override
			public Render<? super EntityIceGolem> createRenderFor(RenderManager manager)
			{
				return new RenderGolem(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMagmaGolem.class, new IRenderFactory<EntityMagmaGolem>()
		{
			@Override
			public Render<? super EntityMagmaGolem> createRenderFor(RenderManager manager)
			{
				return new RenderGolem(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityArcaneGolem.class, new IRenderFactory<EntityArcaneGolem>()
		{
			@Override
			public Render<? super EntityArcaneGolem> createRenderFor(RenderManager manager)
			{
				return new RenderGolem(manager);
			}
		});
	}
	
}
