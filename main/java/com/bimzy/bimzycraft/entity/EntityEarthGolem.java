package com.bimzy.bimzycraft.entity;

import com.bimzy.bimzycraft.element.element.Element;

import net.minecraft.world.World;

public class EntityEarthGolem extends EntityGolem {

	public EntityEarthGolem(World worldIn) {
		super(worldIn);
		setElement(Element.Earth);
	}

}
