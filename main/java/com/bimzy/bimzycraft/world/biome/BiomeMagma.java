package com.bimzy.bimzycraft.world.biome;

import com.bimzy.bimzycraft.entity.EntityMagmaGolem;
import com.bimzy.bimzycraft.init.ModBlocks;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeMagma extends Biome {
	
	public BiomeMagma()
	{
		super (new BiomeProperties("Magma").setBaseHeight(1.4F).setHeightVariation(0.6F).setTemperature(0.6F).setRainDisabled().setWaterColor(8598422));
		
		topBlock = ModBlocks.MAGMA_BLOCK.getDefaultState();
		fillerBlock = ModBlocks.RUBY_ORE_BLOCK.getDefaultState();
		
		this.decorator.coalGen = new WorldGenMinable(ModBlocks.TOPAZ_BLOCK.getDefaultState(), 10);
		
		this.decorator.treesPerChunk = 0;
		
		this.spawnableCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityMagmaGolem.class, 50, 2, 4));
	}
}
