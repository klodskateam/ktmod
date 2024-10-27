
package com.klodskateam.ktmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import com.klodskateam.ktmod.init.KtmodModTabs;
import com.klodskateam.ktmod.init.KtmodModFluids;

public class FuelItem extends BucketItem {
	public FuelItem() {
		super(KtmodModFluids.FUEL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(KtmodModTabs.TAB_TAB));
	}
}
