
package com.klodskateam.ktmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class ProcessedUraniumItem extends Item {

	public ProcessedUraniumItem() {
		super(new Item.Properties().tab(KtmodModTabs.TAB_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ProcessedUraniumKoghdaPriedmietVInvientarieProcedure.execute(

		);
	}

}
