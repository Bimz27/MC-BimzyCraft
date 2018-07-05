package com.bimzy.bimzycraft.init;

import java.util.ArrayList;
import java.util.List;

import com.bimzy.bimzycraft.blocks.AmethystBlock;
import com.bimzy.bimzycraft.blocks.AmethystOreBlock;
import com.bimzy.bimzycraft.blocks.BlockBase;
import com.bimzy.bimzycraft.blocks.RubyBlock;
import com.bimzy.bimzycraft.blocks.RubyOreBlock;
import com.bimzy.bimzycraft.blocks.SteelBlock;
import com.bimzy.bimzycraft.blocks.TopazBlock;
import com.bimzy.bimzycraft.blocks.TopazOreBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block RUBY_ORE_BLOCK = new RubyOreBlock("ruby_ore_block", Material.IRON);
	public static final Block TOPAZ_BLOCK = new TopazBlock("topaz_block", Material.IRON);
	public static final Block TOPAZ_ORE_BLOCK = new TopazOreBlock("topaz_ore_block", Material.IRON);
	public static final Block AMETHYST_BLOCK = new AmethystBlock("amethyst_block", Material.IRON);
	public static final Block AMETHYST_ORE_BLOCK = new AmethystOreBlock("amethyst_ore_block", Material.IRON);
	public static final Block STEEL_BLOCK = new SteelBlock("steel_block", Material.IRON);
}