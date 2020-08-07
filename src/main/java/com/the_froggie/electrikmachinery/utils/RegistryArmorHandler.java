package com.the_froggie.electrikmachinery.utils;

import com.the_froggie.electrikmachinery.ElectrikMachineryMod;
import com.the_froggie.electrikmachinery.armor.ElectrikMachineryArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/* luisl created on 07/08/2020 inside the package - com.the_froggie.electrikmachinery.utils */
public class RegistryArmorHandler
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ElectrikMachineryMod.MOD_ID);

    // Armors

    // Steel
    // Helmet
    public static final RegistryObject<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.STEEL, EquipmentSlotType.HEAD, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Chestplate
    public static final RegistryObject<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.STEEL, EquipmentSlotType.CHEST, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Leggings
    public static final RegistryObject<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.STEEL, EquipmentSlotType.LEGS, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Boots
    public static final RegistryObject<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.STEEL, EquipmentSlotType.FEET, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Copper
    // Helmet
    public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Chestplate
    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.COPPER, EquipmentSlotType.CHEST, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Leggings
    public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.COPPER, EquipmentSlotType.LEGS, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Boots
    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.COPPER, EquipmentSlotType.FEET, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));


    // Lead
    // Helmet
    public static final RegistryObject<ArmorItem> LEAD_HELMET = ITEMS.register("lead_helmet",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.LEAD, EquipmentSlotType.HEAD, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Chestplate
    public static final RegistryObject<ArmorItem> LEAD_CHESTPLATE = ITEMS.register("lead_chestplate",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.LEAD, EquipmentSlotType.CHEST, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Leggings
    public static final RegistryObject<ArmorItem> LEAD_LEGGINGS = ITEMS.register("lead_leggings",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.LEAD, EquipmentSlotType.LEGS, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Boots
    public static final RegistryObject<ArmorItem> LEAD_BOOTS = ITEMS.register("lead_boots",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.LEAD, EquipmentSlotType.FEET, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Nickel
    // Helmet
    public static final RegistryObject<ArmorItem> NICKEL_HELMET = ITEMS.register("nickel_helmet",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.NICKEL, EquipmentSlotType.HEAD, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Chestplate
    public static final RegistryObject<ArmorItem> NICKEL_CHESTPLATE = ITEMS.register("nickel_chestplate",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.NICKEL, EquipmentSlotType.CHEST, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Leggings
    public static final RegistryObject<ArmorItem> NICKEL_LEGGINGS = ITEMS.register("nickel_leggings",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.NICKEL, EquipmentSlotType.LEGS, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Boots
    public static final RegistryObject<ArmorItem> NICKEL_BOOTS = ITEMS.register("nickel_boots",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.NICKEL, EquipmentSlotType.FEET, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Aluminium
    // Helmet
    public static final RegistryObject<ArmorItem> ALUMINIUM_HELMET = ITEMS.register("aluminium_helmet",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.ALUMINIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Chestplate
    public static final RegistryObject<ArmorItem> ALUMINIUM_CHESTPLATE = ITEMS.register("aluminium_chestplate",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.ALUMINIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Leggings
    public static final RegistryObject<ArmorItem> ALUMINIUM_LEGGINGS = ITEMS.register("aluminium_leggings",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.ALUMINIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Boots
    public static final RegistryObject<ArmorItem> ALUMINIUM_BOOTS = ITEMS.register("aluminium_boots",
            () -> new ArmorItem(ElectrikMachineryArmorMaterial.ALUMINIUM, EquipmentSlotType.FEET, new Item.Properties().group(ElectrikMachineryMod.TAB_TOOLS)));

    // Initialize items
    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
