package net.tslat.aoa3.entity.projectile.staff;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.item.EnergyProjectileWeapon;

public class PowerShotEntity extends BaseEnergyShot {
	public PowerShotEntity(EntityType<? extends ThrowableEntity> entityType, World world) {
		super(entityType, world);
	}
	
	public PowerShotEntity(World world) {
		super(AoAEntities.Projectiles.POWER_SHOT.get(), world);
	}

	public PowerShotEntity(LivingEntity shooter, EnergyProjectileWeapon weapon, int maxAge) {
		super(AoAEntities.Projectiles.POWER_SHOT.get(), shooter, weapon, maxAge);
	}

	public PowerShotEntity(World world, double x, double y, double z) {
		super(AoAEntities.Projectiles.POWER_SHOT.get(), world, x, y, z);
	}
}
