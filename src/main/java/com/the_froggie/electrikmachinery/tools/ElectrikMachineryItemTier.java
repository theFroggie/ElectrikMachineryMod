package com.the_froggie.electrikmachinery.tools;

import com.the_froggie.electrikmachinery.utils.RegistryItemHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

/* the_froggie created on 06/08/2020 inside the package - com.the_froggie.electrikmachinery.tools */
public enum ElectrikMachineryItemTier implements IItemTier
{
    STEEL(2, 400, 7.0F, 5.0F, 16, () ->
    { return Ingredient.fromItems(RegistryItemHandler.STEEL_INGOT.get()); }),

    COPPER(2, 350, 7.0F, 3.0F, 13, () ->
    { return Ingredient.fromItems(RegistryItemHandler.COPPER_INGOT.get()); }),

    ALUMINIUM(2, 425, 6.0F, 3.0F, 14, () ->
    { return Ingredient.fromItems(RegistryItemHandler.COPPER_INGOT.get()); }),

    LEAD(2, 300, 8.0F, 4.0F, 17, () ->
    { return Ingredient.fromItems(RegistryItemHandler.COPPER_INGOT.get()); }),

    NICKEL(2, 325, 6.0F, 3.0F, 12, () ->
    { return Ingredient.fromItems(RegistryItemHandler.COPPER_INGOT.get()); });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ElectrikMachineryItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses()
    {
        return maxUses;
    }

    @Override
    public float getEfficiency()
    {
        return efficiency;
    }

    @Override
    public float getAttackDamage()
    {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel()
    {
        return harvestLevel;
    }

    @Override
    public int getEnchantability()
    {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return repairMaterial.get();
    }
}
