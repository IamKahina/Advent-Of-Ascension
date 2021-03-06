package net.tslat.aoa3.capabilities.persistentstack;

import net.minecraft.nbt.FloatNBT;
import net.minecraftforge.common.util.INBTSerializable;

public interface PersistentStackCapabilityHandles extends INBTSerializable<FloatNBT> {
	float getValue();

	void setValue(float value);
}
