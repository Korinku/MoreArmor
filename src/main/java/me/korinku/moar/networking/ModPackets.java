package me.korinku.moar.networking;

import me.korinku.moar.MoreArmor;
import me.korinku.moar.networking.packets.DragonBreatheC2SPacket;
import me.korinku.moar.networking.packets.ShootingFireballC2SPacket;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class ModPackets {

	public static final Identifier SHOOTING_FIREBALL = new Identifier(MoreArmor.MOD_ID, "shooting_fireball");

	public static final Identifier DRAGON_BREATHE = new Identifier(MoreArmor.MOD_ID, "dragon_breathe");

	public static void registerC2SPackets() {
		ServerPlayNetworking.registerGlobalReceiver(SHOOTING_FIREBALL, ShootingFireballC2SPacket::receive);

		ServerPlayNetworking.registerGlobalReceiver(DRAGON_BREATHE, DragonBreatheC2SPacket::receive);
	}

	public static void registerS2CPackets() {

	}

}
