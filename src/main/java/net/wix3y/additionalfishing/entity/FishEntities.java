package net.wix3y.additionalfishing.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wix3y.additionalfishing.AdditionalFishing;
import net.wix3y.additionalfishing.entity.custom.PiranhaEntity;

public class FishEntities {
    public static final EntityType<PiranhaEntity> PIRANHA = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(AdditionalFishing.MOD_ID, "piranha"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PiranhaEntity::new)
                    .dimensions(EntityDimensions.fixed(0.7f, 0.4f)).build());

    public static void registerEntities() {
        AdditionalFishing.LOGGER.info("Registering Entities for " + AdditionalFishing.MOD_ID);
    }
}
