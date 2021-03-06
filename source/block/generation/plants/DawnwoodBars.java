package net.tslat.aoa3.block.generation.plants;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.tslat.aoa3.util.BlockUtil;

public class DawnwoodBars extends BidirectionalStackablePlant {
	private static final VoxelShape SHAPE = VoxelShapes.create(new AxisAlignedBB(0.375D, 0.0D, 0.375D, 0.625D, 1D, 0.625D));

	public DawnwoodBars() {
		super(BlockUtil.generateBlockProperties(Material.TALL_PLANTS, MaterialColor.BLACK, 1, 0, SoundType.PLANT));
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}
}
