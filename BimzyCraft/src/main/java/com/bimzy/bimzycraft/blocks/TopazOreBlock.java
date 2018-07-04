package com.bimzy.bimzycraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TopazOreBlock extends BlockBase {

	public TopazOreBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
	}
}
