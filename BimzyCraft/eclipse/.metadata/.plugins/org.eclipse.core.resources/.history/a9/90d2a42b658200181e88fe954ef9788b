package com.bimzy.bimzycraft.blocks;

import java.util.Random;

import com.bimzy.bimzycraft.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class TopazOreBlock extends BlockBase {

	public TopazOreBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return ModItems.TOPAZ;
	}
	
	public int quantityDropped(IBlockState state, int fortune, Random random) 
	{
		return random.nextInt(3) + 1;
	}
}
