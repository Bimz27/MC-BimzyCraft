package com.bimzy.bimzycraft.entity;

import com.bimzy.bimzycraft.element.element.Element;

import net.minecraft.world.World;

public class EntityIceGolem extends EntityGolem {

	public EntityIceGolem(World worldIn) {
		super(worldIn);
		setElement(Element.Ice);
	}

}