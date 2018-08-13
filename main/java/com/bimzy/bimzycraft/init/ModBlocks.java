package com.bimzy.bimzycraft.init;

import java.util.ArrayList;
import java.util.List;

import com.bimzy.bimzycraft.blocks.AmethystBlock;
import com.bimzy.bimzycraft.blocks.AmethystOreBlock;
import com.bimzy.bimzycraft.blocks.ArcaneBlock;
import com.bimzy.bimzycraft.blocks.MagmaBlock;
import com.bimzy.bimzycraft.blocks.RubyBlock;
import com.bimzy.bimzycraft.blocks.RubyOreBlock;
import com.bimzy.bimzycraft.blocks.SteelBlock;
import com.bimzy.bimzycraft.blocks.TopazBlock;
import com.bimzy.bimzycraft.blocks.TopazOreBlock;
import com.bimzy.bimzycraft.blocks.interactable.alchemisttable.AlchemistTableBlock;
import com.bimzy.bimzycraft.blocks.interactable.crusher.CrusherBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	//default blocks
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block RUBY_ORE_BLOCK = new RubyOreBlock("ruby_ore_block", Material.IRON);
	public static final Block TOPAZ_BLOCK = new TopazBlock("topaz_block", Material.IRON);
	public static final Block TOPAZ_ORE_BLOCK = new TopazOreBlock("topaz_ore_block", Material.IRON);
	public static final Block AMETHYST_BLOCK = new AmethystBlock("amethyst_block", Material.IRON);
	public static final Block AMETHYST_ORE_BLOCK = new AmethystOreBlock("amethyst_ore_block", Material.IRON);
	public static final Block STEEL_BLOCK = new SteelBlock("steel_block", Material.IRON);
	
	//biome blocks
	public static final Block MAGMA_BLOCK = new MagmaBlock("magma_block", Material.IRON);
	public static final Block ARCANE_BLOCK = new ArcaneBlock("arcane_block", Material.IRON);
	
	//custom item blocks
	public static final Block CRUSHER_BLOCK = new CrusherBlock("crusher_block", Material.IRON);
	public static final Block ALCHEMIST_TABLE_BLOCK = new AlchemistTableBlock("alchemist_table_block", Material.IRON);
}
