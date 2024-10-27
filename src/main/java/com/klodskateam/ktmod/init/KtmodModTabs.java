
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.klodskateam.ktmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class KtmodModTabs {
	public static CreativeModeTab TAB_TAB;

	public static void load() {
		TAB_TAB = new CreativeModeTab("tabtab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(KtmodModBlocks.OIL_ORE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
