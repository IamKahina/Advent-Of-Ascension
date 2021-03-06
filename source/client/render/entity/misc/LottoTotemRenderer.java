package net.tslat.aoa3.client.render.entity.misc;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.tslat.aoa3.client.model.entity.misc.LottoTotemModel;

import javax.annotation.Nullable;

public class LottoTotemRenderer extends EntityRenderer<Entity> {
	private final ResourceLocation texture = new ResourceLocation("aoa3", "textures/entities/misc/lotto_totem.png");
	private final EntityModel<Entity> model = new LottoTotemModel();

	public LottoTotemRenderer(EntityRendererManager renderManager) {
		super(renderManager);
	}

	@Override
	public void render(Entity entity, float entityYaw, float partialTicks, MatrixStack matrix, IRenderTypeBuffer buffer, int packedLight) {
		matrix.push();
		matrix.translate(0, 1.5d, 0);
		matrix.rotate(Vector3f.XP.rotationDegrees(180));
		matrix.scale(-1, 1, -1);

		IVertexBuilder vertexBuilder = buffer.getBuffer(RenderType.getEntityCutoutNoCull(texture));

		model.setRotationAngles(entity, 0, 0, entity.ticksExisted, entityYaw, 0);
		model.render(matrix, vertexBuilder, packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);

		matrix.pop();

		super.render(entity, entityYaw, partialTicks, matrix, buffer, packedLight);
	}

	@Nullable
	@Override
	public ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
}
