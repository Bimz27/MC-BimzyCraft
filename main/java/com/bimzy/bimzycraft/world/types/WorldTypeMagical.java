package com.bimzy.bimzycraft.world.types;

import com.bimzy.bimzycraft.init.ModBiomes;
import com.bimzy.bimzycraft.world.types.layer.GenLayerMagical;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.layer.GenLayer;

public class WorldTypeMagical extends WorldType {

	public WorldTypeMagical()
	{
		super("Magical");
	}
	
	@Override
	public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer, ChunkGeneratorSettings chunkSettings) {
		
		return new GenLayerMagical(worldSeed, parentLayer, this, chunkSettings);
	}
}
