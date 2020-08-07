package com.the_froggie.electrikmachinery.utils;

import com.the_froggie.electrikmachinery.ElectrikMachineryMod;
import com.the_froggie.electrikmachinery.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/* the_froggie created on 05/08/2020 inside the package - com.the_froggie.electrikmachinery.utils */
public class RegistryBlockHandler
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ElectrikMachineryMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ElectrikMachineryMod.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", SteelBlock::new);
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", CopperBlock::new);
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", LeadBlock::new);
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", NickelBlock::new);
    public static final RegistryObject<Block> ALUMINIUM_BLOCK = BLOCKS.register("aluminium_block", AluminiumBlock::new);

    //Ores
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", CopperOre::new);
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", LeadOre::new);
    public static final RegistryObject<Block> ALUMINIUM_ORE = BLOCKS.register("aluminium_ore", AluminiumOre::new);
    public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore", NickelOre::new);

    //Block Items
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM =
            ITEMS.register("steel_block", () -> new BlockItem(STEEL_BLOCK.get(), new Item.Properties().group(ElectrikMachineryMod.TAB_BLOCKS)));
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM =
            ITEMS.register("copper_block", () -> new BlockItem(COPPER_BLOCK.get(), new Item.Properties().group(ElectrikMachineryMod.TAB_BLOCKS)));
    public static final RegistryObject<Item> LEAD_BLOCK_ITEM =
            ITEMS.register("lead_block", () -> new BlockItem(LEAD_BLOCK.get(), new Item.Properties().group(ElectrikMachineryMod.TAB_BLOCKS)));
    public static final RegistryObject<Item> NICKEL_BLOCK_ITEM =
            ITEMS.register("nickel_block", () -> new BlockItem(NICKEL_BLOCK.get(), new Item.Properties().group(ElectrikMachineryMod.TAB_BLOCKS)));
    public static final RegistryObject<Item> ALUMINIUM_BLOCK_ITEM =
            ITEMS.register("aluminium_block", () -> new BlockItem(ALUMINIUM_BLOCK.get(), new Item.Properties().group(ElectrikMachineryMod.TAB_BLOCKS)));

    //Ores Items
    public static final RegistryObject<Item> ALUMINIUM_ORE_ITEM =
            ITEMS.register("aluminium_ore", () -> new BlockItem(ALUMINIUM_ORE.get(), new Item.Properties().group(ElectrikMachineryMod.TAB_BLOCKS)));
    public static final RegistryObject<Item> COPPER_ORE_ITEM =
            ITEMS.register("copper_ore", () -> new BlockItem(COPPER_ORE.get(), new Item.Properties().group(ElectrikMachineryMod.TAB_BLOCKS)));
    public static final RegistryObject<Item> LEAD_ORE_ITEM =
            ITEMS.register("lead_ore", () -> new BlockItem(LEAD_ORE.get(), new Item.Properties().group(ElectrikMachineryMod.TAB_BLOCKS)));
    public static final RegistryObject<Item> NICKEL_ORE_ITEM =
            ITEMS.register("nickel_ore", () -> new BlockItem(NICKEL_ORE.get(), new Item.Properties().group(ElectrikMachineryMod.TAB_BLOCKS)));

    //Initialize blocks
    public static void init()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
