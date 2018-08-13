package com.bimzy.bimzycraft.init;

import com.bimzy.bimzycraft.world.biome.BiomeArcane;
import com.bimzy.bimzycraft.world.biome.BiomeEarth;
import com.bimzy.bimzycraft.world.biome.BiomeIce;
import com.bimzy.bimzycraft.world.biome.BiomeMagma;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBiomes {

	public static final Biome ARCANE = new BiomeArcane();
	public static final Biome EARTH = new BiomeEarth();
	public static final Biome ICE = new BiomeIce();
	public static final Biome MAGMA = new BiomeMagma();
	
	public static void registerBiomes()
	{
		initBiome(ARCANE, "Arcane", BiomeType.COOL, Type.MAGICAL);
		initBiome(EARTH, "Earth", BiomeType.COOL, Type.MAGICAL);
		initBiome(ICE, "Ice", BiomeType.ICY, Type.MAGICAL);
		initBiome(MAGMA, "Magma", BiomeType.WARM, Type.MAGICAL);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("biome registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 200));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("biome added");
		return biome;
	}
	
}
