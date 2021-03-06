package net.tslat.aoa3.worldgen.structures.mysterium;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HugeMushroomBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.entity.npc.lottoman.MysticLottomanEntity;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class MysticLottoShroom extends AoAStructure { //StructureSize: 10x16x10
	private static final BlockState blueMushroomOutside = AoABlocks.BLUE_MUSHROOM_BLOCK.get().getDefaultState();
	private static final BlockState blueMushroomInside = AoABlocks.BLUE_MUSHROOM_BLOCK.get().getDefaultState().with(HugeMushroomBlock.NORTH, false).with(HugeMushroomBlock.SOUTH, false).with(HugeMushroomBlock.EAST, false).with(HugeMushroomBlock.WEST, false).with(HugeMushroomBlock.UP, false).with(HugeMushroomBlock.DOWN, false);
	private static final BlockState blueMushroomStem = AoABlocks.BLUE_MUSHROOM_STEM.get().getDefaultState();
	private static final BlockState glass = Blocks.GLASS.getDefaultState();

	public MysticLottoShroom() {
		super("MysticLottoShroom");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 4, 0, 4, blueMushroomStem);
		addBlock(world, basePos, 4, 0, 5, blueMushroomStem);
		addBlock(world, basePos, 5, 0, 4, blueMushroomStem);
		addBlock(world, basePos, 5, 0, 5, blueMushroomStem);
		addBlock(world, basePos, 4, 1, 4, blueMushroomStem);
		addBlock(world, basePos, 4, 1, 5, blueMushroomStem);
		addBlock(world, basePos, 5, 1, 4, blueMushroomStem);
		addBlock(world, basePos, 5, 1, 5, blueMushroomStem);
		addBlock(world, basePos, 4, 2, 4, blueMushroomStem);
		addBlock(world, basePos, 4, 2, 5, blueMushroomStem);
		addBlock(world, basePos, 5, 2, 4, blueMushroomStem);
		addBlock(world, basePos, 5, 2, 5, blueMushroomStem);
		addBlock(world, basePos, 4, 3, 4, blueMushroomStem);
		addBlock(world, basePos, 4, 3, 5, blueMushroomStem);
		addBlock(world, basePos, 5, 3, 4, blueMushroomStem);
		addBlock(world, basePos, 5, 3, 5, blueMushroomStem);
		addBlock(world, basePos, 4, 4, 4, blueMushroomStem);
		addBlock(world, basePos, 4, 4, 5, blueMushroomStem);
		addBlock(world, basePos, 5, 4, 4, blueMushroomStem);
		addBlock(world, basePos, 5, 4, 5, blueMushroomStem);
		addBlock(world, basePos, 4, 5, 4, blueMushroomStem);
		addBlock(world, basePos, 4, 5, 5, blueMushroomStem);
		addBlock(world, basePos, 5, 5, 4, blueMushroomStem);
		addBlock(world, basePos, 5, 5, 5, blueMushroomStem);
		addBlock(world, basePos, 1, 6, 1, blueMushroomOutside);
		addBlock(world, basePos, 1, 6, 2, blueMushroomOutside);
		addBlock(world, basePos, 1, 6, 3, blueMushroomOutside);
		addBlock(world, basePos, 1, 6, 4, blueMushroomOutside);
		addBlock(world, basePos, 1, 6, 5, blueMushroomOutside);
		addBlock(world, basePos, 1, 6, 6, blueMushroomOutside);
		addBlock(world, basePos, 1, 6, 7, blueMushroomOutside);
		addBlock(world, basePos, 1, 6, 8, blueMushroomOutside);
		addBlock(world, basePos, 2, 6, 1, blueMushroomOutside);
		addBlock(world, basePos, 2, 6, 2, glass);
		addBlock(world, basePos, 2, 6, 3, glass);
		addBlock(world, basePos, 2, 6, 4, glass);
		addBlock(world, basePos, 2, 6, 5, glass);
		addBlock(world, basePos, 2, 6, 6, glass);
		addBlock(world, basePos, 2, 6, 7, glass);
		addBlock(world, basePos, 2, 6, 8, blueMushroomOutside);
		addBlock(world, basePos, 3, 6, 1, blueMushroomOutside);
		addBlock(world, basePos, 3, 6, 2, glass);
		addBlock(world, basePos, 3, 6, 3, glass);
		addBlock(world, basePos, 3, 6, 4, glass);
		addBlock(world, basePos, 3, 6, 5, glass);
		addBlock(world, basePos, 3, 6, 6, glass);
		addBlock(world, basePos, 3, 6, 7, glass);
		addBlock(world, basePos, 3, 6, 8, blueMushroomOutside);
		addBlock(world, basePos, 4, 6, 1, blueMushroomOutside);
		addBlock(world, basePos, 4, 6, 2, glass);
		addBlock(world, basePos, 4, 6, 3, glass);
		addBlock(world, basePos, 4, 6, 4, blueMushroomStem);
		addBlock(world, basePos, 4, 6, 5, blueMushroomStem);
		addBlock(world, basePos, 4, 6, 6, glass);
		addBlock(world, basePos, 4, 6, 7, glass);
		addBlock(world, basePos, 4, 6, 8, blueMushroomOutside);
		addBlock(world, basePos, 5, 6, 1, blueMushroomOutside);
		addBlock(world, basePos, 5, 6, 2, glass);
		addBlock(world, basePos, 5, 6, 3, glass);
		addBlock(world, basePos, 5, 6, 4, blueMushroomStem);
		addBlock(world, basePos, 5, 6, 5, blueMushroomStem);
		addBlock(world, basePos, 5, 6, 6, glass);
		addBlock(world, basePos, 5, 6, 7, glass);
		addBlock(world, basePos, 5, 6, 8, blueMushroomOutside);
		addBlock(world, basePos, 6, 6, 1, blueMushroomOutside);
		addBlock(world, basePos, 6, 6, 2, glass);
		addBlock(world, basePos, 6, 6, 3, glass);
		addBlock(world, basePos, 6, 6, 4, glass);
		addBlock(world, basePos, 6, 6, 5, glass);
		addBlock(world, basePos, 6, 6, 6, glass);
		addBlock(world, basePos, 6, 6, 7, glass);
		addBlock(world, basePos, 6, 6, 8, blueMushroomOutside);
		addBlock(world, basePos, 7, 6, 1, blueMushroomOutside);
		addBlock(world, basePos, 7, 6, 2, glass);
		addBlock(world, basePos, 7, 6, 3, glass);
		addBlock(world, basePos, 7, 6, 4, glass);
		addBlock(world, basePos, 7, 6, 5, glass);
		addBlock(world, basePos, 7, 6, 6, glass);
		addBlock(world, basePos, 7, 6, 7, glass);
		addBlock(world, basePos, 7, 6, 8, blueMushroomOutside);
		addBlock(world, basePos, 8, 6, 1, blueMushroomOutside);
		addBlock(world, basePos, 8, 6, 2, blueMushroomOutside);
		addBlock(world, basePos, 8, 6, 3, blueMushroomOutside);
		addBlock(world, basePos, 8, 6, 4, blueMushroomOutside);
		addBlock(world, basePos, 8, 6, 5, blueMushroomOutside);
		addBlock(world, basePos, 8, 6, 6, blueMushroomOutside);
		addBlock(world, basePos, 8, 6, 7, blueMushroomOutside);
		addBlock(world, basePos, 8, 6, 8, blueMushroomOutside);
		addBlock(world, basePos, 1, 7, 1, blueMushroomOutside);
		addBlock(world, basePos, 1, 7, 2, glass);
		addBlock(world, basePos, 1, 7, 3, glass);
		addBlock(world, basePos, 1, 7, 4, glass);
		addBlock(world, basePos, 1, 7, 5, glass);
		addBlock(world, basePos, 1, 7, 6, glass);
		addBlock(world, basePos, 1, 7, 7, glass);
		addBlock(world, basePos, 1, 7, 8, blueMushroomOutside);
		addBlock(world, basePos, 2, 7, 1, glass);
		addBlock(world, basePos, 2, 7, 8, glass);
		addBlock(world, basePos, 3, 7, 1, glass);
		addBlock(world, basePos, 3, 7, 8, glass);
		addBlock(world, basePos, 4, 7, 1, glass);
		addBlock(world, basePos, 4, 7, 4, blueMushroomStem);
		addBlock(world, basePos, 4, 7, 5, blueMushroomStem);
		addBlock(world, basePos, 4, 7, 8, glass);
		addBlock(world, basePos, 5, 7, 1, glass);
		addBlock(world, basePos, 5, 7, 4, blueMushroomStem);
		addBlock(world, basePos, 5, 7, 5, blueMushroomStem);
		addBlock(world, basePos, 5, 7, 8, glass);
		addBlock(world, basePos, 6, 7, 1, glass);
		addBlock(world, basePos, 6, 7, 8, glass);
		addBlock(world, basePos, 7, 7, 1, glass);
		addBlock(world, basePos, 7, 7, 8, glass);
		addBlock(world, basePos, 8, 7, 1, blueMushroomOutside);
		addBlock(world, basePos, 8, 7, 2, glass);
		addBlock(world, basePos, 8, 7, 3, glass);
		addBlock(world, basePos, 8, 7, 4, glass);
		addBlock(world, basePos, 8, 7, 6, glass);
		addBlock(world, basePos, 8, 7, 7, glass);
		addBlock(world, basePos, 8, 7, 8, blueMushroomOutside);
		addBlock(world, basePos, 1, 8, 1, blueMushroomOutside);
		addBlock(world, basePos, 1, 8, 2, blueMushroomOutside);
		addBlock(world, basePos, 1, 8, 3, blueMushroomOutside);
		addBlock(world, basePos, 1, 8, 4, blueMushroomOutside);
		addBlock(world, basePos, 1, 8, 5, blueMushroomOutside);
		addBlock(world, basePos, 1, 8, 6, blueMushroomOutside);
		addBlock(world, basePos, 1, 8, 7, blueMushroomOutside);
		addBlock(world, basePos, 1, 8, 8, blueMushroomOutside);
		addBlock(world, basePos, 2, 8, 1, blueMushroomOutside);
		addBlock(world, basePos, 2, 8, 8, blueMushroomOutside);
		addBlock(world, basePos, 3, 8, 1, blueMushroomOutside);
		addBlock(world, basePos, 3, 8, 8, blueMushroomOutside);
		addBlock(world, basePos, 4, 8, 1, blueMushroomOutside);
		addBlock(world, basePos, 4, 8, 4, blueMushroomStem);
		addBlock(world, basePos, 4, 8, 5, blueMushroomStem);
		addBlock(world, basePos, 4, 8, 8, blueMushroomOutside);
		addBlock(world, basePos, 5, 8, 1, blueMushroomOutside);
		addBlock(world, basePos, 5, 8, 4, blueMushroomStem);
		addBlock(world, basePos, 5, 8, 5, blueMushroomStem);
		addBlock(world, basePos, 5, 8, 8, blueMushroomOutside);
		addBlock(world, basePos, 6, 8, 1, blueMushroomOutside);
		addBlock(world, basePos, 6, 8, 8, blueMushroomOutside);
		addBlock(world, basePos, 7, 8, 1, blueMushroomOutside);
		addBlock(world, basePos, 7, 8, 8, blueMushroomOutside);
		addBlock(world, basePos, 8, 8, 1, blueMushroomOutside);
		addBlock(world, basePos, 8, 8, 2, blueMushroomOutside);
		addBlock(world, basePos, 8, 8, 3, blueMushroomOutside);
		addBlock(world, basePos, 8, 8, 4, blueMushroomOutside);
		addBlock(world, basePos, 8, 8, 5, blueMushroomOutside);
		addBlock(world, basePos, 8, 8, 6, blueMushroomOutside);
		addBlock(world, basePos, 8, 8, 7, blueMushroomOutside);
		addBlock(world, basePos, 8, 8, 8, blueMushroomOutside);
		addBlock(world, basePos, 4, 9, 4, blueMushroomStem);
		addBlock(world, basePos, 4, 9, 5, blueMushroomStem);
		addBlock(world, basePos, 5, 9, 4, blueMushroomStem);
		addBlock(world, basePos, 5, 9, 5, blueMushroomStem);
		addBlock(world, basePos, 4, 10, 4, blueMushroomStem);
		addBlock(world, basePos, 4, 10, 5, blueMushroomStem);
		addBlock(world, basePos, 5, 10, 4, blueMushroomStem);
		addBlock(world, basePos, 5, 10, 5, blueMushroomStem);
		addBlock(world, basePos, 4, 11, 4, blueMushroomStem);
		addBlock(world, basePos, 4, 11, 5, blueMushroomStem);
		addBlock(world, basePos, 5, 11, 4, blueMushroomStem);
		addBlock(world, basePos, 5, 11, 5, blueMushroomStem);
		addBlock(world, basePos, 0, 12, 1, blueMushroomOutside);
		addBlock(world, basePos, 0, 12, 2, blueMushroomOutside);
		addBlock(world, basePos, 0, 12, 3, blueMushroomOutside);
		addBlock(world, basePos, 0, 12, 4, blueMushroomOutside);
		addBlock(world, basePos, 0, 12, 5, blueMushroomOutside);
		addBlock(world, basePos, 0, 12, 6, blueMushroomOutside);
		addBlock(world, basePos, 0, 12, 7, blueMushroomOutside);
		addBlock(world, basePos, 0, 12, 8, blueMushroomOutside);
		addBlock(world, basePos, 1, 12, 0, blueMushroomOutside);
		addBlock(world, basePos, 1, 12, 1, blueMushroomInside);
		addBlock(world, basePos, 1, 12, 2, blueMushroomInside);
		addBlock(world, basePos, 1, 12, 3, blueMushroomInside);
		addBlock(world, basePos, 1, 12, 4, blueMushroomInside);
		addBlock(world, basePos, 1, 12, 5, blueMushroomInside);
		addBlock(world, basePos, 1, 12, 6, blueMushroomInside);
		addBlock(world, basePos, 1, 12, 7, blueMushroomInside);
		addBlock(world, basePos, 1, 12, 8, blueMushroomInside);
		addBlock(world, basePos, 1, 12, 9, blueMushroomOutside);
		addBlock(world, basePos, 2, 12, 0, blueMushroomOutside);
		addBlock(world, basePos, 2, 12, 1, blueMushroomInside);
		addBlock(world, basePos, 2, 12, 8, blueMushroomInside);
		addBlock(world, basePos, 2, 12, 9, blueMushroomOutside);
		addBlock(world, basePos, 3, 12, 0, blueMushroomOutside);
		addBlock(world, basePos, 3, 12, 1, blueMushroomInside);
		addBlock(world, basePos, 3, 12, 8, blueMushroomInside);
		addBlock(world, basePos, 3, 12, 9, blueMushroomOutside);
		addBlock(world, basePos, 4, 12, 0, blueMushroomOutside);
		addBlock(world, basePos, 4, 12, 1, blueMushroomInside);
		addBlock(world, basePos, 4, 12, 4, blueMushroomStem);
		addBlock(world, basePos, 4, 12, 5, blueMushroomStem);
		addBlock(world, basePos, 4, 12, 8, blueMushroomInside);
		addBlock(world, basePos, 4, 12, 9, blueMushroomOutside);
		addBlock(world, basePos, 5, 12, 0, blueMushroomOutside);
		addBlock(world, basePos, 5, 12, 1, blueMushroomInside);
		addBlock(world, basePos, 5, 12, 4, blueMushroomStem);
		addBlock(world, basePos, 5, 12, 5, blueMushroomStem);
		addBlock(world, basePos, 5, 12, 8, blueMushroomInside);
		addBlock(world, basePos, 5, 12, 9, blueMushroomOutside);
		addBlock(world, basePos, 6, 12, 0, blueMushroomOutside);
		addBlock(world, basePos, 6, 12, 1, blueMushroomInside);
		addBlock(world, basePos, 6, 12, 8, blueMushroomInside);
		addBlock(world, basePos, 6, 12, 9, blueMushroomOutside);
		addBlock(world, basePos, 7, 12, 0, blueMushroomOutside);
		addBlock(world, basePos, 7, 12, 1, blueMushroomInside);
		addBlock(world, basePos, 7, 12, 8, blueMushroomInside);
		addBlock(world, basePos, 7, 12, 9, blueMushroomOutside);
		addBlock(world, basePos, 8, 12, 0, blueMushroomOutside);
		addBlock(world, basePos, 8, 12, 1, blueMushroomInside);
		addBlock(world, basePos, 8, 12, 2, blueMushroomInside);
		addBlock(world, basePos, 8, 12, 3, blueMushroomInside);
		addBlock(world, basePos, 8, 12, 4, blueMushroomInside);
		addBlock(world, basePos, 8, 12, 5, blueMushroomInside);
		addBlock(world, basePos, 8, 12, 6, blueMushroomInside);
		addBlock(world, basePos, 8, 12, 7, blueMushroomInside);
		addBlock(world, basePos, 8, 12, 8, blueMushroomInside);
		addBlock(world, basePos, 8, 12, 9, blueMushroomOutside);
		addBlock(world, basePos, 9, 12, 1, blueMushroomOutside);
		addBlock(world, basePos, 9, 12, 2, blueMushroomOutside);
		addBlock(world, basePos, 9, 12, 3, blueMushroomOutside);
		addBlock(world, basePos, 9, 12, 4, blueMushroomOutside);
		addBlock(world, basePos, 9, 12, 5, blueMushroomOutside);
		addBlock(world, basePos, 9, 12, 6, blueMushroomOutside);
		addBlock(world, basePos, 9, 12, 7, blueMushroomOutside);
		addBlock(world, basePos, 9, 12, 8, blueMushroomOutside);
		addBlock(world, basePos, 9, 12, 9, blueMushroomOutside);
		addBlock(world, basePos, 0, 13, 1, blueMushroomOutside);
		addBlock(world, basePos, 0, 13, 2, blueMushroomOutside);
		addBlock(world, basePos, 0, 13, 3, blueMushroomOutside);
		addBlock(world, basePos, 0, 13, 4, blueMushroomOutside);
		addBlock(world, basePos, 0, 13, 5, blueMushroomOutside);
		addBlock(world, basePos, 0, 13, 6, blueMushroomOutside);
		addBlock(world, basePos, 0, 13, 7, blueMushroomOutside);
		addBlock(world, basePos, 0, 13, 8, blueMushroomOutside);
		addBlock(world, basePos, 1, 13, 0, blueMushroomOutside);
		addBlock(world, basePos, 1, 13, 1, blueMushroomInside);
		addBlock(world, basePos, 1, 13, 2, blueMushroomInside);
		addBlock(world, basePos, 1, 13, 3, blueMushroomInside);
		addBlock(world, basePos, 1, 13, 4, blueMushroomInside);
		addBlock(world, basePos, 1, 13, 5, blueMushroomInside);
		addBlock(world, basePos, 1, 13, 6, blueMushroomInside);
		addBlock(world, basePos, 1, 13, 7, blueMushroomInside);
		addBlock(world, basePos, 1, 13, 8, blueMushroomInside);
		addBlock(world, basePos, 1, 13, 9, blueMushroomOutside);
		addBlock(world, basePos, 2, 13, 0, blueMushroomOutside);
		addBlock(world, basePos, 2, 13, 1, blueMushroomInside);
		addBlock(world, basePos, 2, 13, 8, blueMushroomInside);
		addBlock(world, basePos, 2, 13, 9, blueMushroomOutside);
		addBlock(world, basePos, 3, 13, 0, blueMushroomOutside);
		addBlock(world, basePos, 3, 13, 1, blueMushroomInside);
		addBlock(world, basePos, 3, 13, 8, blueMushroomInside);
		addBlock(world, basePos, 3, 13, 9, blueMushroomOutside);
		addBlock(world, basePos, 4, 13, 0, blueMushroomOutside);
		addBlock(world, basePos, 4, 13, 1, blueMushroomInside);
		addBlock(world, basePos, 4, 13, 4, blueMushroomStem);
		addBlock(world, basePos, 4, 13, 5, blueMushroomStem);
		addBlock(world, basePos, 4, 13, 8, blueMushroomInside);
		addBlock(world, basePos, 4, 13, 9, blueMushroomOutside);
		addBlock(world, basePos, 5, 13, 0, blueMushroomOutside);
		addBlock(world, basePos, 5, 13, 1, blueMushroomInside);
		addBlock(world, basePos, 5, 13, 4, blueMushroomStem);
		addBlock(world, basePos, 5, 13, 5, blueMushroomStem);
		addBlock(world, basePos, 5, 13, 8, blueMushroomInside);
		addBlock(world, basePos, 5, 13, 9, blueMushroomOutside);
		addBlock(world, basePos, 6, 13, 0, blueMushroomOutside);
		addBlock(world, basePos, 6, 13, 1, blueMushroomInside);
		addBlock(world, basePos, 6, 13, 8, blueMushroomInside);
		addBlock(world, basePos, 6, 13, 9, blueMushroomOutside);
		addBlock(world, basePos, 7, 13, 0, blueMushroomOutside);
		addBlock(world, basePos, 7, 13, 1, blueMushroomInside);
		addBlock(world, basePos, 7, 13, 8, blueMushroomInside);
		addBlock(world, basePos, 7, 13, 9, blueMushroomOutside);
		addBlock(world, basePos, 8, 13, 0, blueMushroomOutside);
		addBlock(world, basePos, 8, 13, 1, blueMushroomInside);
		addBlock(world, basePos, 8, 13, 2, blueMushroomInside);
		addBlock(world, basePos, 8, 13, 3, blueMushroomInside);
		addBlock(world, basePos, 8, 13, 4, blueMushroomInside);
		addBlock(world, basePos, 8, 13, 5, blueMushroomInside);
		addBlock(world, basePos, 8, 13, 6, blueMushroomInside);
		addBlock(world, basePos, 8, 13, 7, blueMushroomInside);
		addBlock(world, basePos, 8, 13, 8, blueMushroomInside);
		addBlock(world, basePos, 8, 13, 9, blueMushroomOutside);
		addBlock(world, basePos, 9, 13, 1, blueMushroomOutside);
		addBlock(world, basePos, 9, 13, 2, blueMushroomOutside);
		addBlock(world, basePos, 9, 13, 3, blueMushroomOutside);
		addBlock(world, basePos, 9, 13, 4, blueMushroomOutside);
		addBlock(world, basePos, 9, 13, 5, blueMushroomOutside);
		addBlock(world, basePos, 9, 13, 6, blueMushroomOutside);
		addBlock(world, basePos, 9, 13, 7, blueMushroomOutside);
		addBlock(world, basePos, 9, 13, 8, blueMushroomOutside);
		addBlock(world, basePos, 9, 13, 9, blueMushroomOutside);
		addBlock(world, basePos, 0, 14, 1, blueMushroomOutside);
		addBlock(world, basePos, 0, 14, 2, blueMushroomOutside);
		addBlock(world, basePos, 0, 14, 3, blueMushroomOutside);
		addBlock(world, basePos, 0, 14, 4, blueMushroomOutside);
		addBlock(world, basePos, 0, 14, 5, blueMushroomOutside);
		addBlock(world, basePos, 0, 14, 6, blueMushroomOutside);
		addBlock(world, basePos, 0, 14, 7, blueMushroomOutside);
		addBlock(world, basePos, 0, 14, 8, blueMushroomOutside);
		addBlock(world, basePos, 1, 14, 0, blueMushroomOutside);
		addBlock(world, basePos, 1, 14, 1, blueMushroomInside);
		addBlock(world, basePos, 1, 14, 2, blueMushroomInside);
		addBlock(world, basePos, 1, 14, 3, blueMushroomInside);
		addBlock(world, basePos, 1, 14, 4, blueMushroomInside);
		addBlock(world, basePos, 1, 14, 5, blueMushroomInside);
		addBlock(world, basePos, 1, 14, 6, blueMushroomInside);
		addBlock(world, basePos, 1, 14, 7, blueMushroomInside);
		addBlock(world, basePos, 1, 14, 8, blueMushroomInside);
		addBlock(world, basePos, 1, 14, 9, blueMushroomOutside);
		addBlock(world, basePos, 2, 14, 0, blueMushroomOutside);
		addBlock(world, basePos, 2, 14, 1, blueMushroomInside);
		addBlock(world, basePos, 2, 14, 2, blueMushroomInside);
		addBlock(world, basePos, 2, 14, 3, blueMushroomInside);
		addBlock(world, basePos, 2, 14, 4, blueMushroomInside);
		addBlock(world, basePos, 2, 14, 5, blueMushroomInside);
		addBlock(world, basePos, 2, 14, 6, blueMushroomInside);
		addBlock(world, basePos, 2, 14, 7, blueMushroomInside);
		addBlock(world, basePos, 2, 14, 8, blueMushroomInside);
		addBlock(world, basePos, 2, 14, 9, blueMushroomOutside);
		addBlock(world, basePos, 3, 14, 0, blueMushroomOutside);
		addBlock(world, basePos, 3, 14, 1, blueMushroomInside);
		addBlock(world, basePos, 3, 14, 2, blueMushroomInside);
		addBlock(world, basePos, 3, 14, 3, blueMushroomInside);
		addBlock(world, basePos, 3, 14, 4, blueMushroomInside);
		addBlock(world, basePos, 3, 14, 5, blueMushroomInside);
		addBlock(world, basePos, 3, 14, 6, blueMushroomInside);
		addBlock(world, basePos, 3, 14, 7, blueMushroomInside);
		addBlock(world, basePos, 3, 14, 8, blueMushroomInside);
		addBlock(world, basePos, 3, 14, 9, blueMushroomOutside);
		addBlock(world, basePos, 4, 14, 0, blueMushroomOutside);
		addBlock(world, basePos, 4, 14, 1, blueMushroomInside);
		addBlock(world, basePos, 4, 14, 2, blueMushroomInside);
		addBlock(world, basePos, 4, 14, 3, blueMushroomInside);
		addBlock(world, basePos, 4, 14, 4, blueMushroomInside);
		addBlock(world, basePos, 4, 14, 5, blueMushroomInside);
		addBlock(world, basePos, 4, 14, 6, blueMushroomInside);
		addBlock(world, basePos, 4, 14, 7, blueMushroomInside);
		addBlock(world, basePos, 4, 14, 8, blueMushroomInside);
		addBlock(world, basePos, 4, 14, 9, blueMushroomOutside);
		addBlock(world, basePos, 5, 14, 0, blueMushroomOutside);
		addBlock(world, basePos, 5, 14, 1, blueMushroomInside);
		addBlock(world, basePos, 5, 14, 2, blueMushroomInside);
		addBlock(world, basePos, 5, 14, 3, blueMushroomInside);
		addBlock(world, basePos, 5, 14, 4, blueMushroomInside);
		addBlock(world, basePos, 5, 14, 5, blueMushroomInside);
		addBlock(world, basePos, 5, 14, 6, blueMushroomInside);
		addBlock(world, basePos, 5, 14, 7, blueMushroomInside);
		addBlock(world, basePos, 5, 14, 8, blueMushroomInside);
		addBlock(world, basePos, 5, 14, 9, blueMushroomOutside);
		addBlock(world, basePos, 6, 14, 0, blueMushroomOutside);
		addBlock(world, basePos, 6, 14, 1, blueMushroomInside);
		addBlock(world, basePos, 6, 14, 2, blueMushroomInside);
		addBlock(world, basePos, 6, 14, 3, blueMushroomInside);
		addBlock(world, basePos, 6, 14, 4, blueMushroomInside);
		addBlock(world, basePos, 6, 14, 5, blueMushroomInside);
		addBlock(world, basePos, 6, 14, 6, blueMushroomInside);
		addBlock(world, basePos, 6, 14, 7, blueMushroomInside);
		addBlock(world, basePos, 6, 14, 8, blueMushroomInside);
		addBlock(world, basePos, 6, 14, 9, blueMushroomOutside);
		addBlock(world, basePos, 7, 14, 0, blueMushroomOutside);
		addBlock(world, basePos, 7, 14, 1, blueMushroomInside);
		addBlock(world, basePos, 7, 14, 2, blueMushroomInside);
		addBlock(world, basePos, 7, 14, 3, blueMushroomInside);
		addBlock(world, basePos, 7, 14, 4, blueMushroomInside);
		addBlock(world, basePos, 7, 14, 5, blueMushroomInside);
		addBlock(world, basePos, 7, 14, 6, blueMushroomInside);
		addBlock(world, basePos, 7, 14, 7, blueMushroomInside);
		addBlock(world, basePos, 7, 14, 8, blueMushroomInside);
		addBlock(world, basePos, 7, 14, 9, blueMushroomOutside);
		addBlock(world, basePos, 8, 14, 0, blueMushroomOutside);
		addBlock(world, basePos, 8, 14, 1, blueMushroomInside);
		addBlock(world, basePos, 8, 14, 2, blueMushroomInside);
		addBlock(world, basePos, 8, 14, 3, blueMushroomInside);
		addBlock(world, basePos, 8, 14, 4, blueMushroomInside);
		addBlock(world, basePos, 8, 14, 5, blueMushroomInside);
		addBlock(world, basePos, 8, 14, 6, blueMushroomInside);
		addBlock(world, basePos, 8, 14, 7, blueMushroomInside);
		addBlock(world, basePos, 8, 14, 8, blueMushroomInside);
		addBlock(world, basePos, 8, 14, 9, blueMushroomOutside);
		addBlock(world, basePos, 9, 14, 1, blueMushroomOutside);
		addBlock(world, basePos, 9, 14, 2, blueMushroomOutside);
		addBlock(world, basePos, 9, 14, 3, blueMushroomOutside);
		addBlock(world, basePos, 9, 14, 4, blueMushroomOutside);
		addBlock(world, basePos, 9, 14, 5, blueMushroomOutside);
		addBlock(world, basePos, 9, 14, 6, blueMushroomOutside);
		addBlock(world, basePos, 9, 14, 7, blueMushroomOutside);
		addBlock(world, basePos, 9, 14, 8, blueMushroomOutside);
		addBlock(world, basePos, 9, 14, 9, blueMushroomOutside);
		addBlock(world, basePos, 1, 15, 1, blueMushroomOutside);
		addBlock(world, basePos, 1, 15, 2, blueMushroomOutside);
		addBlock(world, basePos, 1, 15, 3, blueMushroomOutside);
		addBlock(world, basePos, 1, 15, 4, blueMushroomOutside);
		addBlock(world, basePos, 1, 15, 5, blueMushroomOutside);
		addBlock(world, basePos, 1, 15, 6, blueMushroomOutside);
		addBlock(world, basePos, 1, 15, 7, blueMushroomOutside);
		addBlock(world, basePos, 1, 15, 8, blueMushroomOutside);
		addBlock(world, basePos, 2, 15, 1, blueMushroomOutside);
		addBlock(world, basePos, 2, 15, 2, blueMushroomOutside);
		addBlock(world, basePos, 2, 15, 3, blueMushroomOutside);
		addBlock(world, basePos, 2, 15, 4, blueMushroomOutside);
		addBlock(world, basePos, 2, 15, 5, blueMushroomOutside);
		addBlock(world, basePos, 2, 15, 6, blueMushroomOutside);
		addBlock(world, basePos, 2, 15, 7, blueMushroomOutside);
		addBlock(world, basePos, 2, 15, 8, blueMushroomOutside);
		addBlock(world, basePos, 3, 15, 1, blueMushroomOutside);
		addBlock(world, basePos, 3, 15, 2, blueMushroomOutside);
		addBlock(world, basePos, 3, 15, 3, blueMushroomOutside);
		addBlock(world, basePos, 3, 15, 4, blueMushroomOutside);
		addBlock(world, basePos, 3, 15, 5, blueMushroomOutside);
		addBlock(world, basePos, 3, 15, 6, blueMushroomOutside);
		addBlock(world, basePos, 3, 15, 7, blueMushroomOutside);
		addBlock(world, basePos, 3, 15, 8, blueMushroomOutside);
		addBlock(world, basePos, 4, 15, 1, blueMushroomOutside);
		addBlock(world, basePos, 4, 15, 2, blueMushroomOutside);
		addBlock(world, basePos, 4, 15, 3, blueMushroomOutside);
		addBlock(world, basePos, 4, 15, 4, blueMushroomOutside);
		addBlock(world, basePos, 4, 15, 5, blueMushroomOutside);
		addBlock(world, basePos, 4, 15, 6, blueMushroomOutside);
		addBlock(world, basePos, 4, 15, 7, blueMushroomOutside);
		addBlock(world, basePos, 4, 15, 8, blueMushroomOutside);
		addBlock(world, basePos, 5, 15, 1, blueMushroomOutside);
		addBlock(world, basePos, 5, 15, 2, blueMushroomOutside);
		addBlock(world, basePos, 5, 15, 3, blueMushroomOutside);
		addBlock(world, basePos, 5, 15, 4, blueMushroomOutside);
		addBlock(world, basePos, 5, 15, 5, blueMushroomOutside);
		addBlock(world, basePos, 5, 15, 6, blueMushroomOutside);
		addBlock(world, basePos, 5, 15, 7, blueMushroomOutside);
		addBlock(world, basePos, 5, 15, 8, blueMushroomOutside);
		addBlock(world, basePos, 6, 15, 1, blueMushroomOutside);
		addBlock(world, basePos, 6, 15, 2, blueMushroomOutside);
		addBlock(world, basePos, 6, 15, 3, blueMushroomOutside);
		addBlock(world, basePos, 6, 15, 4, blueMushroomOutside);
		addBlock(world, basePos, 6, 15, 5, blueMushroomOutside);
		addBlock(world, basePos, 6, 15, 6, blueMushroomOutside);
		addBlock(world, basePos, 6, 15, 7, blueMushroomOutside);
		addBlock(world, basePos, 6, 15, 8, blueMushroomOutside);
		addBlock(world, basePos, 7, 15, 1, blueMushroomOutside);
		addBlock(world, basePos, 7, 15, 2, blueMushroomOutside);
		addBlock(world, basePos, 7, 15, 3, blueMushroomOutside);
		addBlock(world, basePos, 7, 15, 4, blueMushroomOutside);
		addBlock(world, basePos, 7, 15, 5, blueMushroomOutside);
		addBlock(world, basePos, 7, 15, 6, blueMushroomOutside);
		addBlock(world, basePos, 7, 15, 7, blueMushroomOutside);
		addBlock(world, basePos, 7, 15, 8, blueMushroomOutside);
		addBlock(world, basePos, 8, 15, 1, blueMushroomOutside);
		addBlock(world, basePos, 8, 15, 2, blueMushroomOutside);
		addBlock(world, basePos, 8, 15, 3, blueMushroomOutside);
		addBlock(world, basePos, 8, 15, 4, blueMushroomOutside);
		addBlock(world, basePos, 8, 15, 5, blueMushroomOutside);
		addBlock(world, basePos, 8, 15, 6, blueMushroomOutside);
		addBlock(world, basePos, 8, 15, 7, blueMushroomOutside);
		addBlock(world, basePos, 8, 15, 8, blueMushroomOutside);
	}

	@Override
	protected void spawnEntities(IWorld world, Random rand, BlockPos basePos) {
		MysticLottomanEntity lottoman = new MysticLottomanEntity(AoAEntities.NPCs.MYSTIC_LOTTOMAN.get(), world.getWorld());

		lottoman.setLocationAndAngles(basePos.getX() + 3, basePos.getY() + 7, basePos.getZ() + 3, rand.nextFloat() * 360, 0);
		world.addEntity(lottoman);
	}
}
