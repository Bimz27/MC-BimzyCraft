package com.bimzy.bimzycraft.entity.render;

import com.bimzy.bimzycraft.element.element;
import com.bimzy.bimzycraft.entity.EntityGolem;
import com.bimzy.bimzycraft.entity.model.ModelGolem;
import com.bimzy.bimzycraft.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGolem extends RenderLiving<EntityGolem> 
{
	public static final ResourceLocation TEXTURE_EARTH = new ResourceLocation(Reference.MOD_ID + ":textures/entity/earth_golem.png");
	public static final ResourceLocation TEXTURE_ICE = new ResourceLocation(Reference.MOD_ID + ":textures/entity/ice_golem.png");
	public static final ResourceLocation TEXTURE_MAGMA = new ResourceLocation(Reference.MOD_ID + ":textures/entity/magma_golem.png");
	public static final ResourceLocation TEXTURE_ARCANE = new ResourceLocation(Reference.MOD_ID + ":textures/entity/arcane_golem.png");
	
	public RenderGolem(RenderManager manager)
	{
		super(manager, new ModelGolem(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityGolem entity) {
		
		switch(entity.getElement())
		{
			case Earth:
				return TEXTURE_EARTH;
			case Ice:
				return TEXTURE_ICE;
			case Magma:
				return TEXTURE_MAGMA;
			case Arcane:
				return TEXTURE_ARCANE;
		}
		return TEXTURE_ICE;
	}
	
	@Override
	protected void applyRotations(EntityGolem entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		// TODO Auto-generated method stub
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}
