package me.korinku.moar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.korinku.moar.content.items.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class MoreArmor implements ModInitializer {

	// MOD ID
	public static final String MOD_ID = "moar";

	// LOGGER
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// CREATE ITEM GROUP

	public static final ItemGroup MOAR_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "moar_group"),
			() -> new ItemStack(Items.SMITHING_TABLE));

	@Override
	public void onInitialize() {

		// INIT ITEMS, BLOCKS & ENTITIES
		ModItems.init();

	}
}
