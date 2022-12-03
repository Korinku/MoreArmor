package me.korinku.moar.networking.packets;

import me.korinku.moar.content.entities.EndProjectileEntity;
import me.korinku.moar.content.items.ModItems;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;

public class DragonBreatheC2SPacket {
	public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
			PacketByteBuf buf, PacketSender responseSender) {
		// EVERYTHING HERE HAPPENS ONLY SERVER

		ServerWorld world = player.getWorld();

		if (isFullArmor(player)) {

			for (int i = 0; i < 5; i++) {
				EndProjectileEntity projectile = new EndProjectileEntity(world, player);
				projectile.refreshPositionAndAngles(player.getX(), player.getEyeY(), player.getZ(), 0,
						0);
				projectile.setVelocity(player, player.getPitch(), player.getYaw() + 5 * i, 0f, 1.5f, 1);
				projectile.setDamage(5.0F);
				projectile.setOwner(player);

				world.spawnEntity(projectile);
			}

			player.playSound(SoundEvents.ENTITY_ENDER_DRAGON_SHOOT, SoundCategory.PLAYERS, 1.0f,
					1.0f);

		}

	}

	private static boolean isFullArmor(ServerPlayerEntity player) {
		if (player.getEquippedStack(EquipmentSlot.HEAD).getItem().equals(ModItems.DRAGON_ARMOR_HELMET)
				&& player.getEquippedStack(EquipmentSlot.CHEST).getItem().equals(ModItems.DRAGON_ARMOR_CHESTPLATE)
				&& player.getEquippedStack(EquipmentSlot.LEGS).getItem().equals(ModItems.DRAGON_ARMOR_LEGS)
				&& player.getEquippedStack(EquipmentSlot.FEET).getItem()
						.equals(ModItems.DRAGON_ARMOR_BOOTS)) {
			return true;
		}
		return false;
	}
}
