package com.sample_entity.entity;

import com.sample_entity.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.FlyingItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class SampleEntity extends ThrownItemEntity implements FlyingItemEntity {

    public SampleEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }
    public SampleEntity(World world, LivingEntity owner){
        super(ModEntities.SAMPLENTITY, owner, world);
    }
    public SampleEntity(World world, double x, double y, double z){
        super(ModEntities.SAMPLENTITY, x,y,z,world);
    }
    @Override
    protected Item getDefaultItem() {
        return ModItems.SAMPLEITEM;
    }

    @Override
    public Text getStyledDisplayName() {
        return super.getStyledDisplayName();
    }

    @Override
    public boolean cannotBeSilenced() {
        return super.cannotBeSilenced();
    }
}
