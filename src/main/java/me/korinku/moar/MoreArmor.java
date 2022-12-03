package me.korinku.moar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.korinku.moar.content.entities.EndProjectileEntity;
import me.korinku.moar.content.items.ModItems;
import me.korinku.moar.networking.ModPackets;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoreArmor implements ModInitializer {

	// MOD ID
	public static final String MOD_ID = "moar";

	// LOGGER
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// CREATE ITEM GROUP
	public static final ItemGroup MOAR_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "moar_group"),
			() -> new ItemStack(Items.SMITHING_TABLE));

	public static final EntityType<EndProjectileEntity> END_PROJECTILE = FabricEntityTypeBuilder
			.<EndProjectileEntity>create(SpawnGroup.MISC, EndProjectileEntity::new)
			.dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build();

	@Override
	public void onInitialize() {

		// INIT ITEMS, BLOCKS & ENTITIES
		ModItems.init();

		Registry.register(Registry.ENTITY_TYPE, new Identifier(MOD_ID, "end_projectile"), END_PROJECTILE);

		ModPackets.registerC2SPackets();

	}
}
