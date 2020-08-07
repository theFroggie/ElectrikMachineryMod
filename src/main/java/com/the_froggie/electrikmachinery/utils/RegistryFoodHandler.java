package com.the_froggie.electrikmachinery.utils;

import com.the_froggie.electrikmachinery.ElectrikMachineryMod;
import com.the_froggie.electrikmachinery.items.PitchBrioche;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/* luisl created on 07/08/2020 inside the package - com.the_froggie.electrikmachinery.utils */
public class RegistryFoodHandler
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ElectrikMachineryMod.MOD_ID);

    // Foods
    public static final RegistryObject<PitchBrioche> PITCH_BRIOCHE = ITEMS.register("pitch_brioche", PitchBrioche::new);

    // Initialize items
    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
