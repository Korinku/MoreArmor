package me.korinku.moar.utils;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;

public class PlayerEquipmentUtil {

	public static boolean hasFullArmorMaterial(PlayerEntity playerEntity) {

		if (!playerEntity.getEquippedStack(EquipmentSlot.HEAD).isEmpty()
				&& !playerEntity.getEquippedStack(EquipmentSlot.CHEST).isEmpty()
				&& !playerEntity.getEquippedStack(EquipmentSlot.LEGS).isEmpty()
				&& !playerEntity.getEquippedStack(EquipmentSlot.FEET).isEmpty()) {
			return true;
		}

		// IF NOT FULL ARMOR, RETURN FALSE
		return false;
	}
}
