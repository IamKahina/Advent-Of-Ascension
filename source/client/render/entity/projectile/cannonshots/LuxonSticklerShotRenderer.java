package net.tslat.aoa3.client.render.entity.projectile.cannonshots;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.tslat.aoa3.common.registration.AoAParticleTypes;
import net.tslat.aoa3.entity.projectile.cannon.LuxonSticklerShotEntity;
import net.tslat.aoa3.library.misc.CustomisableParticleType;
import net.tslat.aoa3.util.NumberUtil;

import javax.annotation.Nullable;

public class LuxonSticklerShotRenderer extends EntityRenderer<LuxonSticklerShotEntity> {
	private final ResourceLocation texture;

	public LuxonSticklerShotRenderer(final EntityRendererManager manager, final ResourceLocation textureResource) {
		super(manager);
		texture = textureResource;
	}

	@Override
	public void render(LuxonSticklerShotEntity entity, float entityYaw, float partialTicks, MatrixStack matrix, IRenderTypeBuffer buffer, int packedLight) {
		for (int i = 0; i < 14; i++) {
			entity.world.addParticle(new CustomisableParticleType.Data(AoAParticleTypes.SPARKLER.get(), 1, 3, NumberUtil.RGB(0, 255, 255)), entity.getPosX(), entity.getPosY(), entity.getPosZ(), 0, 0, 0);
		}
	}

	@Nullable
	@Override
	public ResourceLocation getEntityTexture(LuxonSticklerShotEntity entity) {
		return texture;
	}
}
