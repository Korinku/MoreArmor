package me.korinku.moar.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import me.korinku.moar.utils.PlayerEquipmentUtil;
import net.minecraft.entity.player.PlayerEntity;

@Mixin({ PlayerEntity.class })
public class PlayerEntityMixin {

	@Inject(at = @At("HEAD"), method = "tick")
	private void tick(CallbackInfo info) {

		PlayerEntity player = (PlayerEntity) (Object) this;

		if (PlayerEquipmentUtil.hasFullArmorMaterial(player)) {

		}
	}
}
