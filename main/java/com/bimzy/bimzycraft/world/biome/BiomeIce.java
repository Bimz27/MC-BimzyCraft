package com.bimzy.bimzycraft.world.biome;

import com.bimzy.bimzycraft.entity.EntityArcaneGolem;
import com.bimzy.bimzycraft.entity.EntityEarthGolem;
import com.bimzy.bimzycraft.entity.EntityIceGolem;
import com.bimzy.bimzycraft.entity.EntityMagmaGolem;
import com.bimzy.bimzycraft.init.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeIce extends Biome {

	public BiomeIce()
	{
		super (new BiomeProperties("Ice").setBaseHeight(1.6F).setHeightVariation(0.6F).setTemperature(0.6F).setRainDisabled().setWaterColor(8598422));
		
		topBlock = Blocks.SNOW.getDefaultState();
		fillerBlock = Blocks.PACKED_ICE.getDefaultState();
		
		this.decorator.coalGen = new WorldGenMinable(ModBlocks.TOPAZ_BLOCK.getDefaultState(), 10);
		
		this.decorator.treesPerChunk = 2;
		
		this.spawnableCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityIceGolem.class, 50, 2, 4));
	}
	
}
