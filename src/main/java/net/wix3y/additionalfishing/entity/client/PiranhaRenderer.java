package net.wix3y.additionalfishing.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.wix3y.additionalfishing.AdditionalFishing;
import net.wix3y.additionalfishing.entity.custom.PiranhaEntity;

public class PiranhaRenderer extends MobEntityRenderer<PiranhaEntity, PiranhaModel<PiranhaEntity>> {
    private static final Identifier TEXTURE = new Identifier(AdditionalFishing.MOD_ID, "textures/entity/piranha_texture.png");

    public PiranhaRenderer(EntityRendererFactory.Context context) {
        super(context, new PiranhaModel<>(context.getPart(FishModelLayers.PIRANHA)), 0.3f);
    }

    @Override
    public Identifier getTexture(PiranhaEntity entity) {
        return TEXTURE;
    }
}
