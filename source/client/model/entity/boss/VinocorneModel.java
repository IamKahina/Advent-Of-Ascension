package net.tslat.aoa3.client.model.entity.boss;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class VinocorneModel extends EntityModel<MobEntity> {
	private final ModelRenderer body;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer leftArm2;
	private final ModelRenderer rightArm2;
	private final ModelRenderer leftArmx;
	private final ModelRenderer rightArmx;
	private final ModelRenderer rightLeg2;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer leftArm3;
	private final ModelRenderer leftArm4;
	private final ModelRenderer leftArm5;
	private final ModelRenderer leftArm6;
	private final ModelRenderer leftArm7;
	private final ModelRenderer leftArm8;
	private final ModelRenderer leftArm9;
	private final ModelRenderer leftArm10;
	private final ModelRenderer leftArm11;
	private final ModelRenderer leftArm12;
	private final ModelRenderer leftArm13;
	private final ModelRenderer leftArm14;
	private final ModelRenderer leftArm15;
	private final ModelRenderer leftArm16;
	private final ModelRenderer leftArm17;
	private final ModelRenderer leftArm18;
	private final ModelRenderer leftArm19;
	private final ModelRenderer leftArm20;
	private final ModelRenderer body4;
	private final ModelRenderer body5;
	private final ModelRenderer body6;
	private final ModelRenderer body7;
	private final ModelRenderer body8;
	private final ModelRenderer body9;
	private final ModelRenderer body10;
	private final ModelRenderer body11;
	private final ModelRenderer leftArm21;
	private final ModelRenderer body12;
	private final ModelRenderer body13;
	private final ModelRenderer leftArm22;
	private final ModelRenderer leftArm23;
	private final ModelRenderer body14;
	private final ModelRenderer body15;
	private final ModelRenderer body16;
	private final ModelRenderer body17;
	private final ModelRenderer body18;
	private final ModelRenderer body19;
	private final ModelRenderer body20;
	private final ModelRenderer body21;
	private final ModelRenderer leftArm24;

	public VinocorneModel() {
		textureWidth = 128;
		textureHeight = 64;
		(body = new ModelRenderer(this, 101, 2)).addBox(-7.0f, 0.0f, -2.0f, 8, 10, 4);
		body.setRotationPoint(3.0f, 0.0f, 0.0f);
		body.setTextureSize(128, 64);
		setRotation(body, 0.4363323f, 0.0f, 0.0f);
		(rightArm = new ModelRenderer(this, 28, 1)).addBox(-3.0f, -10.0f, -4.0f, 8, 8, 8);
		rightArm.setRotationPoint(-11.0f, 2.0f, -1.0f);
		rightArm.setTextureSize(128, 64);
		setRotation(rightArm, 0.0f, 0.0f, 0.0f);
		(leftArm = new ModelRenderer(this, 72, 31)).addBox(-5.0f, -10.0f, -4.0f, 10, 4, 4);
		leftArm.setRotationPoint(-21.0f, 0.0f, 1.0f);
		leftArm.setTextureSize(128, 64);
		setRotation(leftArm, 0.0f, 0.0f, 0.4363323f);
		(rightLeg = new ModelRenderer(this, 94, 48)).addBox(-4.0f, 6.0f, -7.0f, 8, 7, 8);
		rightLeg.setRotationPoint(-5.0f, 11.0f, 4.0f);
		rightLeg.setTextureSize(128, 64);
		setRotation(rightLeg, 0.0f, 0.0f, 0.0f);
		(leftLeg = new ModelRenderer(this, 94, 48)).addBox(-4.0f, 6.0f, -7.0f, 8, 7, 8);
		leftLeg.setRotationPoint(5.0f, 11.0f, 4.0f);
		leftLeg.setTextureSize(128, 64);
		setRotation(leftLeg, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 53, 34)).addBox(3.0f, -10.0f, -4.0f, 8, 6, 1);
		body2.setRotationPoint(-5.0f, -8.0f, -2.0f);
		body2.setTextureSize(128, 64);
		setRotation(body2, 0.0f, 0.0f, 0.7853982f);
		(body3 = new ModelRenderer(this, 78, 19)).addBox(-9.0f, 0.0f, -3.0f, 18, 4, 6);
		body3.setRotationPoint(0.0f, 8.0f, 4.0f);
		body3.setTextureSize(128, 64);
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(leftArm2 = new ModelRenderer(this, 51, 20)).addBox(-4.0f, 17.0f, -1.0f, 2, 5, 2);
		leftArm2.setRotationPoint(-11.0f, 2.0f, -1.0f);
		leftArm2.setTextureSize(128, 64);
		setRotation(leftArm2, 0.0f, 0.0f, 0.0f);
		(rightArm2 = new ModelRenderer(this, 1, 1)).addBox(-5.0f, 7.0f, -3.0f, 8, 8, 5);
		rightArm2.setRotationPoint(-11.0f, 2.0f, -1.0f);
		rightArm2.setTextureSize(128, 64);
		setRotation(rightArm2, 0.0f, 0.0f, 0.6108652f);
		(leftArmx = new ModelRenderer(this, 61, 16)).addBox(-1.0f, -3.0f, -2.0f, 4, 10, 4);
		leftArmx.setRotationPoint(11.0f, 2.0f, -1.0f);
		leftArmx.setTextureSize(128, 64);
		setRotation(leftArmx, 0.0f, 0.0f, -0.6108652f);
		(rightArmx = new ModelRenderer(this, 61, 16)).addBox(-3.0f, -3.0f, -2.0f, 4, 10, 4);
		rightArmx.setRotationPoint(-11.0f, 2.0f, -1.0f);
		rightArmx.setTextureSize(128, 64);
		rightArmx.mirror = true;
		setRotation(rightArmx, 0.0f, 0.0f, 0.6108652f);
		(rightLeg2 = new ModelRenderer(this, 102, 31)).addBox(-3.0f, 0.0f, -3.0f, 6, 8, 6);
		rightLeg2.setRotationPoint(-5.0f, 11.0f, 4.0f);
		rightLeg2.setTextureSize(128, 64);
		rightLeg2.mirror = true;
		setRotation(rightLeg2, -0.3490659f, 0.0f, 0.0f);
		(leftLeg2 = new ModelRenderer(this, 102, 31)).addBox(-3.0f, 0.0f, -3.0f, 6, 8, 6);
		leftLeg2.setRotationPoint(5.0f, 11.0f, 4.0f);
		leftLeg2.setTextureSize(128, 64);
		setRotation(leftLeg2, -0.3490659f, 0.0f, 0.0f);
		(leftArm3 = new ModelRenderer(this, 1, 1)).addBox(-3.0f, 7.0f, -3.0f, 8, 8, 5);
		leftArm3.setRotationPoint(11.0f, 2.0f, -1.0f);
		leftArm3.setTextureSize(128, 64);
		setRotation(leftArm3, 0.0f, 0.0f, -0.6108652f);
		(leftArm4 = new ModelRenderer(this, 51, 20)).addBox(-8.0f, 11.0f, -1.0f, 2, 8, 2);
		leftArm4.setRotationPoint(-11.0f, 2.0f, -1.0f);
		leftArm4.setTextureSize(128, 64);
		setRotation(leftArm4, 0.0f, 0.0f, 0.0f);
		(leftArm5 = new ModelRenderer(this, 51, 20)).addBox(-6.0f, 17.0f, -1.0f, 2, 2, 2);
		leftArm5.setRotationPoint(-11.0f, 2.0f, -1.0f);
		leftArm5.setTextureSize(128, 64);
		setRotation(leftArm5, 0.0f, 0.0f, 0.0f);
		(leftArm6 = new ModelRenderer(this, 51, 20)).addBox(-11.0f, 12.0f, -4.0f, 2, 2, 2);
		leftArm6.setRotationPoint(-11.0f, 2.0f, -1.0f);
		leftArm6.setTextureSize(128, 64);
		leftArm6.mirror = true;
		setRotation(leftArm6, 0.0f, 0.0f, 0.0f);
		(leftArm7 = new ModelRenderer(this, 51, 20)).addBox(-11.0f, 12.0f, -6.0f, 2, 10, 2);
		leftArm7.setRotationPoint(-11.0f, 2.0f, -1.0f);
		leftArm7.setTextureSize(128, 64);
		setRotation(leftArm7, 0.0f, 0.0f, 0.0f);
		(leftArm8 = new ModelRenderer(this, 51, 20)).addBox(-11.0f, 9.0f, -2.0f, 2, 5, 2);
		leftArm8.setRotationPoint(-11.0f, 2.0f, -1.0f);
		leftArm8.setTextureSize(128, 64);
		setRotation(leftArm8, 0.0f, 0.0f, 0.0f);
		(leftArm9 = new ModelRenderer(this, 51, 20)).addBox(-5.0f, 15.0f, -6.0f, 2, 7, 2);
		leftArm9.setRotationPoint(-11.0f, 2.0f, -1.0f);
		leftArm9.setTextureSize(128, 64);
		setRotation(leftArm9, 0.0f, 0.0f, 0.0f);
		(leftArm10 = new ModelRenderer(this, 51, 20)).addBox(-5.0f, 9.0f, -2.0f, 2, 8, 2);
		leftArm10.setRotationPoint(-11.0f, 2.0f, -1.0f);
		leftArm10.setTextureSize(128, 64);
		setRotation(leftArm10, 0.0f, 0.0f, 0.0f);
		(leftArm11 = new ModelRenderer(this, 51, 20)).addBox(-5.0f, 15.0f, -4.0f, 2, 2, 2);
		leftArm11.setRotationPoint(-11.0f, 2.0f, -1.0f);
		leftArm11.setTextureSize(128, 64);
		setRotation(leftArm11, 0.0f, 0.0f, 0.0f);
		(leftArm12 = new ModelRenderer(this, 51, 20)).addBox(2.0f, 11.0f, -6.0f, 2, 9, 2);
		leftArm12.setRotationPoint(11.0f, 2.0f, -1.0f);
		leftArm12.setTextureSize(128, 64);
		setRotation(leftArm12, 0.0f, 0.0f, 0.0f);
		(leftArm13 = new ModelRenderer(this, 51, 20)).addBox(2.0f, 11.0f, -4.0f, 2, 2, 2);
		leftArm13.setRotationPoint(11.0f, 2.0f, -1.0f);
		leftArm13.setTextureSize(128, 64);
		setRotation(leftArm13, 0.0f, 0.0f, 0.0f);
		(leftArm14 = new ModelRenderer(this, 51, 20)).addBox(2.0f, 8.0f, -2.0f, 2, 5, 2);
		leftArm14.setRotationPoint(11.0f, 2.0f, -1.0f);
		leftArm14.setTextureSize(128, 64);
		setRotation(leftArm14, 0.0f, 0.0f, 0.0f);
		(leftArm15 = new ModelRenderer(this, 51, 20)).addBox(7.0f, 9.0f, -1.0f, 2, 8, 2);
		leftArm15.setRotationPoint(11.0f, 2.0f, -1.0f);
		leftArm15.setTextureSize(128, 64);
		setRotation(leftArm15, 0.0f, 0.0f, 0.0f);
		(leftArm16 = new ModelRenderer(this, 51, 20)).addBox(5.0f, 15.0f, -1.0f, 2, 2, 2);
		leftArm16.setRotationPoint(11.0f, 2.0f, -1.0f);
		leftArm16.setTextureSize(128, 64);
		leftArm16.mirror = true;
		setRotation(leftArm16, 0.0f, 0.0f, 0.0f);
		(leftArm17 = new ModelRenderer(this, 51, 20)).addBox(3.0f, 15.0f, -1.0f, 2, 5, 2);
		leftArm17.setRotationPoint(11.0f, 2.0f, -1.0f);
		leftArm17.setTextureSize(128, 64);
		setRotation(leftArm17, 0.0f, 0.0f, 0.0f);
		(leftArm18 = new ModelRenderer(this, 51, 20)).addBox(10.0f, 15.0f, -6.0f, 2, 5, 2);
		leftArm18.setRotationPoint(11.0f, 2.0f, -1.0f);
		leftArm18.setTextureSize(128, 64);
		setRotation(leftArm18, 0.0f, 0.0f, 0.0f);
		(leftArm19 = new ModelRenderer(this, 51, 20)).addBox(10.0f, 15.0f, -4.0f, 2, 2, 2);
		leftArm19.setRotationPoint(11.0f, 2.0f, -1.0f);
		leftArm19.setTextureSize(128, 64);
		setRotation(leftArm19, 0.0f, 0.0f, 0.0f);
		(leftArm20 = new ModelRenderer(this, 51, 20)).addBox(10.0f, 9.0f, -2.0f, 2, 8, 2);
		leftArm20.setRotationPoint(11.0f, 2.0f, -1.0f);
		leftArm20.setTextureSize(128, 64);
		setRotation(leftArm20, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 1, 43)).addBox(-3.0f, -4.0f, -4.0f, 6, 8, 1);
		body4.setRotationPoint(-5.0f, -8.0f, -2.0f);
		body4.setTextureSize(128, 64);
		setRotation(body4, 0.0f, 0.0f, 0.7853982f);
		(body5 = new ModelRenderer(this, 1, 32)).addBox(-3.0f, -18.0f, -4.0f, 6, 8, 1);
		body5.setRotationPoint(-5.0f, -8.0f, -2.0f);
		body5.setTextureSize(128, 64);
		setRotation(body5, 0.0f, 0.0f, 0.7853982f);
		(body6 = new ModelRenderer(this, 33, 34)).addBox(-11.0f, -10.0f, -4.0f, 8, 6, 1);
		body6.setRotationPoint(-5.0f, -8.0f, -2.0f);
		body6.setTextureSize(128, 64);
		setRotation(body6, 0.0f, 0.0f, 0.7853982f);
		(body7 = new ModelRenderer(this, 68, 52)).addBox(3.0f, -10.0f, -5.0f, 8, 6, 1);
		body7.setRotationPoint(0.0f, -6.0f, -2.0f);
		body7.setTextureSize(128, 64);
		setRotation(body7, 0.0f, 0.0f, 0.0f);
		(body8 = new ModelRenderer(this, 68, 43)).addBox(-11.0f, -10.0f, -5.0f, 8, 6, 1);
		body8.setRotationPoint(0.0f, -6.0f, -2.0f);
		body8.setTextureSize(128, 64);
		setRotation(body8, 0.0f, 0.0f, 0.0f);
		(body9 = new ModelRenderer(this, 16, 43)).addBox(-3.0f, -4.0f, -5.0f, 6, 8, 1);
		body9.setRotationPoint(0.0f, -6.0f, -2.0f);
		body9.setTextureSize(128, 64);
		setRotation(body9, 0.0f, 0.0f, 0.0f);
		(body10 = new ModelRenderer(this, 1, 16)).addBox(-2.0f, -7.0f, -3.0f, 4, 7, 6);
		body10.setRotationPoint(0.0f, -3.0f, 0.0f);
		body10.setTextureSize(128, 64);
		setRotation(body10, 0.0f, 0.0f, 0.0f);
		(body11 = new ModelRenderer(this, 61, 1)).addBox(-6.0f, 0.0f, -3.0f, 12, 4, 6);
		body11.setRotationPoint(0.0f, -3.0f, 0.0f);
		body11.setTextureSize(128, 64);
		setRotation(body11, 0.0f, 0.0f, 0.0f);
		(leftArm21 = new ModelRenderer(this, 28, 1)).addBox(-5.0f, -10.0f, -4.0f, 8, 8, 8);
		leftArm21.setRotationPoint(11.0f, 2.0f, -1.0f);
		leftArm21.setTextureSize(128, 64);
		setRotation(leftArm21, 0.0f, 0.0f, 0.0f);
		(body12 = new ModelRenderer(this, 21, 17)).addBox(-4.0f, 0.0f, -3.0f, 8, 8, 6);
		body12.setRotationPoint(0.0f, -17.0f, -2.0f);
		body12.setTextureSize(128, 64);
		setRotation(body12, 0.0f, 0.0f, 0.0f);
		(body13 = new ModelRenderer(this, 16, 32)).addBox(-3.0f, -18.0f, -5.0f, 6, 8, 1);
		body13.setRotationPoint(0.0f, -6.0f, -2.0f);
		body13.setTextureSize(128, 64);
		setRotation(body13, 0.0f, 0.0f, 0.0f);
		(leftArm22 = new ModelRenderer(this, 72, 31)).addBox(-5.0f, -10.0f, -4.0f, 10, 4, 4);
		leftArm22.setRotationPoint(21.0f, 0.0f, 1.0f);
		leftArm22.setTextureSize(128, 64);
		setRotation(leftArm22, 0.0f, 0.0f, -0.4363323f);
		(leftArm23 = new ModelRenderer(this, 30, 53)).addBox(-1.0f, -14.0f, -6.0f, 6, 6, 4);
		leftArm23.setRotationPoint(-25.0f, 2.0f, 1.0f);
		leftArm23.setTextureSize(128, 64);
		setRotation(leftArm23, 0.0f, 0.0f, 0.0f);
		(body14 = new ModelRenderer(this, 1, 59)).addBox(-8.0f, -4.0f, -4.0f, 6, 4, 1);
		body14.setRotationPoint(-22.0f, -8.0f, -2.0f);
		body14.setTextureSize(128, 64);
		setRotation(body14, 0.0f, 0.0f, -0.7853982f);
		(body15 = new ModelRenderer(this, 54, 45)).addBox(-2.0f, -10.0f, -4.0f, 4, 6, 1);
		body15.setRotationPoint(-22.0f, -8.0f, -2.0f);
		body15.setTextureSize(128, 64);
		setRotation(body15, 0.0f, 0.0f, -0.7853982f);
		(body16 = new ModelRenderer(this, 1, 53)).addBox(2.0f, -4.0f, -4.0f, 6, 4, 1);
		body16.setRotationPoint(-22.0f, -8.0f, -2.0f);
		body16.setTextureSize(128, 64);
		setRotation(body16, 0.0f, 0.0f, -0.7853982f);
		(body17 = new ModelRenderer(this, 54, 55)).addBox(-2.0f, 0.0f, -4.0f, 4, 6, 1);
		body17.setRotationPoint(-22.0f, -8.0f, -2.0f);
		body17.setTextureSize(128, 64);
		setRotation(body17, 0.0f, 0.0f, -0.7853982f);
		(body18 = new ModelRenderer(this, 54, 55)).addBox(-2.0f, 0.0f, -4.0f, 4, 6, 1);
		body18.setRotationPoint(24.0f, -8.0f, -2.0f);
		body18.setTextureSize(128, 64);
		setRotation(body18, 0.0f, 0.0f, -0.7853982f);
		(body19 = new ModelRenderer(this, 1, 59)).addBox(-8.0f, -4.0f, -4.0f, 6, 4, 1);
		body19.setRotationPoint(24.0f, -8.0f, -2.0f);
		body19.setTextureSize(128, 64);
		setRotation(body19, 0.0f, 0.0f, -0.7853982f);
		(body20 = new ModelRenderer(this, 54, 45)).addBox(-2.0f, -10.0f, -4.0f, 4, 6, 1);
		body20.setRotationPoint(24.0f, -8.0f, -2.0f);
		body20.setTextureSize(128, 64);
		setRotation(body20, 0.0f, 0.0f, -0.7853982f);
		(body21 = new ModelRenderer(this, 1, 53)).addBox(2.0f, -4.0f, -4.0f, 6, 4, 1);
		body21.setRotationPoint(24.0f, -8.0f, -2.0f);
		body21.setTextureSize(128, 64);
		setRotation(body21, 0.0f, 0.0f, -0.7853982f);
		(leftArm24 = new ModelRenderer(this, 30, 53)).addBox(-1.0f, -14.0f, -6.0f, 6, 6, 4);
		leftArm24.setRotationPoint(21.0f, 2.0f, 1.0f);
		leftArm24.setTextureSize(128, 64);
		setRotation(leftArm24, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArm2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArmx.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightArmx.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		rightLeg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftLeg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm10.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm11.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm12.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm13.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm14.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm15.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm16.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm17.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm18.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm19.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm20.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body9.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body10.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body11.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm21.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body12.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body13.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm22.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm23.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body14.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body15.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body16.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body17.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body18.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body19.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body20.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body21.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leftArm24.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		rightLeg.rotateAngleY = 0.0f;
		rightLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount - 0.349f;
		rightLeg2.rotateAngleY = 0.0f;
		leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leftLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount - 0.349f;
	}
}
