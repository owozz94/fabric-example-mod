package com.sample_entity.item;

import com.sample_entity.ExampleMod;
import com.sample_entity.entity.SampleEntity;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.DispenserBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SaddleItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item SAMPLE_ITEM = registerItem("sample", new SampleItem(new Item.Settings()));
    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries){
        entries.add(SAMPLE_ITEM);
    }
    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ExampleMod.MOD_ID,  name),item);
    }
    public static void registerModItems() {
        ExampleMod.LOGGER.info("Registering mod items for " + ExampleMod.MOD_ID);

    }
}
