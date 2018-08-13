package com.bimzy.bimzycraft.world.biome;

import com.bimzy.bimzycraft.entity.EntityArcaneGolem;
import com.bimzy.bimzycraft.entity.EntityEarthGolem;
import com.bimzy.bimzycraft.entity.EntityIceGolem;
import com.bimzy.bimzycraft.entity.EntityMagmaGolem;
import com.bimzy.bimzycraft.init.ModBlocks;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeArcane extends Biome {
	
	public BiomeArcane()
	{
		super (new BiomeProperties("Arcane").setBaseHeight(1.4F).setHeightVariation(0.6F).setTemperature(0.6F).setRainDisabled().setWaterColor(8598422));
		
		topBlock = ModBlocks.ARCANE_BLOCK.getDefaultState();
		fillerBlock = ModBlocks.AMETHYST_ORE_BLOCK.getDefaultState();
		
		this.decorator.coalGen = new WorldGenMinable(ModBlocks.TOPAZ_BLOCK.getDefaultState(), 10);
		
		this.decorator.treesPerChunk = 0;
		
		this.spawnableCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityArcaneGolem.class, 50, 2, 4));
	}
}
