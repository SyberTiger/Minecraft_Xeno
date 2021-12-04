package com.sybertiger.xenomc.util;

import com.sybertiger.xenomc.block.ModBlocks;
import com.sybertiger.xenomc.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab XENOMC_ITEMS = new CreativeModeTab("xenomc_items_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SILICON_INGOT.get());
        }
    };

    public static final CreativeModeTab XENOMC_BLOCKS = new CreativeModeTab("xenomc_blocks_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.SILICON_ORE.get());
        }
    };

}
