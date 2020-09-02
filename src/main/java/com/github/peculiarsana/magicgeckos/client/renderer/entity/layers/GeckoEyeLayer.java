package com.github.peculiarsana.magicgeckos.client.renderer.entity.layers;

import com.github.peculiarsana.magicgeckos.MagicGeckos;
import com.github.peculiarsana.magicgeckos.client.renderer.entity.model.GeckoModel;
import com.github.peculiarsana.magicgeckos.entities.GeckoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.awt.*;

@OnlyIn(Dist.CLIENT)
public class GeckoEyeLayer extends LayerRenderer<GeckoEntity, GeckoModel> {
    private float[] colors;
    private static final ResourceLocation GECKO_EYES = new ResourceLocation(MagicGeckos.MODID + ":textures/entity/gecko/gecko_eyes.png");
    private final GeckoModel model = new GeckoModel();

    public GeckoEyeLayer(IEntityRenderer<GeckoEntity, GeckoModel> renderer) {
        super(renderer);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, GeckoEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        Color colour = Color.decode(entitylivingbaseIn.getEyeColour());
        renderCopyCutoutModel(this.getEntityModel(), this.model, GECKO_EYES, matrixStackIn, bufferIn, packedLightIn, entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, partialTicks, colour.getRed(), colour.getGreen(), colour.getBlue());
    }
}
