package com.sybertiger.xenomc.item;

import com.sybertiger.xenomc.XenoMC;
import com.sybertiger.xenomc.util.ModCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, XenoMC.MOD_ID);


    public static final RegistryObject<Item> SILICON_INGOT = ITEMS.register("silicon_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XENOMC_ITEMS)));

    public static final RegistryObject<Item> SILICON_NUGGET = ITEMS.register("silicon_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XENOMC_ITEMS)));

    public static final RegistryObject<Item> RAW_SILICON = ITEMS.register("raw_silicon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XENOMC_ITEMS)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
