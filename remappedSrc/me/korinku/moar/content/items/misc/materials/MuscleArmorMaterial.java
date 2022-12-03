package me.korinku.moar.content.items.misc.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class MuscleArmorMaterial implements ArmorMaterial {

	private static final int[] BASE_DURABILITY = new int[] { 13, 15, 16, 11 };
	private static final int[] PROTECTION_VALUES = new int[] { 1, 2, 3, 1 };

	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 7;
	}

	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}

	@Override
	public int getEnchantability() {
		return 20;
	}

	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return null;
	}

	@Override
	public String getName() {
		return "muscle";
	}

	@Override
	public float getToughness() {
		return 1.0F;
	}

	@Override
	public float getKnockbackResistance() {
		return 0.9F;
	}
}
