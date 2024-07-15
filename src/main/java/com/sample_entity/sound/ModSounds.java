package com.sample_entity.sound;

import com.sample_entity.ExampleMod;
import com.sample_entity.entity.SampleEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent CANNONBALL_SHOT = registerSoundEvent("cannonball_shot");

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = Identifier.of(ExampleMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds() {
        ExampleMod.LOGGER.info("Registering sounds for" + ExampleMod.MOD_ID);
    }
}
