package com.bimzy.bimzycraft.init;

import java.util.ArrayList;
import java.util.List;

import com.bimzy.bimzycraft.items.ItemBase;
import com.bimzy.bimzycraft.items.armor.ArmorBase;
import com.bimzy.bimzycraft.items.tools.ToolAxe;
import com.bimzy.bimzycraft.items.tools.ToolHoe;
import com.bimzy.bimzycraft.items.tools.ToolPickaxe;
import com.bimzy.bimzycraft.items.tools.ToolSpade;
import com.bimzy.bimzycraft.items.tools.ToolSword;
import com.bimzy.bimzycraft.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 2000, 8.0F, 3.f, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 14, 
			new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	public static final ToolMaterial MATERIAL_AMETHYST = EnumHelper.addToolMaterial("material_amethyst", 3, 2000, 8.0F, 3.f, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_AMETHYST = EnumHelper.addArmorMaterial("armor_material_amethyst", Reference.MOD_ID + ":amethyst", 14, 
			new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	public static final ToolMaterial MATERIAL_TOPAZ = EnumHelper.addToolMaterial("material_topaz", 3, 2000, 8.0F, 3.f, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_TOPAZ = EnumHelper.addArmorMaterial("armor_material_topaz", Reference.MOD_ID + ":topaz", 14, 
			new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//items
	public static final Item BREAD_CRUMB = new ItemBase("bread_crumb");
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item TOPAZ = new ItemBase("topaz");
	public static final Item AMETHYST = new ItemBase("amethyst");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	
	//tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SPADE = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	public static final ItemSword AMETHYST_SWORD = new ToolSword("amethyst_sword", MATERIAL_AMETHYST);
	public static final ItemSpade AMETHYST_SPADE = new ToolSpade("amethyst_shovel", MATERIAL_AMETHYST);
	public static final ItemPickaxe AMETHYST_PICKAXE = new ToolPickaxe("amethyst_pickaxe", MATERIAL_AMETHYST);
	public static final ItemAxe AMETHYST_AXE = new ToolAxe("amethyst_axe", MATERIAL_AMETHYST);
	public static final ItemHoe AMETHYST_HOE = new ToolHoe("amethyst_hoe", MATERIAL_AMETHYST);
	public static final ItemSword TOPAZ_SWORD = new ToolSword("topaz_sword", MATERIAL_TOPAZ);
	public static final ItemSpade TOPAZ_SPADE = new ToolSpade("topaz_shovel", MATERIAL_TOPAZ);
	public static final ItemPickaxe TOPAZ_PICKAXE = new ToolPickaxe("topaz_pickaxe", MATERIAL_TOPAZ);
	public static final ItemAxe TOPAZ_AXE = new ToolAxe("topaz_axe", MATERIAL_TOPAZ);
	public static final ItemHoe TOPAZ_HOE = new ToolHoe("topaz_hoe", MATERIAL_TOPAZ);
	
	//armor
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	public static final Item AMETHYST_HELMET = new ArmorBase("amethyst_helmet", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.HEAD);
	public static final Item AMETHYST_CHESTPLATE = new ArmorBase("amethyst_chestplate", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.CHEST);
	public static final Item AMETHYST_LEGGINGS = new ArmorBase("amethyst_leggings", ARMOR_MATERIAL_AMETHYST, 2, EntityEquipmentSlot.LEGS);
	public static final Item AMETHYST_BOOTS = new ArmorBase("amethyst_boots", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.FEET);
	public static final Item TOPAZ_HELMET = new ArmorBase("topaz_helmet", ARMOR_MATERIAL_TOPAZ, 1, EntityEquipmentSlot.HEAD);
	public static final Item TOPAZ_CHESTPLATE = new ArmorBase("topaz_chestplate", ARMOR_MATERIAL_TOPAZ, 1, EntityEquipmentSlot.CHEST);
	public static final Item TOPAZ_LEGGINGS = new ArmorBase("topaz_leggings", ARMOR_MATERIAL_TOPAZ, 2, EntityEquipmentSlot.LEGS);
	public static final Item TOPAZ_BOOTS = new ArmorBase("topaz_boots", ARMOR_MATERIAL_TOPAZ, 1, EntityEquipmentSlot.FEET);
	
} 