package net.zaills.machine_of_war.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.LanternBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;


public class Redstone_Lantern_test extends LanternBlock  {
    public static BooleanProperty LIT;

    public Redstone_Lantern_test(Settings settings) {
        super(settings);
    }

    protected boolean shouldUnpower(World world, BlockPos pos, BlockState state) {
        //if (world.isEmittingRedstonePower(pos.up(), Direction.UP)){return true;} else{}
        return world.isEmittingRedstonePower(pos.up(), Direction.UP);
    }

    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 15;
    }

    public boolean emitsRedstonePower(BlockState state){
        return true;
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            if (hand == Hand.MAIN_HAND) {
                if(shouldUnpower(world, pos, state)) {
                    player.sendMessage(Text.literal("true"));
                }
                else{
                    player.sendMessage(Text.literal("false"));
                }
            }
        }
        return ActionResult.PASS;
    }
    static{
        LIT = Properties.LIT;
    }
}

