package com.bimzy.bimzycraft.world.gen;

import java.util.Random;

import com.bimzy.bimzycraft.init.ModBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator {
	
	private WorldGenerator ruby_ore_block, amethyst_ore_block, topaz_ore_block;
	private Random random;
	
	public WorldGenCustomOres()
	{
		ruby_ore_block = new WorldGenMinable(ModBlocks.RUBY_ORE_BLOCK.getDefaultState(), 5);
		amethyst_ore_block = new WorldGenMinable(ModBlocks.AMETHYST_ORE_BLOCK.getDefaultState(), 5);
		topaz_ore_block = new WorldGenMinable(ModBlocks.TOPAZ_ORE_BLOCK.getDefaultState(), 5);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{		
		switch(world.provider.getDimension())
		{
			case -1://nether
				break;
			case 0://overworld
				runGenerator(amethyst_ore_block, world, random, chunkX, chunkZ, 3, 0, 16);
				runGenerator(ruby_ore_block, world, random, chunkX, chunkZ, 4, 4, 20);
				runGenerator(topaz_ore_block, world, random, chunkX, chunkZ, 5, 8, 24);
				break;
			case 1://end
				break;
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generation out of bounds.");
	
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x, y ,z));
		}
	}
	
}
