package com.sample_entity.entity;

import com.sample_entity.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.FlyingItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
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
        return ModItems.SAMPLE_ITEM;
    }

    @Override
    public Text getStyledDisplayName() {
        return super.getStyledDisplayName();
    }

    @Override
    public boolean cannotBeSilenced() {
        return super.cannotBeSilenced();
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if(!this.getWorld().isClient){
            this.getWorld().createExplosion(this, this.getX(), this.getY(), this.getZ(), 2, false, World.ExplosionSourceType.BLOCK);
            this.discard();
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        //폭발 피해
        entity.damage(this.getDamageSources().explosion(null), 6.0f);
        System.out.println("entity hit!!!");
    }
}
//소리, 빛(필수 x), 아이템(설치형), 픽셀로 찍기 쉬운거 (블록 xx), 기능 확장성 좋은템   모래(가중치), 화로
