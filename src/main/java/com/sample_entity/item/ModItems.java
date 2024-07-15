package com.sample_entity.item;

import com.sample_entity.ExampleMod;
import net.minecraft.item.Item;
import net.minecraft.item.SaddleItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item SAMPLEITEM = registerItem("sample_entity", new SaddleItem(new Item.Settings()));
    public static Item register(Item item, String id){
        //아이템 식별자 생성
        Identifier itemID = Identifier.of(ExampleMod.MOD_ID, id);

        //아이템 등록
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        return registeredItem;
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ExampleMod.MOD_ID, name),item);
    }
    public static void registerModItems() {
        ExampleMod.LOGGER.info("Registering mod items for "+ExampleMod.MOD_ID);
    }
}
