package net.zaills.machine_of_war.block.custom;

import net.minecraft.block.*;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.util.math.*;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;



public class Redstone_Lantern extends LanternBlock  {
    private static final Vec3d[] COLORS = new Vec3d[15];
    private boolean wiresGivePower = true;

    public Redstone_Lantern(AbstractBlock.Settings settings) {
        super(settings);
    }

    public boolean emitsRedstonePower(BlockState state){
        return this.wiresGivePower;
    }

    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 15;
    }
}

