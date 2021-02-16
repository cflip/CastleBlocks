package com.jusipat.castleblocks.registry;

import com.jusipat.castleblocks.item.TrowelItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {
	public static final Item TROWEL = new TrowelItem().setUnlocalizedName("trowel").setTextureName("castleblocks:trowel").setMaxStackSize(1).setMaxDamage(TrowelItem.MAX_USES);

	public static void registerItems() {
		GameRegistry.registerItem(TROWEL, "trowel");
	}
}
