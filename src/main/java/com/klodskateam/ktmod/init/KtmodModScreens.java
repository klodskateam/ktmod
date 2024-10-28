
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.klodskateam.ktmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import com.klodskateam.ktmod.client.gui.TankGUIScreen;
import com.klodskateam.ktmod.client.gui.SolderingStationGUIScreen;
import com.klodskateam.ktmod.client.gui.OreProcessorGUIScreen;
import com.klodskateam.ktmod.client.gui.HydraulicPressGUIScreen;
import com.klodskateam.ktmod.client.gui.DistillationColumnGUIScreen;
import com.klodskateam.ktmod.client.gui.BedrockMinerGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KtmodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(KtmodModMenus.DISTILLATION_COLUMN_GUI, DistillationColumnGUIScreen::new);
			MenuScreens.register(KtmodModMenus.TANK_GUI, TankGUIScreen::new);
			MenuScreens.register(KtmodModMenus.BEDROCK_MINER_GUI, BedrockMinerGuiScreen::new);
			MenuScreens.register(KtmodModMenus.SOLDERING_STATION_GUI, SolderingStationGUIScreen::new);
			MenuScreens.register(KtmodModMenus.ORE_PROCESSOR_GUI, OreProcessorGUIScreen::new);
			MenuScreens.register(KtmodModMenus.HYDRAULIC_PRESS_GUI, HydraulicPressGUIScreen::new);
		});
	}
}
