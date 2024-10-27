
package com.klodskateam.ktmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.klodskateam.ktmod.init.KtmodModTabs;

public class CopperWireItem extends Item {
	public CopperWireItem() {
		super(new Item.Properties().tab(KtmodModTabs.TAB_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
