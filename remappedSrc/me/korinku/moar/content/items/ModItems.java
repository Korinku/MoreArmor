package me.korinku.moar.content.items;

import me.korinku.moar.MoreArmor;
import me.korinku.moar.content.items.misc.materials.MuscleArmorMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

	// ARMOR MATERIAL

	public static final ArmorMaterial MUSCLE_ARMOR_MATERIAL = new MuscleArmorMaterial();

	public static final Item MUSCLE_ARMOR_HELMET = registerItem("muscle_armor_helmet",
			new ArmorItem(MUSCLE_ARMOR_MATERIAL, EquipmentSlot.HEAD,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(MoreArmor.MOD_ID, name), item);
	}

	public static void init() {
		MoreArmor.LOGGER.info("Registering Mod Items for " + MoreArmor.MOD_ID);
	}
}
