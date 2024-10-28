
package com.klodskateam.ktmod.item;

import net.minecraft.sounds.SoundEvent;

public abstract class ProtectArmorItem extends ArmorItem {

	public ProtectArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KtmodModItems.DELETED_MOD_ELEMENT.get()));
			}

			@Override
			public String getName() {
				return "protect_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ProtectArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(KtmodModTabs.TAB_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ktmod:textures/models/armor/protect_layer_1.png";
		}

	}

	public static class Chestplate extends ProtectArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(KtmodModTabs.TAB_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ktmod:textures/models/armor/protect_layer_1.png";
		}

	}

	public static class Leggings extends ProtectArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(KtmodModTabs.TAB_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ktmod:textures/models/armor/protect_layer_2.png";
		}

	}

	public static class Boots extends ProtectArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(KtmodModTabs.TAB_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ktmod:textures/models/armor/protect_layer_1.png";
		}

	}

}
