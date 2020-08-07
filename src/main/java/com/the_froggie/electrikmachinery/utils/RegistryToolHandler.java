package com.the_froggie.electrikmachinery.utils;

import com.the_froggie.electrikmachinery.ElectrikMachineryMod;
import com.the_froggie.electrikmachinery.tools.ElectrikMachineryItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/* luisl created on 06/08/2020 inside the package - com.the_froggie.electrikmachinery.utils */
public class RegistryToolHandler
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ElectrikMachineryMod.MOD_ID);

    //Tools

    //Steel
    //Sword
    public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword", () ->
            new SwordItem(ElectrikMachineryItemTier.STEEL, 1, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Pickaxe
    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () ->
            new PickaxeItem(ElectrikMachineryItemTier.STEEL, 0, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Axe
    public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe", () ->
            new AxeItem(ElectrikMachineryItemTier.STEEL, 1, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Shovel
    public static final RegistryObject<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel", () ->
            new ShovelItem(ElectrikMachineryItemTier.STEEL, 0, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Hoe
    public static final RegistryObject<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe", () ->
            new HoeItem(ElectrikMachineryItemTier.STEEL, 1,0, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    //Copper
    //Sword
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () ->
            new SwordItem(ElectrikMachineryItemTier.COPPER, 1, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Pickaxe
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () ->
            new PickaxeItem(ElectrikMachineryItemTier.COPPER, 0, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Axe
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () ->
            new AxeItem(ElectrikMachineryItemTier.COPPER, 1, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Shovel
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () ->
            new ShovelItem(ElectrikMachineryItemTier.COPPER, 0, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Hoe
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () ->
            new HoeItem(ElectrikMachineryItemTier.COPPER, 1,0, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    //Lead
    //Sword
    public static final RegistryObject<SwordItem> LEAD_SWORD = ITEMS.register("lead_sword", () ->
            new SwordItem(ElectrikMachineryItemTier.LEAD, 1, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Pickaxe
    public static final RegistryObject<PickaxeItem> LEAD_PICKAXE = ITEMS.register("lead_pickaxe", () ->
            new PickaxeItem(ElectrikMachineryItemTier.LEAD, 0, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Axe
    public static final RegistryObject<AxeItem> LEAD_AXE = ITEMS.register("lead_axe", () ->
            new AxeItem(ElectrikMachineryItemTier.LEAD, 1, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Shovel
    public static final RegistryObject<ShovelItem> LEAD_SHOVEL = ITEMS.register("lead_shovel", () ->
            new ShovelItem(ElectrikMachineryItemTier.LEAD, 0, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Hoe
    public static final RegistryObject<HoeItem> LEAD_HOE = ITEMS.register("lead_hoe", () ->
            new HoeItem(ElectrikMachineryItemTier.LEAD, 1,0, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    //Nickel TODO TEXTURES
    //Sword
    public static final RegistryObject<SwordItem> NICKEL_SWORD = ITEMS.register("nickel_sword", () ->
            new SwordItem(ElectrikMachineryItemTier.NICKEL, 1, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Pickaxe
    public static final RegistryObject<PickaxeItem> NICKEL_PICKAXE = ITEMS.register("nickel_pickaxe", () ->
            new PickaxeItem(ElectrikMachineryItemTier.NICKEL, 0, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Axe
    public static final RegistryObject<AxeItem> NICKEL_AXE = ITEMS.register("nickel_axe", () ->
            new AxeItem(ElectrikMachineryItemTier.NICKEL, 1, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Shovel
    public static final RegistryObject<ShovelItem> NICKEL_SHOVEL = ITEMS.register("nickel_shovel", () ->
            new ShovelItem(ElectrikMachineryItemTier.NICKEL, 0, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Hoe
    public static final RegistryObject<HoeItem> NICKEL_HOE = ITEMS.register("nickel_hoe", () ->
            new HoeItem(ElectrikMachineryItemTier.NICKEL, 1,0, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    //Aluminium
    //Sword
    public static final RegistryObject<SwordItem> ALUMINIUM_SWORD = ITEMS.register("aluminium_sword", () ->
            new SwordItem(ElectrikMachineryItemTier.ALUMINIUM, 1, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Pickaxe
    public static final RegistryObject<PickaxeItem> ALUMINIUM_PICKAXE = ITEMS.register("aluminium_pickaxe", () ->
            new PickaxeItem(ElectrikMachineryItemTier.ALUMINIUM, 0, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Axe
    public static final RegistryObject<AxeItem> ALUMINIUM_AXE = ITEMS.register("aluminium_axe", () ->
            new AxeItem(ElectrikMachineryItemTier.ALUMINIUM, 1, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Shovel
    public static final RegistryObject<ShovelItem> ALUMINIUM_SHOVEL = ITEMS.register("aluminium_shovel", () ->
            new ShovelItem(ElectrikMachineryItemTier.ALUMINIUM, 0, -2.4F, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));
    //Hoe
    public static final RegistryObject<HoeItem> ALUMINIUM_HOE = ITEMS.register("aluminium_hoe", () ->
            new HoeItem(ElectrikMachineryItemTier.ALUMINIUM, 1,0, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));


    //Initialize Tools
    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
