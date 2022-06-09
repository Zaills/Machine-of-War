package net.zaills.machine_of_war.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LanternBlock;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class Redstone_Lantern extends LanternBlock {

    public Redstone_Lantern(AbstractBlock.Settings settings) {
        super(settings);
    }


}

