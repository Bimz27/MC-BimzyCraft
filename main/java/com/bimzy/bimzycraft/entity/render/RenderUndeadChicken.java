package com.bimzy.bimzycraft.entity.render;

import com.bimzy.bimzycraft.entity.EntityUndeadChicken;
import com.bimzy.bimzycraft.entity.model.ModelUndeadChicken;
import com.bimzy.bimzycraft.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderUndeadChicken extends RenderLiving<EntityUndeadChicken> 
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/undead_chicken.png");
	
	public RenderUndeadChicken(RenderManager manager)
	{
		super(manager, new ModelUndeadChicken(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityUndeadChicken entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityUndeadChicken entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
} 
