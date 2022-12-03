package me.korinku.moar.client;

import me.korinku.moar.MoreArmor;
import me.korinku.moar.content.entities.EntityCreatePacket;
import me.korinku.moar.content.entities.SoulEntityRenderer;
import me.korinku.moar.event.KeyInputHandler;
import me.korinku.moar.networking.ModPackets;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class MoreArmorClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		KeyInputHandler.register();

		ModPackets.registerS2CPackets();

		EntityRendererRegistry.register(MoreArmor.END_PROJECTILE, SoulEntityRenderer::new);

		ClientPlayNetworking.registerGlobalReceiver(EntityCreatePacket.ID, EntityCreatePacket::onPacket);
	}

}
