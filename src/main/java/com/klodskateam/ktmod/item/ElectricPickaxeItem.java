
package com.klodskateam.ktmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.klodskateam.ktmod.init.KtmodModTabs;
import com.klodskateam.ktmod.init.KtmodModItems;

public class ElectricPickaxeItem extends PickaxeItem {
	public ElectricPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KtmodModItems.BATTERY.get()));
			}
		}, 1, -3f, new Item.Properties().tab(KtmodModTabs.TAB_TAB));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("When you are lazy"));
		list.add(new TextComponent("try making electricity your friend"));
	}
}
