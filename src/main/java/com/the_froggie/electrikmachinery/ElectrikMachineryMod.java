package com.the_froggie.electrikmachinery;

import com.the_froggie.electrikmachinery.utils.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* the_froggie created on 04/08/2020 inside the package - com.the_froggie.electrikmachinery */
@Mod("electrikmachinery")
public class ElectrikMachineryMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "electrikmachinery";

    public ElectrikMachineryMod()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryItemHandler.init();
        RegistryBlockHandler.init();
        RegistryToolHandler.init();
        RegistryArmorHandler.init();
        RegistryFoodHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    // CREATIVE TAB 1
    public static final ItemGroup TAB_BLOCKS = new ItemGroup("electrikMachineryBlockTab")
    {
        // FETCH ITEM FROM -> RegistryHandler
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(RegistryBlockHandler.LEAD_BLOCK.get());
        }
    };

    // CREATIVE TAB 2
    public static final ItemGroup TAB_TOOLS = new ItemGroup("electrikMachineryEquipmentTab")
    {
        // FETCH ITEM FROM -> RegistryHandler
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(RegistryToolHandler.STEEL_SWORD.get());
        }
    };

    // CREATIVE TAB 3
    public static final ItemGroup TAB_ITEMS = new ItemGroup("electrikMachineryItemTab")
    {
        // FETCH ITEM FROM -> RegistryHandler
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(RegistryItemHandler.LEAD_INGOT.get());
        }
    };

    // CREATIVE TAB 4
    public static final ItemGroup TAB_FOOD = new ItemGroup("electrikMachineryFoodTab")
    {
        // FETCH ITEM FROM -> RegistryHandler
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(RegistryFoodHandler.PITCH_BRIOCHE.get());
        }
    };
}
