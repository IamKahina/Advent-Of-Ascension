package net.tslat.aoa3.item.weapon.staff;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.MushroomBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.tslat.aoa3.common.registration.AoAItems;
import net.tslat.aoa3.common.registration.AoASounds;
import net.tslat.aoa3.item.misc.RuneItem;
import net.tslat.aoa3.util.LocaleUtil;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FungalStaff extends BaseStaff<HashMap<BlockPos, Boolean>> {
	public FungalStaff(int durability) {
		super(durability);
	}

	@Nullable
	@Override
	public SoundEvent getCastingSound() {
		return AoASounds.ITEM_FUNGAL_STAFF_CAST.get();
	}

	@Override
	protected void populateRunes(HashMap<RuneItem, Integer> runes) {
		runes.put(AoAItems.DISTORTION_RUNE.get(), 5);
		runes.put(AoAItems.LIFE_RUNE.get(), 2);
	}

	@Nullable
	@Override
	public HashMap<BlockPos, Boolean> checkPreconditions(LivingEntity caster, ItemStack staff) {
		BlockPos.Mutable checkPos = new BlockPos.Mutable();
		HashMap<BlockPos, Boolean> workablePositions = new HashMap<BlockPos, Boolean>();

		for (int x = -2; x <= 2; x++) {
			for (int y = -2; y <= 2; y++) {
				for (int z = -2; z <= 2; z++) {
					Block block = caster.world.getBlockState(checkPos.setPos(caster.getPosX() + x, caster.getPosY() + y, caster.getPosZ() + z)).getBlock();

					if (block == Blocks.GRASS_BLOCK) {
						workablePositions.put(checkPos.toImmutable(), true);
					}
					else if (block instanceof MushroomBlock) {
						workablePositions.put(checkPos.toImmutable(), false);
					}
				}
			}
		}

		return workablePositions.isEmpty() ? null : workablePositions;
	}

	@Override
	public void cast(World world, ItemStack staff, LivingEntity caster, HashMap<BlockPos, Boolean> args) {
		if (world instanceof ServerWorld) {
			for (Map.Entry<BlockPos, Boolean> entry : args.entrySet()) {
				if (entry.getValue()) {
					world.setBlockState(entry.getKey(), Blocks.MYCELIUM.getDefaultState());
				}
				else {
					BlockPos pos = entry.getKey();
					BlockState state = world.getBlockState(pos);
					MushroomBlock mushroom = (MushroomBlock)state.getBlock();

					if (mushroom.canGrow(world, pos, state, false) && mushroom.canUseBonemeal(world, random, pos, state))
						mushroom.grow((ServerWorld)world, random, pos, state);
				}

				world.playEvent(2005, entry.getKey(), 0);
			}
		}
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.BENEFICIAL, 1));
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText(this, LocaleUtil.ItemDescriptionType.BENEFICIAL, 2));
		super.addInformation(stack, world, tooltip, flag);
	}
}
