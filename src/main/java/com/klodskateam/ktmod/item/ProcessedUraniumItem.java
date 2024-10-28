
package com.klodskateam.ktmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import com.klodskateam.ktmod.procedures.ProcessedUraniumKoghdaPriedmietVInvientarieProcedure;
import com.klodskateam.ktmod.init.KtmodModTabs;

public class ProcessedUraniumItem extends Item {
	public ProcessedUraniumItem() {
		super(new Item.Properties().tab(KtmodModTabs.TAB_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ProcessedUraniumKoghdaPriedmietVInvientarieProcedure.execute(entity);
	}
}
