package me.korinku.moar.networking.packets;

import me.korinku.moar.content.items.ModItems;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.Vec3d;

public class ShootingFireballC2SPacket {
	public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
			PacketByteBuf buf, PacketSender responseSender) {
		// EVERYTHING HERE HAPPENS ONLY SERVER

		ServerWorld world = player.getWorld();

		if (isFullArmor(player)) {

			FireballEntity fireballEntity = new FireballEntity(world, player, 0, 0, 0, 2);

			Vec3d vec3d = player.getRotationVec(1.0f);

			fireballEntity.setPosition(player.getX() + vec3d.x * 4.0, player.getBodyY(0.5) + 0.5,
					fireballEntity.getZ() + vec3d.z * 4.0);
			fireballEntity.setVelocity(
					player, player.getPitch(), player.getYaw(), 0.0f,
					2.5f, 1.0f);
			fireballEntity.setNoGravity(true);
			fireballEntity.setOwner(player);

			player.playSound(SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.PLAYERS, 1.0f,
					1.0f);
			world.spawnEntity(fireballEntity);

			fireballEntity.checkDespawn();

		}

	}

	private static boolean isFullArmor(ServerPlayerEntity player) {
		if (player.getEquippedStack(EquipmentSlot.HEAD).getItem().equals(ModItems.GHAST_ARMOR_HELMET)
				&& player.getEquippedStack(EquipmentSlot.CHEST).getItem().equals(ModItems.GHAST_ARMOR_CHESTPLATE)
				&& player.getEquippedStack(EquipmentSlot.LEGS).getItem().equals(ModItems.GHAST_ARMOR_LEGS)
				&& player.getEquippedStack(EquipmentSlot.FEET).getItem()
						.equals(ModItems.GHAST_ARMOR_BOOTS)) {
			return true;
		}
		return false;
	}
}
