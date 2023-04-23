package dev.chasem.cobblemonextras.block;


import com.google.common.collect.ImmutableMap;
import dev.chasem.cobblemonextras.screen.PokeTradeHandlerFactory;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.function.Function;

public class TradeMachineBlock extends Block {

    private static final VoxelShape DEFAULT_SHAPE = null;

    public TradeMachineBlock(){
        super(AbstractBlock.Settings.of(Material.METAL).strength(15.0f,12.0f).nonOpaque());

    }
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
    
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.combineAndSimplify(VoxelShapes.cuboid(0.0,0.0,-1.0,1.0,1.0,3.0), VoxelShapes.cuboid(0.0,3.0,0.0,1.0,6.0,1.0), BooleanBiFunction.OR);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.combineAndSimplify(VoxelShapes.cuboid(0.0,0.0,-1.0,1.0,1.0,3.0), VoxelShapes.cuboid(0.0,2.0,0.0,1.0,6.0,1.0), BooleanBiFunction.OR);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        return super.onUse(state, world, pos, player, hand, hit);
    }

}
