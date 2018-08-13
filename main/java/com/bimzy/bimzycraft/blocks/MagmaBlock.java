package com.bimzy.bimzycraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MagmaBlock extends BlockBase {

	public MagmaBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(6.0f);
		setResistance(15.0f);
		setHarvestLevel("spade", 2);
		//setLightLevel(1.0f);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
	
}
