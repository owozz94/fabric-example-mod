package com.example.entity;

import com.example.ExampleMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static Item register(Item item, String id){
        //아이템 식별자 생성
        Identifier itemID = Identifier.of(ExampleMod.MOD_ID, id);

        //아이템 등록
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        return registeredItem;
    }
}
