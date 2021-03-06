package net.tslat.aoa3.worldgen.structures.lunalus;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.tslat.aoa3.block.functional.light.LampBlock;
import net.tslat.aoa3.common.registration.AoABlocks;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.entity.npc.ambient.ZalCitizenEntity;
import net.tslat.aoa3.entity.npc.trader.ZalHerbalistEntity;
import net.tslat.aoa3.worldgen.structures.AoAStructure;

import java.util.Random;

public class LunarHerbalHouse extends AoAStructure { //StructureSize: 12x13x12
	private static final BlockState lunarLamp = AoABlocks.LUNAR_LAMP.get().getDefaultState().with(LampBlock.TOGGLEABLE, false);
	private static final BlockState lunarBricks = AoABlocks.LUNAR_BRICKS.get().getDefaultState();
	private static final BlockState stainedGlass = Blocks.WHITE_STAINED_GLASS.getDefaultState();
	private static final BlockState lunarCarpet = AoABlocks.LUNAR_CARPET.get().getDefaultState();
	private static final BlockState lunarPillar = AoABlocks.LUNAR_PILLAR.get().getDefaultState();

	public LunarHerbalHouse() {
		super("LunarHerbalHouse");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(IWorld world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 1, lunarBricks);
		addBlock(world, basePos, 0, 0, 10, lunarBricks);
		addBlock(world, basePos, 1, 0, 0, lunarBricks);
		addBlock(world, basePos, 1, 0, 1, lunarBricks);
		addBlock(world, basePos, 1, 0, 10, lunarBricks);
		addBlock(world, basePos, 1, 0, 11, lunarBricks);
		addBlock(world, basePos, 10, 0, 0, lunarBricks);
		addBlock(world, basePos, 10, 0, 1, lunarBricks);
		addBlock(world, basePos, 10, 0, 10, lunarBricks);
		addBlock(world, basePos, 10, 0, 11, lunarBricks);
		addBlock(world, basePos, 11, 0, 1, lunarBricks);
		addBlock(world, basePos, 11, 0, 10, lunarBricks);
		addBlock(world, basePos, 1, 1, 2, lunarBricks);
		addBlock(world, basePos, 1, 1, 9, lunarBricks);
		addBlock(world, basePos, 2, 1, 1, lunarBricks);
		addBlock(world, basePos, 2, 1, 2, lunarBricks);
		addBlock(world, basePos, 2, 1, 9, lunarBricks);
		addBlock(world, basePos, 2, 1, 10, lunarBricks);
		addBlock(world, basePos, 9, 1, 1, lunarBricks);
		addBlock(world, basePos, 9, 1, 2, lunarBricks);
		addBlock(world, basePos, 9, 1, 9, lunarBricks);
		addBlock(world, basePos, 9, 1, 10, lunarBricks);
		addBlock(world, basePos, 10, 1, 2, lunarBricks);
		addBlock(world, basePos, 10, 1, 9, lunarBricks);
		addBlock(world, basePos, 2, 2, 3, lunarBricks);
		addBlock(world, basePos, 2, 2, 8, lunarBricks);
		addBlock(world, basePos, 3, 2, 2, lunarBricks);
		addBlock(world, basePos, 3, 2, 3, lunarBricks);
		addBlock(world, basePos, 3, 2, 8, lunarBricks);
		addBlock(world, basePos, 3, 2, 9, lunarBricks);
		addBlock(world, basePos, 8, 2, 2, lunarBricks);
		addBlock(world, basePos, 8, 2, 3, lunarBricks);
		addBlock(world, basePos, 8, 2, 8, lunarBricks);
		addBlock(world, basePos, 8, 2, 9, lunarBricks);
		addBlock(world, basePos, 9, 2, 3, lunarBricks);
		addBlock(world, basePos, 9, 2, 8, lunarBricks);
		addBlock(world, basePos, 3, 3, 4, lunarBricks);
		addBlock(world, basePos, 3, 3, 7, lunarBricks);
		addBlock(world, basePos, 4, 3, 3, lunarBricks);
		addBlock(world, basePos, 4, 3, 4, lunarBricks);
		addBlock(world, basePos, 4, 3, 8, lunarBricks);
		addBlock(world, basePos, 7, 3, 3, lunarBricks);
		addBlock(world, basePos, 7, 3, 8, lunarBricks);
		addBlock(world, basePos, 8, 3, 4, lunarBricks);
		addBlock(world, basePos, 8, 3, 7, lunarBricks);
		addBlock(world, basePos, 3, 4, 4, lunarBricks);
		addBlock(world, basePos, 3, 4, 5, lunarBricks);
		addBlock(world, basePos, 3, 4, 6, lunarBricks);
		addBlock(world, basePos, 3, 4, 7, lunarBricks);
		addBlock(world, basePos, 4, 4, 3, lunarBricks);
		addBlock(world, basePos, 4, 4, 4, lunarBricks);
		addBlock(world, basePos, 4, 4, 5, lunarBricks);
		addBlock(world, basePos, 4, 4, 6, lunarBricks);
		addBlock(world, basePos, 4, 4, 7, lunarBricks);
		addBlock(world, basePos, 4, 4, 8, lunarBricks);
		addBlock(world, basePos, 5, 4, 3, lunarBricks);
		addBlock(world, basePos, 5, 4, 4, lunarBricks);
		addBlock(world, basePos, 5, 4, 5, lunarBricks);
		addBlock(world, basePos, 5, 4, 6, lunarBricks);
		addBlock(world, basePos, 5, 4, 7, lunarBricks);
		addBlock(world, basePos, 5, 4, 8, lunarBricks);
		addBlock(world, basePos, 6, 4, 3, lunarBricks);
		addBlock(world, basePos, 6, 4, 4, lunarBricks);
		addBlock(world, basePos, 6, 4, 5, lunarBricks);
		addBlock(world, basePos, 6, 4, 6, lunarBricks);
		addBlock(world, basePos, 6, 4, 7, lunarBricks);
		addBlock(world, basePos, 6, 4, 8, lunarBricks);
		addBlock(world, basePos, 7, 4, 3, lunarBricks);
		addBlock(world, basePos, 7, 4, 4, lunarBricks);
		addBlock(world, basePos, 7, 4, 5, lunarBricks);
		addBlock(world, basePos, 7, 4, 6, lunarBricks);
		addBlock(world, basePos, 7, 4, 7, lunarBricks);
		addBlock(world, basePos, 7, 4, 8, lunarBricks);
		addBlock(world, basePos, 8, 4, 4, lunarBricks);
		addBlock(world, basePos, 8, 4, 5, lunarBricks);
		addBlock(world, basePos, 8, 4, 6, lunarBricks);
		addBlock(world, basePos, 8, 4, 7, lunarBricks);
		addBlock(world, basePos, 0, 5, 4, lunarBricks);
		addBlock(world, basePos, 0, 5, 5, lunarBricks);
		addBlock(world, basePos, 0, 5, 6, lunarBricks);
		addBlock(world, basePos, 0, 5, 7, lunarBricks);
		addBlock(world, basePos, 1, 5, 3, lunarBricks);
		addBlock(world, basePos, 1, 5, 4, lunarBricks);
		addBlock(world, basePos, 1, 5, 5, lunarBricks);
		addBlock(world, basePos, 1, 5, 6, lunarBricks);
		addBlock(world, basePos, 1, 5, 7, lunarBricks);
		addBlock(world, basePos, 1, 5, 8, lunarBricks);
		addBlock(world, basePos, 2, 5, 2, lunarBricks);
		addBlock(world, basePos, 2, 5, 3, lunarBricks);
		addBlock(world, basePos, 2, 5, 4, lunarBricks);
		addBlock(world, basePos, 2, 5, 5, lunarBricks);
		addBlock(world, basePos, 2, 5, 6, lunarBricks);
		addBlock(world, basePos, 2, 5, 7, lunarBricks);
		addBlock(world, basePos, 2, 5, 8, lunarBricks);
		addBlock(world, basePos, 2, 5, 9, lunarBricks);
		addBlock(world, basePos, 3, 5, 1, lunarBricks);
		addBlock(world, basePos, 3, 5, 2, lunarBricks);
		addBlock(world, basePos, 3, 5, 3, lunarBricks);
		addBlock(world, basePos, 3, 5, 4, lunarLamp);
		addBlock(world, basePos, 3, 5, 5, lunarBricks);
		addBlock(world, basePos, 3, 5, 6, lunarBricks);
		addBlock(world, basePos, 3, 5, 7, lunarLamp);
		addBlock(world, basePos, 3, 5, 8, lunarBricks);
		addBlock(world, basePos, 3, 5, 9, lunarBricks);
		addBlock(world, basePos, 3, 5, 10, lunarBricks);
		addBlock(world, basePos, 4, 5, 0, lunarBricks);
		addBlock(world, basePos, 4, 5, 1, lunarBricks);
		addBlock(world, basePos, 4, 5, 2, lunarBricks);
		addBlock(world, basePos, 4, 5, 3, lunarLamp);
		addBlock(world, basePos, 4, 5, 4, lunarBricks);
		addBlock(world, basePos, 4, 5, 5, lunarBricks);
		addBlock(world, basePos, 4, 5, 6, lunarBricks);
		addBlock(world, basePos, 4, 5, 7, lunarBricks);
		addBlock(world, basePos, 4, 5, 8, lunarLamp);
		addBlock(world, basePos, 4, 5, 9, lunarBricks);
		addBlock(world, basePos, 4, 5, 10, lunarBricks);
		addBlock(world, basePos, 4, 5, 11, lunarBricks);
		addBlock(world, basePos, 5, 5, 0, lunarBricks);
		addBlock(world, basePos, 5, 5, 1, lunarBricks);
		addBlock(world, basePos, 5, 5, 2, lunarBricks);
		addBlock(world, basePos, 5, 5, 3, lunarBricks);
		addBlock(world, basePos, 5, 5, 4, lunarBricks);
		addBlock(world, basePos, 5, 5, 5, lunarBricks);
		addBlock(world, basePos, 5, 5, 6, lunarBricks);
		addBlock(world, basePos, 5, 5, 7, lunarBricks);
		addBlock(world, basePos, 5, 5, 8, lunarBricks);
		addBlock(world, basePos, 5, 5, 9, lunarBricks);
		addBlock(world, basePos, 5, 5, 10, lunarBricks);
		addBlock(world, basePos, 5, 5, 11, lunarBricks);
		addBlock(world, basePos, 6, 5, 0, lunarBricks);
		addBlock(world, basePos, 6, 5, 1, lunarBricks);
		addBlock(world, basePos, 6, 5, 2, lunarBricks);
		addBlock(world, basePos, 6, 5, 3, lunarBricks);
		addBlock(world, basePos, 6, 5, 4, lunarBricks);
		addBlock(world, basePos, 6, 5, 5, lunarBricks);
		addBlock(world, basePos, 6, 5, 6, lunarBricks);
		addBlock(world, basePos, 6, 5, 7, lunarBricks);
		addBlock(world, basePos, 6, 5, 8, lunarBricks);
		addBlock(world, basePos, 6, 5, 9, lunarBricks);
		addBlock(world, basePos, 6, 5, 10, lunarBricks);
		addBlock(world, basePos, 6, 5, 11, lunarBricks);
		addBlock(world, basePos, 7, 5, 0, lunarBricks);
		addBlock(world, basePos, 7, 5, 1, lunarBricks);
		addBlock(world, basePos, 7, 5, 2, lunarBricks);
		addBlock(world, basePos, 7, 5, 3, lunarLamp);
		addBlock(world, basePos, 7, 5, 4, lunarBricks);
		addBlock(world, basePos, 7, 5, 5, lunarBricks);
		addBlock(world, basePos, 7, 5, 6, lunarBricks);
		addBlock(world, basePos, 7, 5, 7, lunarBricks);
		addBlock(world, basePos, 7, 5, 8, lunarLamp);
		addBlock(world, basePos, 7, 5, 9, lunarBricks);
		addBlock(world, basePos, 7, 5, 10, lunarBricks);
		addBlock(world, basePos, 7, 5, 11, lunarBricks);
		addBlock(world, basePos, 8, 5, 1, lunarBricks);
		addBlock(world, basePos, 8, 5, 2, lunarBricks);
		addBlock(world, basePos, 8, 5, 3, lunarBricks);
		addBlock(world, basePos, 8, 5, 4, lunarLamp);
		addBlock(world, basePos, 8, 5, 5, lunarBricks);
		addBlock(world, basePos, 8, 5, 6, lunarBricks);
		addBlock(world, basePos, 8, 5, 7, lunarLamp);
		addBlock(world, basePos, 8, 5, 8, lunarBricks);
		addBlock(world, basePos, 8, 5, 9, lunarBricks);
		addBlock(world, basePos, 8, 5, 10, lunarBricks);
		addBlock(world, basePos, 9, 5, 2, lunarBricks);
		addBlock(world, basePos, 9, 5, 3, lunarBricks);
		addBlock(world, basePos, 9, 5, 4, lunarBricks);
		addBlock(world, basePos, 9, 5, 5, lunarBricks);
		addBlock(world, basePos, 9, 5, 6, lunarBricks);
		addBlock(world, basePos, 9, 5, 7, lunarBricks);
		addBlock(world, basePos, 9, 5, 8, lunarBricks);
		addBlock(world, basePos, 9, 5, 9, lunarBricks);
		addBlock(world, basePos, 10, 5, 3, lunarBricks);
		addBlock(world, basePos, 10, 5, 4, lunarBricks);
		addBlock(world, basePos, 10, 5, 5, lunarBricks);
		addBlock(world, basePos, 10, 5, 6, lunarBricks);
		addBlock(world, basePos, 10, 5, 7, lunarBricks);
		addBlock(world, basePos, 10, 5, 8, lunarBricks);
		addBlock(world, basePos, 11, 5, 4, lunarBricks);
		addBlock(world, basePos, 11, 5, 5, lunarBricks);
		addBlock(world, basePos, 11, 5, 6, lunarBricks);
		addBlock(world, basePos, 11, 5, 7, lunarBricks);
		addBlock(world, basePos, 0, 6, 4, lunarBricks);
		addBlock(world, basePos, 0, 6, 5, lunarCarpet);
		addBlock(world, basePos, 0, 6, 6, lunarCarpet);
		addBlock(world, basePos, 0, 6, 7, lunarBricks);
		addBlock(world, basePos, 1, 6, 3, lunarBricks);
		addBlock(world, basePos, 1, 6, 4, lunarCarpet);
		addBlock(world, basePos, 1, 6, 5, lunarCarpet);
		addBlock(world, basePos, 1, 6, 6, lunarCarpet);
		addBlock(world, basePos, 1, 6, 7, lunarCarpet);
		addBlock(world, basePos, 1, 6, 8, lunarBricks);
		addBlock(world, basePos, 2, 6, 2, lunarBricks);
		addBlock(world, basePos, 2, 6, 3, lunarCarpet);
		addBlock(world, basePos, 2, 6, 4, lunarCarpet);
		addBlock(world, basePos, 2, 6, 5, lunarCarpet);
		addBlock(world, basePos, 2, 6, 6, lunarCarpet);
		addBlock(world, basePos, 2, 6, 7, lunarCarpet);
		addBlock(world, basePos, 2, 6, 8, lunarCarpet);
		addBlock(world, basePos, 2, 6, 9, lunarBricks);
		addBlock(world, basePos, 3, 6, 1, lunarBricks);
		addBlock(world, basePos, 3, 6, 2, lunarCarpet);
		addBlock(world, basePos, 3, 6, 3, lunarCarpet);
		addBlock(world, basePos, 3, 6, 4, stainedGlass);
		addBlock(world, basePos, 3, 6, 5, lunarCarpet);
		addBlock(world, basePos, 3, 6, 6, lunarCarpet);
		addBlock(world, basePos, 3, 6, 7, stainedGlass);
		addBlock(world, basePos, 3, 6, 8, lunarCarpet);
		addBlock(world, basePos, 3, 6, 9, lunarCarpet);
		addBlock(world, basePos, 3, 6, 10, lunarBricks);
		addBlock(world, basePos, 4, 6, 0, lunarBricks);
		addBlock(world, basePos, 4, 6, 1, lunarCarpet);
		addBlock(world, basePos, 4, 6, 2, lunarCarpet);
		addBlock(world, basePos, 4, 6, 3, stainedGlass);
		addBlock(world, basePos, 4, 6, 4, lunarCarpet);
		addBlock(world, basePos, 4, 6, 5, lunarCarpet);
		addBlock(world, basePos, 4, 6, 6, lunarCarpet);
		addBlock(world, basePos, 4, 6, 7, lunarCarpet);
		addBlock(world, basePos, 4, 6, 8, stainedGlass);
		addBlock(world, basePos, 4, 6, 9, lunarCarpet);
		addBlock(world, basePos, 4, 6, 10, lunarCarpet);
		addBlock(world, basePos, 4, 6, 11, lunarBricks);
		addBlock(world, basePos, 5, 6, 0, lunarCarpet);
		addBlock(world, basePos, 5, 6, 1, lunarCarpet);
		addBlock(world, basePos, 5, 6, 2, lunarCarpet);
		addBlock(world, basePos, 5, 6, 3, lunarCarpet);
		addBlock(world, basePos, 5, 6, 4, lunarCarpet);
		addBlock(world, basePos, 5, 6, 5, lunarCarpet);
		addBlock(world, basePos, 5, 6, 6, lunarCarpet);
		addBlock(world, basePos, 5, 6, 7, lunarCarpet);
		addBlock(world, basePos, 5, 6, 8, lunarCarpet);
		addBlock(world, basePos, 5, 6, 9, lunarCarpet);
		addBlock(world, basePos, 5, 6, 10, lunarCarpet);
		addBlock(world, basePos, 5, 6, 11, lunarCarpet);
		addBlock(world, basePos, 6, 6, 0, lunarCarpet);
		addBlock(world, basePos, 6, 6, 1, lunarCarpet);
		addBlock(world, basePos, 6, 6, 2, lunarCarpet);
		addBlock(world, basePos, 6, 6, 3, lunarCarpet);
		addBlock(world, basePos, 6, 6, 4, lunarCarpet);
		addBlock(world, basePos, 6, 6, 5, lunarCarpet);
		addBlock(world, basePos, 6, 6, 6, lunarCarpet);
		addBlock(world, basePos, 6, 6, 7, lunarCarpet);
		addBlock(world, basePos, 6, 6, 8, lunarCarpet);
		addBlock(world, basePos, 6, 6, 9, lunarCarpet);
		addBlock(world, basePos, 6, 6, 10, lunarCarpet);
		addBlock(world, basePos, 6, 6, 11, lunarCarpet);
		addBlock(world, basePos, 7, 6, 0, lunarBricks);
		addBlock(world, basePos, 7, 6, 1, lunarCarpet);
		addBlock(world, basePos, 7, 6, 2, lunarCarpet);
		addBlock(world, basePos, 7, 6, 3, stainedGlass);
		addBlock(world, basePos, 7, 6, 4, lunarCarpet);
		addBlock(world, basePos, 7, 6, 5, lunarCarpet);
		addBlock(world, basePos, 7, 6, 6, lunarCarpet);
		addBlock(world, basePos, 7, 6, 7, lunarCarpet);
		addBlock(world, basePos, 7, 6, 8, stainedGlass);
		addBlock(world, basePos, 7, 6, 9, lunarCarpet);
		addBlock(world, basePos, 7, 6, 10, lunarCarpet);
		addBlock(world, basePos, 7, 6, 11, lunarBricks);
		addBlock(world, basePos, 8, 6, 1, lunarBricks);
		addBlock(world, basePos, 8, 6, 2, lunarCarpet);
		addBlock(world, basePos, 8, 6, 3, lunarCarpet);
		addBlock(world, basePos, 8, 6, 4, stainedGlass);
		addBlock(world, basePos, 8, 6, 5, lunarCarpet);
		addBlock(world, basePos, 8, 6, 6, lunarCarpet);
		addBlock(world, basePos, 8, 6, 7, stainedGlass);
		addBlock(world, basePos, 8, 6, 8, lunarCarpet);
		addBlock(world, basePos, 8, 6, 9, lunarCarpet);
		addBlock(world, basePos, 8, 6, 10, lunarBricks);
		addBlock(world, basePos, 9, 6, 2, lunarBricks);
		addBlock(world, basePos, 9, 6, 3, lunarCarpet);
		addBlock(world, basePos, 9, 6, 4, lunarCarpet);
		addBlock(world, basePos, 9, 6, 5, lunarCarpet);
		addBlock(world, basePos, 9, 6, 6, lunarCarpet);
		addBlock(world, basePos, 9, 6, 7, lunarCarpet);
		addBlock(world, basePos, 9, 6, 8, lunarCarpet);
		addBlock(world, basePos, 9, 6, 9, lunarBricks);
		addBlock(world, basePos, 10, 6, 3, lunarBricks);
		addBlock(world, basePos, 10, 6, 4, lunarCarpet);
		addBlock(world, basePos, 10, 6, 5, lunarCarpet);
		addBlock(world, basePos, 10, 6, 6, lunarCarpet);
		addBlock(world, basePos, 10, 6, 7, lunarCarpet);
		addBlock(world, basePos, 10, 6, 8, lunarBricks);
		addBlock(world, basePos, 11, 6, 4, lunarBricks);
		addBlock(world, basePos, 11, 6, 5, lunarCarpet);
		addBlock(world, basePos, 11, 6, 6, lunarCarpet);
		addBlock(world, basePos, 11, 6, 7, lunarBricks);
		addBlock(world, basePos, 0, 7, 4, lunarBricks);
		addBlock(world, basePos, 0, 7, 7, lunarBricks);
		addBlock(world, basePos, 1, 7, 3, lunarBricks);
		addBlock(world, basePos, 1, 7, 8, lunarBricks);
		addBlock(world, basePos, 2, 7, 2, lunarBricks);
		addBlock(world, basePos, 2, 7, 9, lunarBricks);
		addBlock(world, basePos, 3, 7, 1, lunarBricks);
		addBlock(world, basePos, 3, 7, 10, lunarBricks);
		addBlock(world, basePos, 4, 7, 0, lunarBricks);
		addBlock(world, basePos, 4, 7, 11, lunarBricks);
		addBlock(world, basePos, 7, 7, 0, lunarBricks);
		addBlock(world, basePos, 7, 7, 11, lunarBricks);
		addBlock(world, basePos, 8, 7, 1, lunarBricks);
		addBlock(world, basePos, 8, 7, 10, lunarBricks);
		addBlock(world, basePos, 9, 7, 2, lunarBricks);
		addBlock(world, basePos, 9, 7, 9, lunarBricks);
		addBlock(world, basePos, 10, 7, 3, lunarBricks);
		addBlock(world, basePos, 10, 7, 8, lunarBricks);
		addBlock(world, basePos, 11, 7, 4, lunarBricks);
		addBlock(world, basePos, 11, 7, 7, lunarBricks);
		addBlock(world, basePos, 0, 8, 4, lunarBricks);
		addBlock(world, basePos, 0, 8, 7, lunarBricks);
		addBlock(world, basePos, 1, 8, 3, lunarBricks);
		addBlock(world, basePos, 1, 8, 8, lunarBricks);
		addBlock(world, basePos, 2, 8, 2, lunarBricks);
		addBlock(world, basePos, 2, 8, 9, lunarBricks);
		addBlock(world, basePos, 3, 8, 1, lunarBricks);
		addBlock(world, basePos, 3, 8, 10, lunarBricks);
		addBlock(world, basePos, 4, 8, 0, lunarBricks);
		addBlock(world, basePos, 4, 8, 11, lunarBricks);
		addBlock(world, basePos, 7, 8, 0, lunarBricks);
		addBlock(world, basePos, 7, 8, 11, lunarBricks);
		addBlock(world, basePos, 8, 8, 1, lunarBricks);
		addBlock(world, basePos, 8, 8, 10, lunarBricks);
		addBlock(world, basePos, 9, 8, 2, lunarBricks);
		addBlock(world, basePos, 9, 8, 9, lunarBricks);
		addBlock(world, basePos, 10, 8, 3, lunarBricks);
		addBlock(world, basePos, 10, 8, 8, lunarBricks);
		addBlock(world, basePos, 11, 8, 4, lunarBricks);
		addBlock(world, basePos, 11, 8, 7, lunarBricks);
		addBlock(world, basePos, 0, 9, 4, lunarPillar);
		addBlock(world, basePos, 0, 9, 7, lunarPillar);
		addBlock(world, basePos, 1, 9, 4, lunarBricks);
		addBlock(world, basePos, 1, 9, 5, lunarBricks);
		addBlock(world, basePos, 1, 9, 6, lunarBricks);
		addBlock(world, basePos, 1, 9, 7, lunarBricks);
		addBlock(world, basePos, 2, 9, 3, lunarBricks);
		addBlock(world, basePos, 2, 9, 8, lunarBricks);
		addBlock(world, basePos, 3, 9, 2, lunarBricks);
		addBlock(world, basePos, 3, 9, 9, lunarBricks);
		addBlock(world, basePos, 4, 9, 0, lunarPillar);
		addBlock(world, basePos, 4, 9, 1, lunarBricks);
		addBlock(world, basePos, 4, 9, 10, lunarBricks);
		addBlock(world, basePos, 4, 9, 11, lunarPillar);
		addBlock(world, basePos, 5, 9, 1, lunarBricks);
		addBlock(world, basePos, 5, 9, 10, lunarBricks);
		addBlock(world, basePos, 6, 9, 1, lunarBricks);
		addBlock(world, basePos, 6, 9, 10, lunarBricks);
		addBlock(world, basePos, 7, 9, 0, lunarPillar);
		addBlock(world, basePos, 7, 9, 1, lunarBricks);
		addBlock(world, basePos, 7, 9, 10, lunarBricks);
		addBlock(world, basePos, 7, 9, 11, lunarPillar);
		addBlock(world, basePos, 8, 9, 2, lunarBricks);
		addBlock(world, basePos, 8, 9, 9, lunarBricks);
		addBlock(world, basePos, 9, 9, 3, lunarBricks);
		addBlock(world, basePos, 9, 9, 8, lunarBricks);
		addBlock(world, basePos, 10, 9, 4, lunarBricks);
		addBlock(world, basePos, 10, 9, 5, lunarBricks);
		addBlock(world, basePos, 10, 9, 6, lunarBricks);
		addBlock(world, basePos, 10, 9, 7, lunarBricks);
		addBlock(world, basePos, 11, 9, 4, lunarPillar);
		addBlock(world, basePos, 11, 9, 7, lunarPillar);
		addBlock(world, basePos, 0, 10, 4, lunarPillar);
		addBlock(world, basePos, 0, 10, 7, lunarPillar);
		addBlock(world, basePos, 2, 10, 4, lunarBricks);
		addBlock(world, basePos, 2, 10, 5, lunarBricks);
		addBlock(world, basePos, 2, 10, 6, lunarBricks);
		addBlock(world, basePos, 2, 10, 7, lunarBricks);
		addBlock(world, basePos, 3, 10, 3, lunarBricks);
		addBlock(world, basePos, 3, 10, 8, lunarBricks);
		addBlock(world, basePos, 4, 10, 0, lunarPillar);
		addBlock(world, basePos, 4, 10, 2, lunarBricks);
		addBlock(world, basePos, 4, 10, 9, lunarBricks);
		addBlock(world, basePos, 4, 10, 11, lunarPillar);
		addBlock(world, basePos, 5, 10, 2, lunarBricks);
		addBlock(world, basePos, 5, 10, 9, lunarBricks);
		addBlock(world, basePos, 6, 10, 2, lunarBricks);
		addBlock(world, basePos, 6, 10, 9, lunarBricks);
		addBlock(world, basePos, 7, 10, 0, lunarPillar);
		addBlock(world, basePos, 7, 10, 2, lunarBricks);
		addBlock(world, basePos, 7, 10, 9, lunarBricks);
		addBlock(world, basePos, 7, 10, 11, lunarPillar);
		addBlock(world, basePos, 8, 10, 3, lunarBricks);
		addBlock(world, basePos, 8, 10, 8, lunarBricks);
		addBlock(world, basePos, 9, 10, 4, lunarBricks);
		addBlock(world, basePos, 9, 10, 5, lunarBricks);
		addBlock(world, basePos, 9, 10, 6, lunarBricks);
		addBlock(world, basePos, 9, 10, 7, lunarBricks);
		addBlock(world, basePos, 11, 10, 4, lunarPillar);
		addBlock(world, basePos, 11, 10, 7, lunarPillar);
		addBlock(world, basePos, 3, 11, 4, lunarBricks);
		addBlock(world, basePos, 3, 11, 5, lunarBricks);
		addBlock(world, basePos, 3, 11, 6, lunarBricks);
		addBlock(world, basePos, 3, 11, 7, lunarBricks);
		addBlock(world, basePos, 4, 11, 3, lunarBricks);
		addBlock(world, basePos, 4, 11, 8, lunarBricks);
		addBlock(world, basePos, 5, 11, 3, lunarBricks);
		addBlock(world, basePos, 5, 11, 8, lunarBricks);
		addBlock(world, basePos, 6, 11, 3, lunarBricks);
		addBlock(world, basePos, 6, 11, 8, lunarBricks);
		addBlock(world, basePos, 7, 11, 3, lunarBricks);
		addBlock(world, basePos, 7, 11, 8, lunarBricks);
		addBlock(world, basePos, 8, 11, 4, lunarBricks);
		addBlock(world, basePos, 8, 11, 5, lunarBricks);
		addBlock(world, basePos, 8, 11, 6, lunarBricks);
		addBlock(world, basePos, 8, 11, 7, lunarBricks);
		addBlock(world, basePos, 4, 12, 4, lunarBricks);
		addBlock(world, basePos, 4, 12, 5, lunarBricks);
		addBlock(world, basePos, 4, 12, 6, lunarBricks);
		addBlock(world, basePos, 4, 12, 7, lunarBricks);
		addBlock(world, basePos, 5, 12, 4, lunarBricks);
		addBlock(world, basePos, 5, 12, 5, lunarBricks);
		addBlock(world, basePos, 5, 12, 6, lunarBricks);
		addBlock(world, basePos, 5, 12, 7, lunarBricks);
		addBlock(world, basePos, 6, 12, 4, lunarBricks);
		addBlock(world, basePos, 6, 12, 5, lunarBricks);
		addBlock(world, basePos, 6, 12, 6, lunarBricks);
		addBlock(world, basePos, 6, 12, 7, lunarBricks);
		addBlock(world, basePos, 7, 12, 4, lunarBricks);
		addBlock(world, basePos, 7, 12, 5, lunarBricks);
		addBlock(world, basePos, 7, 12, 6, lunarBricks);
		addBlock(world, basePos, 7, 12, 7, lunarBricks);
	}

	@Override
	protected void spawnEntities(IWorld world, Random rand, BlockPos basePos) {
		ZalHerbalistEntity herbalist = new ZalHerbalistEntity(AoAEntities.NPCs.ZAL_HERBALIST.get(), world.getWorld());
		ZalCitizenEntity zalCitizen = new ZalCitizenEntity(AoAEntities.NPCs.ZAL_CITIZEN.get(), world.getWorld());
		ZalCitizenEntity zalCitizen2 = new ZalCitizenEntity(AoAEntities.NPCs.ZAL_CITIZEN.get(), world.getWorld());

		herbalist.setLocationAndAngles(basePos.getX() + 6, basePos.getY() + 7, basePos.getZ() + 6, rand.nextFloat() * 360, 0);
		zalCitizen.setLocationAndAngles(basePos.getX() + 9, basePos.getY() + 7, basePos.getZ() + 6, rand.nextFloat() * 360, 0);
		zalCitizen2.setLocationAndAngles(basePos.getX() + 6, basePos.getY() + 7, basePos.getZ() + 9, rand.nextFloat() * 360, 0);
		world.addEntity(herbalist);
		world.addEntity(zalCitizen);
		world.addEntity(zalCitizen2);
	}
}
