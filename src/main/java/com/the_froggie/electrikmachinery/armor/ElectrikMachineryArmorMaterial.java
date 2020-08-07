package com.the_froggie.electrikmachinery.armor;

import com.the_froggie.electrikmachinery.ElectrikMachineryMod;
import com.the_froggie.electrikmachinery.tools.ElectrikMachineryItemTier;
import com.the_froggie.electrikmachinery.utils.RegistryItemHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

/* the_froggie created on 07/08/2020 inside the package - com.the_froggie.electrikmachinery.armor */
public enum ElectrikMachineryArmorMaterial implements IArmorMaterial
{
    STEEL(ElectrikMachineryMod.MOD_ID + ":steel", 28, new int[] { 3, 6, 7, 3 },
            16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.25F, () -> {return Ingredient.fromItems(RegistryItemHandler.STEEL_INGOT.get());},
            0),

    NICKEL(ElectrikMachineryMod.MOD_ID + ":nickel", 28, new int[] { 2, 5, 5, 2 },
        16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.25F, () -> {return Ingredient.fromItems(RegistryItemHandler.STEEL_INGOT.get());},
            0),

    COPPER(ElectrikMachineryMod.MOD_ID + ":copper", 28, new int[] { 2, 5, 4, 1 },
        16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.25F, () -> {return Ingredient.fromItems(RegistryItemHandler.STEEL_INGOT.get());},
            0),

    LEAD(ElectrikMachineryMod.MOD_ID + ":lead", 28, new int[] { 2, 6, 2, 2 },
        16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.25F, () -> {return Ingredient.fromItems(RegistryItemHandler.STEEL_INGOT.get());},
            0),

    ALUMINIUM(ElectrikMachineryMod.MOD_ID + ":aluminium", 28, new int[] { 2, 6, 7, 2 },
        16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.25F, () -> {return Ingredient.fromItems(RegistryItemHandler.STEEL_INGOT.get());},
            0);


    private static final int[] MAX_DAMAGE_ARRAY = new int[]{11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    ElectrikMachineryArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
                              SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance)
    {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn)
    {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn)
    {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent()
    {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    @Override
    public float func_230304_f_()
    {
        return this.knockbackResistance;
    }
}
