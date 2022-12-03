package me.korinku.moar.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import me.korinku.moar.content.items.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

@Mixin({ PlayerEntity.class })
public abstract class PlayerEntityMixin extends LivingEntity {

	protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
		super(entityType, world);
	}

	@Inject(at = @At("HEAD"), cancellable = true, method = "getBlockBreakingSpeed(Lnet/minecraft/block/BlockState;)F")
	public void getBlockBreakingSpeed(BlockState block, CallbackInfoReturnable<Float> cir) {

		PlayerEntity player = (PlayerEntity) (Object) this;

		if (player.getEquippedStack(EquipmentSlot.HEAD).getItem().equals(ModItems.RAINBOW_ARMOR_HELMET)) {
			if (player.getEquippedStack(EquipmentSlot.CHEST).getItem().equals(ModItems.RAINBOW_ARMOR_CHESTPLATE)) {
				if (player.getEquippedStack(EquipmentSlot.LEGS).getItem().equals(ModItems.RAINBOW_ARMOR_LEGS)) {
					if (player.getEquippedStack(EquipmentSlot.FEET).getItem()
							.equals(ModItems.RAINBOW_ARMOR_BOOTS)) {
						cir.setReturnValue(1000.0F);
					}
				}
			}
		}
	}

	private int ticks;

	private int amplifier = 0;

	@Inject(at = @At("HEAD"), method = "tick")
	private void tick(CallbackInfo info) {

		PlayerEntity player = (PlayerEntity) (Object) this;

		if (player.getEquippedStack(EquipmentSlot.HEAD).getItem().equals(ModItems.KNIGHT_ARMOR_HELMET)) {
			if (player.getEquippedStack(EquipmentSlot.CHEST).getItem().equals(ModItems.KNIGHT_ARMOR_CHESTPLATE)) {
				if (player.getEquippedStack(EquipmentSlot.LEGS).getItem().equals(ModItems.KNIGHT_ARMOR_LEGS)) {
					if (player.getEquippedStack(EquipmentSlot.FEET).getItem()
							.equals(ModItems.KNIGHT_ARMOR_BOOTS)) {
						player.addStatusEffect(
								new StatusEffectInstance(StatusEffects.STRENGTH, 20, 9, false, false, false));
						player.addStatusEffect(
								new StatusEffectInstance(StatusEffects.SLOWNESS, 20, 2, false, false, false));

						// ! change loot dropped to op items
					}
				}
			}
		}

		if (player.getEquippedStack(EquipmentSlot.HEAD).getItem().equals(ModItems.PHOTO_ARMOR_HELMET)) {
			if (player.getEquippedStack(EquipmentSlot.CHEST).getItem().equals(ModItems.PHOTO_ARMOR_CHESTPLATE)) {
				if (player.getEquippedStack(EquipmentSlot.LEGS).getItem().equals(ModItems.PHOTO_ARMOR_LEGS)) {
					if (player.getEquippedStack(EquipmentSlot.FEET).getItem()
							.equals(ModItems.PHOTO_ARMOR_BOOTS)) {
						if (world.getLightLevel(player.getBlockPos()) == 15) {
							if (ticks > 40) {
								player.addStatusEffect(
										new StatusEffectInstance(StatusEffects.ABSORPTION, 50, amplifier, false,
												false,
												false));
								ticks = 0;
								amplifier = amplifier + 1;
							}
							ticks++;
						} else {
							amplifier = 0;
						}
					}
				}
			}
		}

		if (player.getEquippedStack(EquipmentSlot.HEAD).getItem().equals(ModItems.INVIS_ARMOR_HELMET)) {
			if (player.getEquippedStack(EquipmentSlot.CHEST).getItem().equals(ModItems.INVIS_ARMOR_CHESTPLATE)) {
				if (player.getEquippedStack(EquipmentSlot.LEGS).getItem().equals(ModItems.INVIS_ARMOR_LEGS)) {
					if (player.getEquippedStack(EquipmentSlot.FEET).getItem()
							.equals(ModItems.INVIS_ARMOR_BOOTS)) {
						player.addStatusEffect(
								new StatusEffectInstance(StatusEffects.INVISIBILITY, 20, 1, false, false, false));
					}
				}
			}
		}

		if (player.getEquippedStack(EquipmentSlot.HEAD).getItem().equals(ModItems.RAINBOW_ARMOR_HELMET)) {
			if (player.getEquippedStack(EquipmentSlot.CHEST).getItem().equals(ModItems.RAINBOW_ARMOR_CHESTPLATE)) {
				if (player.getEquippedStack(EquipmentSlot.LEGS).getItem().equals(ModItems.RAINBOW_ARMOR_LEGS)) {
					if (player.getEquippedStack(EquipmentSlot.FEET).getItem()
							.equals(ModItems.RAINBOW_ARMOR_BOOTS)) {
						player.addStatusEffect(
								new StatusEffectInstance(StatusEffects.REGENERATION, 20, 9, false, false, false));
						player.addStatusEffect(
								new StatusEffectInstance(StatusEffects.SPEED, 20, 0, false, false, false));

					}
				}
			}
		}

		if (player.getEquippedStack(EquipmentSlot.HEAD).getItem().equals(ModItems.HOPPER_ARMOR_HELMET)
				&& player.getEquippedStack(EquipmentSlot.CHEST).getItem().equals(ModItems.HOPPER_ARMOR_CHESTPLATE)
				&& player.getEquippedStack(EquipmentSlot.LEGS).getItem().equals(ModItems.HOPPER_ARMOR_LEGS)
				&& player.getEquippedStack(EquipmentSlot.FEET).getItem()
						.equals(ModItems.HOPPER_ARMOR_BOOTS)) {
			if (ticks > 100) {

				int rnd = new Random().nextInt(99);

				ItemEntity itemEntity;

				if (rnd < 5) {
					itemEntity = new ItemEntity(world, this.getX(), this.getY(),
							this.getZ(), new ItemStack(Items.DIAMOND, 1));
					itemEntity.setPickupDelay(30);
				} else if (rnd >= 5 && rnd < 15) {
					itemEntity = new ItemEntity(world, this.getX(), this.getY(),
							this.getZ(), new ItemStack(Items.IRON_INGOT, 5));
					itemEntity.setPickupDelay(30);
				} else if (rnd >= 15 && rnd < 30) {
					itemEntity = new ItemEntity(world, this.getX(), this.getY(),
							this.getZ(), new ItemStack(Items.GOLD_INGOT, 2));
					itemEntity.setPickupDelay(30);
				} else if (rnd >= 30 && rnd < 50) {
					itemEntity = new ItemEntity(world, this.getX(), this.getY(),
							this.getZ(), new ItemStack(Items.BREAD, 12));
					itemEntity.setPickupDelay(30);
				} else if (rnd >= 50 && rnd < 55) {
					itemEntity = new ItemEntity(world, this.getX(), this.getY(),
							this.getZ(), new ItemStack(Items.ENDER_PEARL, 2));
					itemEntity.setPickupDelay(30);
				} else if (rnd >= 55 && rnd < 75) {
					itemEntity = new ItemEntity(world, this.getX(), this.getY(),
							this.getZ(), new ItemStack(Items.LAPIS_LAZULI, 3));
					itemEntity.setPickupDelay(30);
				} else if (rnd >= 75 && rnd < 85) {
					itemEntity = new ItemEntity(world, this.getX(), this.getY(),
							this.getZ(), new ItemStack(Items.DIRT, 32));
					itemEntity.setPickupDelay(30);
				} else if (rnd >= 85 && rnd < 99) {
					itemEntity = new ItemEntity(world, this.getX(), this.getY(),
							this.getZ(), new ItemStack(Items.CAKE, 1));
					itemEntity.setPickupDelay(30);
				} else {
					itemEntity = new ItemEntity(world, this.getX(), this.getY(),
							this.getZ(), new ItemStack(Items.OBSIDIAN, 12));
					itemEntity.setPickupDelay(30);
				}

				world.spawnEntity(itemEntity);

				ticks = 0;
			}
			ticks++;
			player.addStatusEffect(
					new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20, 9, false, false, false));
		}

		if (player.getEquippedStack(EquipmentSlot.HEAD).getItem().equals(ModItems.DRAGON_ARMOR_HELMET)
				&& player.getEquippedStack(EquipmentSlot.CHEST).getItem().equals(ModItems.DRAGON_ARMOR_CHESTPLATE)
				&& player.getEquippedStack(EquipmentSlot.LEGS).getItem().equals(ModItems.DRAGON_ARMOR_LEGS)
				&& player.getEquippedStack(EquipmentSlot.FEET).getItem().equals(ModItems.DRAGON_ARMOR_BOOTS)) {
			if (!player.getAbilities().creativeMode && !player.isSpectator()) {
				player.getAbilities().allowFlying = true;
			}
		} else {
			if (!player.getAbilities().creativeMode && !player.isSpectator()) {
				player.getAbilities().allowFlying = false;
				player.getAbilities().flying = false;
			}
		}

	}
}
