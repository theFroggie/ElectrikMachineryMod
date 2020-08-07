package com.the_froggie.electrikmachinery.items;

import com.the_froggie.electrikmachinery.ElectrikMachineryMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

/* the_froggie created on 04/08/2020 inside the package - com.the_froggie.electrikmachinery.items */
public class ItemBase extends Item
{

    public ItemBase()
    {
        super(new Item.Properties().group(ElectrikMachineryMod.TAB_ITEMS));
    }
}
