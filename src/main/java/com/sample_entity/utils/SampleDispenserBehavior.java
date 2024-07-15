package com.sample_entity.utils;

import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.ItemDispenserBehavior;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public abstract class SampleDispenserBehavior extends ItemDispenserBehavior {
    public SampleDispenserBehavior() {
    }

    @Override
    public ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
        ServerWorld world = pointer.world();
        Position position = DispenserBlock.getOutputLocation(pointer);
        Direction direction = pointer.state().get(DispenserBlock.FACING);
        ProjectileEntity projectile = this.createProjectile(world, position, stack);
        projectile.setVelocity(direction.getOffsetX(), (float)direction.getOffsetY() + 0.2f, direction.getOffsetZ(), this.getForce() + 0.4f, this.getVariation() /2);
        world.spawnEntity(projectile);
        stack.decrement(1);
        return stack;
    }

    @Override
    protected void playSound(BlockPointer pointer) {
        // pointer.world().playSound(null, pointer.pos().getX(), pointer.pos().getY(), pointer.pos().getZ(), ModSounds.);
        super.playSound(pointer);
    }

    protected abstract ProjectileEntity createProjectile(World var1, Position var2, ItemStack var3);

    protected float getVariation(){
        return 6.0f;
    }
    protected float getForce(){
        return 1.1f;
    }
}
