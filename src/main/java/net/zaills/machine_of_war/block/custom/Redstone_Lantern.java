package net.zaills.machine_of_war.block.custom;

import net.minecraft.block.*;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class Redstone_Lantern extends LanternBlock  {
    public static final BooleanProperty LIT;
    private static final Map<BlockView, List<RedstoneTorchBlock.BurnoutEntry>> BURNOUT_MAP;
    public static final int field_31227 = 60;
    public static final int field_31228 = 8;
    public static final int field_31229 = 160;
    private static final int SCHEDULED_TICK_DELAY = 2;

    public Redstone_Lantern(AbstractBlock.Settings settings) {
        super(settings);
    }

    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return (Boolean)state.get(LIT) && Direction.UP != direction ? 15 : 0;
    }

    public boolean emitsRedstonePower(BlockState state){
        return true;
    }

    static {
        LIT = Properties.LIT;
        BURNOUT_MAP = new WeakHashMap();
    }

    public static class BurnoutEntry {
        final BlockPos pos;
        final long time;

        public BurnoutEntry(BlockPos pos, long time) {
            this.pos = pos;
            this.time = time;
        }
    }

}

