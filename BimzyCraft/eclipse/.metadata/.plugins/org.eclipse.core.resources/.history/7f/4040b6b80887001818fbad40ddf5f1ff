package com.bimzy.bimzycraft.init;

import com.bimzy.bimzycraft.Main;
import com.bimzy.bimzycraft.entity.EntityEarthGolem;
import com.bimzy.bimzycraft.entity.EntityUndeadChicken;
import com.bimzy.bimzycraft.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

	public static void registerEntities()
	{
		registerEntity("undead_chicken", EntityUndeadChicken.class, Reference.ENTITY_UNDEAD_CHICKEN, 50, 7845250, 000000000);
		registerEntity("earth_golem", EntityEarthGolem.class, Reference.ENTITY_EARTH_GOLEM, 50, 175144075, 063043000);
	}
	
	private static void registerEntity(String name, Class<?extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
	
}
