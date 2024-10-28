
package com.klodskateam.ktmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.klodskateam.ktmod.init.KtmodModTabs;

public class RubberItem extends Item {
	public RubberItem() {
		super(new Item.Properties().tab(KtmodModTabs.TAB_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
