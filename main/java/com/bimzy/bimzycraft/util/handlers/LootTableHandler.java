 package com.bimzy.bimzycraft.util.handlers;

import com.bimzy.bimzycraft.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler {
	
	public static final ResourceLocation UNDEAD_CHICKEN = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "entity_undead_chicken"));
	public static final ResourceLocation EARTH_GOLEM = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "entity_earth_golem"));
	public static final ResourceLocation ICE_GOLEM = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "entity_ice_golem"));
	public static final ResourceLocation MAGMA_GOLEM = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "entity_magma_golem"));
	public static final ResourceLocation ARCANE_GOLEM = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "entity_arcane_golem"));
	
}
