
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

import com.klodskateam.ktmod.item.RubberItem;
import com.klodskateam.ktmod.item.RegularChipItem;
import com.klodskateam.ktmod.item.ProtectArmorItem;
import com.klodskateam.ktmod.item.ProcessedUraniumItem;
import com.klodskateam.ktmod.item.PlasticItem;
import com.klodskateam.ktmod.item.IronPlateItem;
import com.klodskateam.ktmod.item.InternalCombustionEngineItem;
import com.klodskateam.ktmod.item.FuelItem;
import com.klodskateam.ktmod.item.ElectricPickaxeItem;
import com.klodskateam.ktmod.item.CrystalItem;
import com.klodskateam.ktmod.item.CopperWireItem;
import com.klodskateam.ktmod.item.CopperRadiatorItem;
import com.klodskateam.ktmod.item.BedrockCrystalArmorItem;
import com.klodskateam.ktmod.item.BedrockAlloyItem;
import com.klodskateam.ktmod.item.BearingItem;
import com.klodskateam.ktmod.item.BatteryItem;
import com.klodskateam.ktmod.item.AdvancedMicrochipItem;
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
	public static final RegistryObject<Item> ORE_PROCESSOR = block(KtmodModBlocks.ORE_PROCESSOR, KtmodModTabs.TAB_TAB);
	public static final RegistryObject<Item> ELECTRIC_PICKAXE = REGISTRY.register("electric_pickaxe", () -> new ElectricPickaxeItem());
	public static final RegistryObject<Item> PROCESSED_URANIUM = REGISTRY.register("processed_uranium", () -> new ProcessedUraniumItem());
	public static final RegistryObject<Item> RUBBER = REGISTRY.register("rubber", () -> new RubberItem());
	public static final RegistryObject<Item> PROTECT_ARMOR_HELMET = REGISTRY.register("protect_armor_helmet", () -> new ProtectArmorItem.Helmet());
	public static final RegistryObject<Item> PROTECT_ARMOR_CHESTPLATE = REGISTRY.register("protect_armor_chestplate",
			() -> new ProtectArmorItem.Chestplate());
	public static final RegistryObject<Item> PROTECT_ARMOR_LEGGINGS = REGISTRY.register("protect_armor_leggings",
			() -> new ProtectArmorItem.Leggings());
	public static final RegistryObject<Item> PROTECT_ARMOR_BOOTS = REGISTRY.register("protect_armor_boots", () -> new ProtectArmorItem.Boots());
	public static final RegistryObject<Item> BATTERY = REGISTRY.register("battery", () -> new BatteryItem());
	public static final RegistryObject<Item> HYDRAULIC_PRESS = block(KtmodModBlocks.HYDRAULIC_PRESS, KtmodModTabs.TAB_TAB);
	public static final RegistryObject<Item> IRON_PLATE = REGISTRY.register("iron_plate", () -> new IronPlateItem());
	public static final RegistryObject<Item> BEDROCK_CRYSTAL_ARMOR_HELMET = REGISTRY.register("bedrock_crystal_armor_helmet",
			() -> new BedrockCrystalArmorItem.Helmet());
	public static final RegistryObject<Item> BEDROCK_CRYSTAL_ARMOR_CHESTPLATE = REGISTRY.register("bedrock_crystal_armor_chestplate",
			() -> new BedrockCrystalArmorItem.Chestplate());
	public static final RegistryObject<Item> BEDROCK_CRYSTAL_ARMOR_LEGGINGS = REGISTRY.register("bedrock_crystal_armor_leggings",
			() -> new BedrockCrystalArmorItem.Leggings());
	public static final RegistryObject<Item> BEDROCK_CRYSTAL_ARMOR_BOOTS = REGISTRY.register("bedrock_crystal_armor_boots",
			() -> new BedrockCrystalArmorItem.Boots());
	public static final RegistryObject<Item> SMELTER = block(KtmodModBlocks.SMELTER, KtmodModTabs.TAB_TAB);
	public static final RegistryObject<Item> BEDROCK_ALLOY = REGISTRY.register("bedrock_alloy", () -> new BedrockAlloyItem());
	public static final RegistryObject<Item> COPPER_RADIATOR = REGISTRY.register("copper_radiator", () -> new CopperRadiatorItem());
	public static final RegistryObject<Item> ADVANCED_MICROCHIP = REGISTRY.register("advanced_microchip", () -> new AdvancedMicrochipItem());
	public static final RegistryObject<Item> FOSSILS = block(KtmodModBlocks.FOSSILS, KtmodModTabs.TAB_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
