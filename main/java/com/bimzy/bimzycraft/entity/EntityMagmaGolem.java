package com.bimzy.bimzycraft.entity;

import com.bimzy.bimzycraft.element.element.Element;

import net.minecraft.world.World;

public class EntityMagmaGolem extends EntityGolem {

	public EntityMagmaGolem(World worldIn) {
		super(worldIn);
		setElement(Element.Magma);
	}

}