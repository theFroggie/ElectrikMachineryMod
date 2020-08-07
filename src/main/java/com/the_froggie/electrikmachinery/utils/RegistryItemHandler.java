package com.the_froggie.electrikmachinery.utils;

import com.the_froggie.electrikmachinery.ElectrikMachineryMod;
import com.the_froggie.electrikmachinery.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/* the_froggie created on 04/08/2020 inside the package - com.the_froggie.electrikmachinery.utils */
public class RegistryItemHandler
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ElectrikMachineryMod.MOD_ID);

    //Items
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ItemBase::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ItemBase::new);
    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", ItemBase::new);
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", ItemBase::new);
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", ItemBase::new);
    public static final RegistryObject<Item> PLASTIC_SHEET = ITEMS.register("plastic_sheet", ItemBase::new);

    //Initialize items
    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
