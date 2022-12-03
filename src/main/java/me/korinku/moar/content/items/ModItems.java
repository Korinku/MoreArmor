package me.korinku.moar.content.items;

import me.korinku.moar.content.items.misc.materials.GhastArmorMaterial;
import me.korinku.moar.content.items.misc.materials.DragonArmorMaterial;
import me.korinku.moar.content.items.misc.materials.HopperArmorMaterial;
import me.korinku.moar.content.items.misc.materials.InvisibilityArmorMaterial;
import me.korinku.moar.content.items.misc.materials.KnightArmorMaterial;
import me.korinku.moar.content.items.misc.materials.PhotosyntesisArmorMaterial;
import me.korinku.moar.content.items.misc.materials.RainbowArmorMaterial;
import me.korinku.moar.MoreArmor;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

	// ARMOR MATERIAL

	public static final ArmorMaterial KNIGHT_ARMOR_MATERIAL = new KnightArmorMaterial();
	public static final ArmorMaterial HOPPER_ARMOR_MATERIAL = new HopperArmorMaterial();
	public static final ArmorMaterial INVIS_ARMOR_MATERIAL = new InvisibilityArmorMaterial();
	public static final ArmorMaterial PHOTO_ARMOR_MATERIAL = new PhotosyntesisArmorMaterial();
	public static final ArmorMaterial RAINBOW_ARMOR_MATERIAL = new RainbowArmorMaterial();
	public static final ArmorMaterial GHAST_ARMOR_MATERIAL = new GhastArmorMaterial();
	public static final ArmorMaterial DRAGON_ARMOR_MATERIAL = new DragonArmorMaterial();

	// HOPPER ARMOR
	public static final Item HOPPER_ARMOR_HELMET = registerItem("armor/hopper_armor_helmet",
			new ArmorItem(HOPPER_ARMOR_MATERIAL, EquipmentSlot.HEAD,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item HOPPER_ARMOR_CHESTPLATE = registerItem("armor/hopper_armor_chestplate",
			new ArmorItem(HOPPER_ARMOR_MATERIAL, EquipmentSlot.CHEST,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item HOPPER_ARMOR_LEGS = registerItem("armor/hopper_armor_legs",
			new ArmorItem(HOPPER_ARMOR_MATERIAL, EquipmentSlot.LEGS,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item HOPPER_ARMOR_BOOTS = registerItem("armor/hopper_armor_boots",
			new ArmorItem(HOPPER_ARMOR_MATERIAL, EquipmentSlot.FEET,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	// KNIGHT
	public static final Item KNIGHT_ARMOR_HELMET = registerItem("armor/knight_armor_helmet",
			new ArmorItem(KNIGHT_ARMOR_MATERIAL, EquipmentSlot.HEAD,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item KNIGHT_ARMOR_CHESTPLATE = registerItem("armor/knight_armor_chestplate",
			new ArmorItem(KNIGHT_ARMOR_MATERIAL, EquipmentSlot.CHEST,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item KNIGHT_ARMOR_LEGS = registerItem("armor/knight_armor_legs",
			new ArmorItem(KNIGHT_ARMOR_MATERIAL, EquipmentSlot.LEGS,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item KNIGHT_ARMOR_BOOTS = registerItem("armor/knight_armor_boots",
			new ArmorItem(KNIGHT_ARMOR_MATERIAL, EquipmentSlot.FEET,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	// INVIS ARMOR
	public static final Item INVIS_ARMOR_HELMET = registerItem("armor/invis_armor_helmet",
			new ArmorItem(INVIS_ARMOR_MATERIAL, EquipmentSlot.HEAD,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item INVIS_ARMOR_CHESTPLATE = registerItem("armor/invis_armor_chestplate",
			new ArmorItem(INVIS_ARMOR_MATERIAL, EquipmentSlot.CHEST,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item INVIS_ARMOR_LEGS = registerItem("armor/invis_armor_legs",
			new ArmorItem(INVIS_ARMOR_MATERIAL, EquipmentSlot.LEGS,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item INVIS_ARMOR_BOOTS = registerItem("armor/invis_armor_boots",
			new ArmorItem(INVIS_ARMOR_MATERIAL, EquipmentSlot.FEET,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	// PHOTO ARMOR
	public static final Item PHOTO_ARMOR_HELMET = registerItem("armor/photo_armor_helmet",
			new ArmorItem(
					PHOTO_ARMOR_MATERIAL, EquipmentSlot.HEAD,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item PHOTO_ARMOR_CHESTPLATE = registerItem("armor/photo_armor_chestplate",
			new ArmorItem(
					PHOTO_ARMOR_MATERIAL, EquipmentSlot.CHEST,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item PHOTO_ARMOR_LEGS = registerItem("armor/photo_armor_legs",
			new ArmorItem(
					PHOTO_ARMOR_MATERIAL, EquipmentSlot.LEGS,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item PHOTO_ARMOR_BOOTS = registerItem("armor/photo_armor_boots",
			new ArmorItem(
					PHOTO_ARMOR_MATERIAL, EquipmentSlot.FEET,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	// RAINBOW ARMOR
	public static final Item RAINBOW_ARMOR_HELMET = registerItem("armor/rainbow_armor_helmet",
			new ArmorItem(
					RAINBOW_ARMOR_MATERIAL, EquipmentSlot.HEAD,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item RAINBOW_ARMOR_CHESTPLATE = registerItem("armor/rainbow_armor_chestplate",
			new ArmorItem(
					RAINBOW_ARMOR_MATERIAL, EquipmentSlot.CHEST,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item RAINBOW_ARMOR_LEGS = registerItem("armor/rainbow_armor_legs",
			new ArmorItem(
					RAINBOW_ARMOR_MATERIAL, EquipmentSlot.LEGS,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item RAINBOW_ARMOR_BOOTS = registerItem("armor/rainbow_armor_boots",
			new ArmorItem(
					RAINBOW_ARMOR_MATERIAL, EquipmentSlot.FEET,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	// RAINBOW ARMOR
	public static final Item GHAST_ARMOR_HELMET = registerItem("armor/ghast_armor_helmet",
			new ArmorItem(
					GHAST_ARMOR_MATERIAL, EquipmentSlot.HEAD,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item GHAST_ARMOR_CHESTPLATE = registerItem("armor/ghast_armor_chestplate",
			new ArmorItem(
					GHAST_ARMOR_MATERIAL, EquipmentSlot.CHEST,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item GHAST_ARMOR_LEGS = registerItem("armor/ghast_armor_legs",
			new ArmorItem(
					GHAST_ARMOR_MATERIAL, EquipmentSlot.LEGS,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item GHAST_ARMOR_BOOTS = registerItem("armor/ghast_armor_boots",
			new ArmorItem(
					GHAST_ARMOR_MATERIAL, EquipmentSlot.FEET,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	// RAINBOW ARMOR
	public static final Item DRAGON_ARMOR_HELMET = registerItem("armor/dragon_armor_helmet",
			new ArmorItem(
					DRAGON_ARMOR_MATERIAL, EquipmentSlot.HEAD,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item DRAGON_ARMOR_CHESTPLATE = registerItem("armor/dragon_armor_chestplate",
			new ArmorItem(
					DRAGON_ARMOR_MATERIAL, EquipmentSlot.CHEST,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item DRAGON_ARMOR_LEGS = registerItem("armor/dragon_armor_legs",
			new ArmorItem(
					DRAGON_ARMOR_MATERIAL, EquipmentSlot.LEGS,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	public static final Item DRAGON_ARMOR_BOOTS = registerItem("armor/dragon_armor_boots",
			new ArmorItem(
					DRAGON_ARMOR_MATERIAL, EquipmentSlot.FEET,
					new FabricItemSettings().group(MoreArmor.MOAR_GROUP)));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(MoreArmor.MOD_ID, name), item);
	}

	public static void init() {
		MoreArmor.LOGGER.info("Registering Mod Items for " + MoreArmor.MOD_ID);
	}
}
