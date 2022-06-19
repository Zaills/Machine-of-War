package net.zaills.machine_of_war.block.custom;

import net.minecraft.block.*;
import net.minecraft.util.math.*;
import net.minecraft.world.BlockView;

import java.util.Objects;


public class Redstone_Lantern extends LanternBlock  {
    public Redstone_Lantern(Settings settings) {
        super(settings);
    }

    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return Direction.DOWN != direction ? 15 : 0;
    }
}

