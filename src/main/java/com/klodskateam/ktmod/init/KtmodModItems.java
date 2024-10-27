
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.klodskateam.ktmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.klodskateam.ktmod.item.RegularChipItem;
import com.klodskateam.ktmod.item.PlasticItem;
import com.klodskateam.ktmod.item.InternalCombustionEngineItem;
import com.klodskateam.ktmod.item.FuelItem;
import com.klodskateam.ktmod.item.ElectricPickaxeItem;
import com.klodskateam.ktmod.item.CrystalItem;
import com.klodskateam.ktmod.item.CopperWireItem;
import com.klodskateam.ktmod.item.BearingItem;
import com.klodskateam.ktmod.KtmodMod;

public class KtmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KtmodMod.MODID);
	public static final RegistryObject<Item> OIL_ORE = block(KtmodModBlocks.OIL_ORE, KtmodModTabs.TAB_TAB);
	public static final RegistryObject<Item> NETHER_OIL_ORE = block(KtmodModBlocks.NETHER_OIL_ORE, KtmodModTabs.TAB_TAB);
	public static final RegistryObject<Item> DISTILLATION_COLUMN = block(KtmodModBlocks.DISTILLATION_COLUMN, KtmodModTabs.TAB_TAB);
	public static final RegistryObject<Item> PLASTIC = REGISTRY.register("plastic", () -> new PlasticItem());
	public static final RegistryObject<Item> FUEL_BUCKET = REGISTRY.register("fuel_bucket", () -> new FuelItem());
	public static final RegistryObject<Item> INTERNAL_COMBUSTION_ENGINE = REGISTRY.register("internal_combustion_engine",
			() -> new InternalCombustionEngineItem());
	public static final RegistryObject<Item> BEARING = REGISTRY.register("bearing", () -> new BearingItem());
	public static final RegistryObject<Item> BEDROCK_MINER = block(KtmodModBlocks.BEDROCK_MINER, KtmodModTabs.TAB_TAB);
	public static final RegistryObject<Item> TANK = block(KtmodModBlocks.TANK, KtmodModTabs.TAB_TAB);
	public static final RegistryObject<Item> CRYSTAL = REGISTRY.register("crystal", () -> new CrystalItem());
	public static final RegistryObject<Item> PROCESSED_BEDROCK = block(KtmodModBlocks.PROCESSED_BEDROCK, KtmodModTabs.TAB_TAB);
	public static final RegistryObject<Item> SOLDERING_STATION = block(KtmodModBlocks.SOLDERING_STATION, KtmodModTabs.TAB_TAB);
	public static final RegistryObject<Item> COPPER_WIRE = REGISTRY.register("copper_wire", () -> new CopperWireItem());
	public static final RegistryObject<Item> REGULAR_CHIP = REGISTRY.register("regular_chip", () -> new RegularChipItem());
	public static final RegistryObject<Item> URAN_ORE = block(KtmodModBlocks.URAN_ORE, KtmodModTabs.TAB_TAB);
	public static final RegistryObject<Item> ELECTRIC_PICKAXE = REGISTRY.register("electric_pickaxe", () -> new ElectricPickaxeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
