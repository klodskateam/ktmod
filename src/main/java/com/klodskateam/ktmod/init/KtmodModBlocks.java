
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.klodskateam.ktmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import com.klodskateam.ktmod.block.UranOreBlock;
import com.klodskateam.ktmod.block.TankBlock;
import com.klodskateam.ktmod.block.SolderingStationBlock;
import com.klodskateam.ktmod.block.ProcessedBedrockBlock;
import com.klodskateam.ktmod.block.OilOreBlock;
import com.klodskateam.ktmod.block.NetherOilOreBlock;
import com.klodskateam.ktmod.block.FuelBlock;
import com.klodskateam.ktmod.block.DistillationColumnBlock;
import com.klodskateam.ktmod.block.BedrockMinerBlock;
import com.klodskateam.ktmod.KtmodMod;

public class KtmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KtmodMod.MODID);
	public static final RegistryObject<Block> OIL_ORE = REGISTRY.register("oil_ore", () -> new OilOreBlock());
	public static final RegistryObject<Block> NETHER_OIL_ORE = REGISTRY.register("nether_oil_ore", () -> new NetherOilOreBlock());
	public static final RegistryObject<Block> DISTILLATION_COLUMN = REGISTRY.register("distillation_column", () -> new DistillationColumnBlock());
	public static final RegistryObject<Block> FUEL = REGISTRY.register("fuel", () -> new FuelBlock());
	public static final RegistryObject<Block> BEDROCK_MINER = REGISTRY.register("bedrock_miner", () -> new BedrockMinerBlock());
	public static final RegistryObject<Block> TANK = REGISTRY.register("tank", () -> new TankBlock());
	public static final RegistryObject<Block> PROCESSED_BEDROCK = REGISTRY.register("processed_bedrock", () -> new ProcessedBedrockBlock());
	public static final RegistryObject<Block> SOLDERING_STATION = REGISTRY.register("soldering_station", () -> new SolderingStationBlock());
	public static final RegistryObject<Block> URAN_ORE = REGISTRY.register("uran_ore", () -> new UranOreBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			TankBlock.registerRenderLayer();
			SolderingStationBlock.registerRenderLayer();
		}
	}
}
