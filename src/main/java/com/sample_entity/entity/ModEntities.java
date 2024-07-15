package com.sample_entity.entity;

import com.sample_entity.ExampleMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<SampleEntity> SAMPLENTITY = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(ExampleMod.MOD_ID, "sample_entity"),
            FabricEntityTypeBuilder.<SampleEntity>create(SpawnGroup.MISC, SampleEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f))
                    .trackRangeBlocks(4)
                    .trackedUpdateRate(10).build()
            );
    public static void registerModEntities() {
        ExampleMod.LOGGER.info("Registering mod entities for "+ ExampleMod.MOD_ID);
    }
}
