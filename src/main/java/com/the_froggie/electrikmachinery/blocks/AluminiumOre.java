package com.the_froggie.electrikmachinery.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

/* the_froggie created on 05/08/2020 inside the package - com.the_froggie.electrikmachinery.blocks */
public class AluminiumOre extends Block
{
    public AluminiumOre()
    {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f, 15.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
