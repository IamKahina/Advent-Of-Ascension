package net.tslat.aoa3.client.model.entity.mob.lunalus;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;

public class VisulonModel extends EntityModel<MobEntity> {
	private final ModelRenderer shape1;
	private final ModelRenderer shape2;
	private final ModelRenderer shape3;
	private final ModelRenderer shape4;
	private final ModelRenderer shape5;
	private final ModelRenderer shape6;
	private final ModelRenderer shape8;
	private final ModelRenderer shape7;
	private final ModelRenderer shape9;
	private final ModelRenderer shape10;
	private final ModelRenderer shape11;
	private final ModelRenderer shape12;
	private final ModelRenderer shape13;
	private final ModelRenderer shape14;
	private final ModelRenderer shape15;
	private final ModelRenderer shape16;
	private final ModelRenderer shape17;
	private final ModelRenderer shape18;
	private final ModelRenderer shape19;
	private final ModelRenderer shape20;
	private final ModelRenderer shape21;

	public VisulonModel() {
		textureWidth = 128;
		textureHeight = 64;
		(shape1 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 2);
		shape1.setRotationPoint(2.0f, -8.0f, 2.0f);
		shape1.setTextureSize(128, 64);
		shape1.mirror = true;
		setRotation(shape1, 0.0f, 0.0f, 0.0f);
		(shape2 = new ModelRenderer(this, 42, 40)).addBox(0.0f, 0.0f, 0.0f, 10, 10, 10);
		shape2.setRotationPoint(11.0f, -2.0f, -5.0f);
		shape2.setTextureSize(128, 64);
		shape2.mirror = true;
		setRotation(shape2, 0.0f, 0.0f, 0.0f);
		(shape3 = new ModelRenderer(this, 85, 37)).addBox(0.0f, 0.0f, 0.0f, 10, 10, 10);
		shape3.setRotationPoint(-5.0f, -2.0f, -5.0f);
		shape3.setTextureSize(128, 64);
		shape3.mirror = true;
		setRotation(shape3, 0.0f, 0.0f, 0.0f);
		(shape4 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 2);
		shape4.setRotationPoint(-4.0f, -8.0f, 2.0f);
		shape4.setTextureSize(128, 64);
		shape4.mirror = true;
		setRotation(shape4, 0.0f, 0.0f, 0.0f);
		(shape5 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 2);
		shape5.setRotationPoint(2.0f, -8.0f, -4.0f);
		shape5.setTextureSize(128, 64);
		shape5.mirror = true;
		setRotation(shape5, 0.0f, 0.0f, 0.0f);
		(shape6 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 2);
		shape6.setRotationPoint(-4.0f, -8.0f, -4.0f);
		shape6.setTextureSize(128, 64);
		shape6.mirror = true;
		setRotation(shape6, 0.0f, 0.0f, 0.0f);
		(shape8 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 2);
		shape8.setRotationPoint(-4.0f, 8.0f, -4.0f);
		shape8.setTextureSize(128, 64);
		shape8.mirror = true;
		setRotation(shape8, 0.0f, 0.0f, 0.0f);
		(shape7 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 6, 2, 2);
		shape7.setRotationPoint(-11.0f, 4.0f, 2.0f);
		shape7.setTextureSize(128, 64);
		shape7.mirror = true;
		setRotation(shape7, 0.0f, 0.0f, 0.0f);
		(shape9 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 6, 2, 2);
		shape9.setRotationPoint(-11.0f, 4.0f, -4.0f);
		shape9.setTextureSize(128, 64);
		shape9.mirror = true;
		setRotation(shape9, 0.0f, 0.0f, 0.0f);
		(shape10 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 2);
		shape10.setRotationPoint(-4.0f, 8.0f, 2.0f);
		shape10.setTextureSize(128, 64);
		shape10.mirror = true;
		setRotation(shape10, 0.0f, 0.0f, 0.0f);
		(shape11 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 10, 10, 10);
		shape11.setRotationPoint(-5.0f, 14.0f, -5.0f);
		shape11.setTextureSize(128, 64);
		shape11.mirror = true;
		setRotation(shape11, 0.0f, 0.0f, 0.0f);
		(shape12 = new ModelRenderer(this, 43, 0)).addBox(0.0f, 0.0f, 0.0f, 10, 10, 10);
		shape12.setRotationPoint(-5.0f, -18.0f, -5.0f);
		shape12.setTextureSize(128, 64);
		shape12.mirror = true;
		setRotation(shape12, 0.0f, 0.0f, 0.0f);
		(shape13 = new ModelRenderer(this, 0, 40)).addBox(0.0f, 0.0f, 0.0f, 10, 10, 10);
		shape13.setRotationPoint(-21.0f, -2.0f, -5.0f);
		shape13.setTextureSize(128, 64);
		shape13.mirror = true;
		setRotation(shape13, 0.0f, 0.0f, 0.0f);
		(shape14 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 2);
		shape14.setRotationPoint(2.0f, 8.0f, -4.0f);
		shape14.setTextureSize(128, 64);
		shape14.mirror = true;
		setRotation(shape14, 0.0f, 0.0f, 0.0f);
		(shape15 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 2);
		shape15.setRotationPoint(2.0f, 8.0f, 2.0f);
		shape15.setTextureSize(128, 64);
		shape15.mirror = true;
		setRotation(shape15, 0.0f, 0.0f, 0.0f);
		(shape16 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 6, 2, 2);
		shape16.setRotationPoint(-11.0f, 0.0f, 2.0f);
		shape16.setTextureSize(128, 64);
		shape16.mirror = true;
		setRotation(shape16, 0.0f, 0.0f, 0.0f);
		(shape17 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 6, 2, 2);
		shape17.setRotationPoint(-11.0f, 0.0f, -4.0f);
		shape17.setTextureSize(128, 64);
		shape17.mirror = true;
		setRotation(shape17, 0.0f, 0.0f, 0.0f);
		(shape18 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 6, 2, 2);
		shape18.setRotationPoint(5.0f, 4.0f, 2.0f);
		shape18.setTextureSize(128, 64);
		shape18.mirror = true;
		setRotation(shape18, 0.0f, 0.0f, 0.0f);
		(shape19 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 6, 2, 2);
		shape19.setRotationPoint(5.0f, 4.0f, -4.0f);
		shape19.setTextureSize(128, 64);
		shape19.mirror = true;
		setRotation(shape19, 0.0f, 0.0f, 0.0f);
		(shape20 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 6, 2, 2);
		shape20.setRotationPoint(5.0f, 0.0f, 2.0f);
		shape20.setTextureSize(128, 64);
		shape20.mirror = true;
		setRotation(shape20, 0.0f, 0.0f, 0.0f);
		(shape21 = new ModelRenderer(this, 88, 0)).addBox(0.0f, 0.0f, 0.0f, 6, 2, 2);
		shape21.setRotationPoint(5.0f, 0.0f, -4.0f);
		shape21.setTextureSize(128, 64);
		shape21.mirror = true;
		setRotation(shape21, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		shape1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape10.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape11.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape12.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape13.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape14.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape15.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape16.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape17.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape18.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape19.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape20.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		shape21.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
