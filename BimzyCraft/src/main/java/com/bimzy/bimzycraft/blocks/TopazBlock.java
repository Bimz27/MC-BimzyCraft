package com.bimzy.bimzycraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TopazBlock extends BlockBase {

	public TopazBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
	}
}
