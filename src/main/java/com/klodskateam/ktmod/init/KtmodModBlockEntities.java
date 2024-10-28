
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.klodskateam.ktmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import com.klodskateam.ktmod.block.entity.TankBlockEntity;
import com.klodskateam.ktmod.block.entity.SolderingStationBlockEntity;
import com.klodskateam.ktmod.block.entity.SmelterBlockEntity;
import com.klodskateam.ktmod.block.entity.OreProcessorBlockEntity;
import com.klodskateam.ktmod.block.entity.HydraulicPressBlockEntity;
import com.klodskateam.ktmod.block.entity.DistillationColumnBlockEntity;
import com.klodskateam.ktmod.block.entity.BedrockMinerBlockEntity;
import com.klodskateam.ktmod.KtmodMod;

public class KtmodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, KtmodMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DISTILLATION_COLUMN = register("distillation_column", KtmodModBlocks.DISTILLATION_COLUMN,
			DistillationColumnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BEDROCK_MINER = register("bedrock_miner", KtmodModBlocks.BEDROCK_MINER,
			BedrockMinerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TANK = register("tank", KtmodModBlocks.TANK, TankBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLDERING_STATION = register("soldering_station", KtmodModBlocks.SOLDERING_STATION,
			SolderingStationBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ORE_PROCESSOR = register("ore_processor", KtmodModBlocks.ORE_PROCESSOR,
			OreProcessorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HYDRAULIC_PRESS = register("hydraulic_press", KtmodModBlocks.HYDRAULIC_PRESS,
			HydraulicPressBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SMELTER = register("smelter", KtmodModBlocks.SMELTER, SmelterBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
