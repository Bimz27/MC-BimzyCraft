package com.bimzy.bimzycraft.entity.render;

import com.bimzy.bimzycraft.entity.EntityEarthGolem;
import com.bimzy.bimzycraft.entity.model.ModelEarthGolem;
import com.bimzy.bimzycraft.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderEarthGolem extends RenderLiving<EntityEarthGolem> 
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/earth_golem.png");
	
	public RenderEarthGolem(RenderManager manager)
	{
		super(manager, new ModelEarthGolem(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityEarthGolem entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityEarthGolem entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		// TODO Auto-generated method stub
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}
