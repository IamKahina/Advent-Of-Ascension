package net.nevermine.gui.trader;

import net.minecraft.entity.IMerchant;
import net.nevermine.gui.ContainerEternalMerchant;
import net.nevermine.gui.GuiEternalMerchant;

public class GuiProfessor extends GuiEternalMerchant {
	public GuiProfessor(final ContainerEternalMerchant container, final IMerchant mer) {
		super(container, mer, "professor", "professor");
	}
}