package net.tslat.aoa3.item.armour;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.entity.minion.RosidEntity;
import net.tslat.aoa3.util.DamageUtil;
import net.tslat.aoa3.util.ItemUtil;
import net.tslat.aoa3.util.LocaleUtil;
import net.tslat.aoa3.util.player.PlayerDataManager;

import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.List;

public class RosidianArmour extends AdventArmour {
	public RosidianArmour(EquipmentSlotType slot) {
		super(ItemUtil.customArmourMaterial("aoa3:rosidian", 55, new int[] {4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5), slot);
	}

	@Override
	public AdventArmour.Type setType() {
		return AdventArmour.Type.ROSIDIAN;
	}

	@Override
	public void onPostAttackReceived(PlayerDataManager plData, @Nullable HashSet<EquipmentSlotType> slots, LivingDamageEvent event) {
		if (!DamageUtil.isEnvironmentalDamage(event.getSource()) && !DamageUtil.isPoisonDamage(event.getSource(), plData.player(), event.getAmount())) {
			if (slots == null) {
				if (event.getAmount() >= 4)
					spawnRosid(plData.player());
			}
			else {
				if (random.nextFloat() < 0.04 * slots.size())
					spawnRosid(plData.player());
			}
		}
	}

	private void spawnRosid(PlayerEntity pl) {
		RosidEntity rosid = new RosidEntity(AoAEntities.Minions.ROSID.get(), pl.world);

		rosid.setTamedBy(pl);
		rosid.setPosition(pl.getPosX(), pl.getPosY(), pl.getPosZ());
		pl.world.addEntity(rosid);
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(pieceEffectHeader());
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText("item.aoa3.rosidian_armour.desc.1", LocaleUtil.ItemDescriptionType.BENEFICIAL));
		tooltip.add(setEffectHeader());
		tooltip.add(LocaleUtil.getFormattedItemDescriptionText("item.aoa3.rosidian_armour.desc.2", LocaleUtil.ItemDescriptionType.BENEFICIAL));
	}
}
