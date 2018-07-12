package com.bimzy.bimzycraft.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;

public class ModelEarthGolem extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer Chest;
    public ModelRenderer LLeg;
    public ModelRenderer RLeg;
    public ModelRenderer LArm;
    public ModelRenderer RArm;
    public ModelRenderer LQuadrocept;
    public ModelRenderer LFist;
    public ModelRenderer LElbow;
    public ModelRenderer RQuadrocept;
    public ModelRenderer LFist_1;
    public ModelRenderer LElbow_1;
    public ModelRenderer LFoot;
    public ModelRenderer RFoot;

    public ModelEarthGolem() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.LFoot = new ModelRenderer(this, 40, 42);
        this.LFoot.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.LFoot.addBox(-2.0F, 0.0F, -1.5F, 4, 3, 3, 0.0F);
        this.setRotateAngle(LFoot, 0.18203784098300857F, 0.0F, 0.0F);
        this.RArm = new ModelRenderer(this, 17, 20);
        this.RArm.setRotationPoint(8.0F, -2.5F, 0.0F);
        this.RArm.addBox(-3.0F, -2.58F, -2.5F, 6, 5, 5, 0.0F);
        this.setRotateAngle(RArm, -1.1344640137963142F, 0.0F, 0.0F);
        this.LArm = new ModelRenderer(this, 0, 15);
        this.LArm.setRotationPoint(-8.0F, -2.5F, 0.0F);
        this.LArm.addBox(-3.0F, -2.58F, -2.5F, 6, 5, 5, 0.0F);
        this.setRotateAngle(LArm, -1.1344640137963142F, 0.0F, 0.0F);
        this.RFoot = new ModelRenderer(this, 0, 45);
        this.RFoot.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.RFoot.addBox(-2.0F, 0.0F, -1.5F, 4, 3, 3, 0.0F);
        this.setRotateAngle(RFoot, 0.18203784098300857F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 12.0F, 5.0F);
        this.Body.addBox(-4.0F, -8.0F, -2.5F, 8, 8, 5, 0.0F);
        this.setRotateAngle(Body, 0.8155923594569501F, 0.0F, 0.0F);
        this.LLeg = new ModelRenderer(this, 46, 0);
        this.LLeg.setRotationPoint(-3.0F, -1.0F, 0.0F);
        this.LLeg.addBox(-1.5F, 0.0F, -1.0F, 3, 5, 2, 0.0F);
        this.setRotateAngle(LLeg, -0.9812961686574068F, 0.0F, 0.0F);
        this.LQuadrocept = new ModelRenderer(this, 39, 20);
        this.LQuadrocept.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.LQuadrocept.addBox(-2.0F, 0.0F, -1.5F, 4, 8, 3, 0.0F);
        this.RQuadrocept = new ModelRenderer(this, 40, 31);
        this.RQuadrocept.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.RQuadrocept.addBox(-2.0F, 0.0F, -1.5F, 4, 8, 3, 0.0F);
        this.LElbow = new ModelRenderer(this, 22, 30);
        this.LElbow.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.LElbow.addBox(-2.5F, -2.0F, -2.0F, 5, 4, 4, 0.0F);
        this.Head = new ModelRenderer(this, 26, 0);
        this.Head.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Head.addBox(-3.0F, -4.0F, -2.1F, 6, 4, 4, 0.0F);
        this.setRotateAngle(Head, -0.5009094953223726F, 0.0F, 0.0F);
        this.Chest = new ModelRenderer(this, 19, 8);
        this.Chest.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Chest.addBox(-5.1F, -5.0F, -3.5F, 10, 5, 7, 0.0F);
        this.LElbow_1 = new ModelRenderer(this, 22, 38);
        this.LElbow_1.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.LElbow_1.addBox(-2.5F, -2.0F, -2.0F, 5, 4, 4, 0.0F);
        this.RLeg = new ModelRenderer(this, 46, 7);
        this.RLeg.setRotationPoint(3.0F, -1.0F, 0.0F);
        this.RLeg.addBox(-1.5F, 0.0F, -1.0F, 3, 5, 2, 0.0F);
        this.setRotateAngle(RLeg, -0.9812241054712121F, 0.0F, 0.0F);
        this.LFist_1 = new ModelRenderer(this, 0, 35);
        this.LFist_1.setRotationPoint(0.0F, 8.5F, 0.0F);
        this.LFist_1.addBox(-3.0F, 0.0F, -2.5F, 6, 5, 5, 0.0F);
        this.LFist = new ModelRenderer(this, 0, 25);
        this.LFist.setRotationPoint(0.0F, 8.5F, 0.0F);
        this.LFist.addBox(-3.0F, 0.0F, -2.5F, 6, 5, 5, 0.0F);
        this.LLeg.addChild(this.LFoot);
        this.Chest.addChild(this.RArm);
        this.Chest.addChild(this.LArm);
        this.RLeg.addChild(this.RFoot);
        this.Body.addChild(this.LLeg);
        this.LArm.addChild(this.LQuadrocept);
        this.RArm.addChild(this.RQuadrocept);
        this.LArm.addChild(this.LElbow);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.Chest);
        this.RArm.addChild(this.LElbow_1);
        this.Body.addChild(this.RLeg);
        this.RArm.addChild(this.LFist_1);
        this.LArm.addChild(this.LFist);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(2.0D, 2.0D, 2.0D);
        GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
    		float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.RLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
    	this.LLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + (float)Math.PI) * 1.4f * limbSwingAmount;
    }
}
