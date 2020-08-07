package com.the_froggie.electrikmachinery.items;

import com.the_froggie.electrikmachinery.ElectrikMachineryMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

/* luisl created on 07/08/2020 inside the package - com.the_froggie.electrikmachinery.items */
public class PitchBrioche extends Item
{

    public PitchBrioche()
    {
        super(new Item.Properties()
        .group(ElectrikMachineryMod.TAB_FOOD)
        .food(new Food.Builder()
                .fastToEat()
                .hunger(4)
                .saturation(3.0F)
                .build())
        );
    }
}
