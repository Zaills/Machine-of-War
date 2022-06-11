package net.zaills.machine_of_war.block.custom;

import net.minecraft.block.*;
import net.minecraft.util.math.*;
import net.minecraft.world.BlockView;



public class Redstone_Lantern extends LanternBlock  {

    public Redstone_Lantern(AbstractBlock.Settings settings) {
        super(settings);
    }

    public boolean emitsRedstonePower(BlockState state){
        return true;
    }

    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 15;
    }
}

