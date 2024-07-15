package com.sample_entity.item;

import com.sample_entity.ExampleMod;
import com.sample_entity.entity.SampleEntity;
import com.sample_entity.utils.SampleDispenserBehavior;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.DispenserBehavior;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SaddleItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;


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
        //DispenserBlock.registerBehavior(ModItems.SAMPLE_ITEM, new SampleDispenserBehavior() {
         //   @Override
           // protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {
               // return Util.make(new SampleEntity(world, position.getX(), position.getY(), position.getZ()), entity -> entity.setItem(stack));
          //  }
        ///});
        //아이템 등록
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);

    }
}
