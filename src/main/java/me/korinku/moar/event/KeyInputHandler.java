package me.korinku.moar.event;

import org.lwjgl.glfw.GLFW;

import me.korinku.moar.networking.ModPackets;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

public class KeyInputHandler {

	public static final String KEY_CATEGORY_MOAR = "key.category.moar";
	public static final String KEY_SHOOT_FIREBALLS = "key.moar.shoot.fireballs";

	public static KeyBinding shootingKey;

	public static void registerKeyInputs() {
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if (shootingKey.wasPressed()) {
				ClientPlayNetworking.send(ModPackets.SHOOTING_FIREBALL, PacketByteBufs.create());
				ClientPlayNetworking.send(ModPackets.DRAGON_BREATHE, PacketByteBufs.create());
			}
		});

	}

	public static void register() {
		shootingKey = KeyBindingHelper.registerKeyBinding(
				new KeyBinding(KEY_SHOOT_FIREBALLS, InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_G, KEY_CATEGORY_MOAR));

		registerKeyInputs();
	}
}
