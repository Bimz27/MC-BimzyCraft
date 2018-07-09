package com.bimzy.bimzycraft.entity.render;

import com.bimzy.bimzycraft.entity.EntityUndeadChicken;
import com.bimzy.bimzycraft.entity.model.ModelUndeadChicken;
import com.bimzy.bimzycraft.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUndeadChicken extends RenderLiving<EntityUndeadChicken> 
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/undead_chicken.png");
	
	public RenderUndeadChicken(RenderManager manager)
	{
		super(manager, new ModelUndeadChicken(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityUndeadChicken entity) {
		// TODO Auto-generated method stub
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityUndeadChicken entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		// TODO Auto-generated method stub
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
