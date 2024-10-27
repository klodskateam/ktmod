
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.klodskateam.ktmod.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import com.klodskateam.ktmod.world.inventory.TankGUIMenu;
import com.klodskateam.ktmod.world.inventory.SolderingStationGUIMenu;
import com.klodskateam.ktmod.world.inventory.ElectricPickaxeGUIMenu;
import com.klodskateam.ktmod.world.inventory.DistillationColumnGUIMenu;
import com.klodskateam.ktmod.world.inventory.BedrockMinerGuiMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KtmodModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<DistillationColumnGUIMenu> DISTILLATION_COLUMN_GUI = register("distillation_column_gui",
			(id, inv, extraData) -> new DistillationColumnGUIMenu(id, inv, extraData));
	public static final MenuType<TankGUIMenu> TANK_GUI = register("tank_gui", (id, inv, extraData) -> new TankGUIMenu(id, inv, extraData));
	public static final MenuType<BedrockMinerGuiMenu> BEDROCK_MINER_GUI = register("bedrock_miner_gui",
			(id, inv, extraData) -> new BedrockMinerGuiMenu(id, inv, extraData));
	public static final MenuType<SolderingStationGUIMenu> SOLDERING_STATION_GUI = register("soldering_station_gui",
			(id, inv, extraData) -> new SolderingStationGUIMenu(id, inv, extraData));
	public static final MenuType<ElectricPickaxeGUIMenu> ELECTRIC_PICKAXE_GUI = register("electric_pickaxe_gui",
			(id, inv, extraData) -> new ElectricPickaxeGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
