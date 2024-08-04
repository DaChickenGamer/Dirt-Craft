package com.chicken.dirtcraft.items;
import com.chicken.dirtcraft.block.ModBlocks;
import com.chicken.dirtcraft.main.DirtCraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DirtCraft.MODID);

    public static final DeferredItem<Item> UNCOOKED_DIRT_STEAK = ITEMS.registerSimpleItem("uncooked_dirt_steak",
            new Item.Properties().food(ModFoods.UNCOOKED_DIRT_STEAK));
    public static final DeferredItem<Item> COOKED_DIRT_STEAK = ITEMS.registerSimpleItem("cooked_dirt_steak",
            new Item.Properties().food(ModFoods.COOKED_DIRT_STEAK));

    public static final DeferredItem<Item> DIRT_STAR = ITEMS.registerSimpleItem("dirt_star",
            new Item.Properties().rarity(Rarity.EPIC));

    // Blocks

    public static final DeferredItem<BlockItem> DIRT_COMPRESSED = ITEMS.registerSimpleBlockItem("dirt_compressed", ModBlocks.DIRT_COMPRESSED);
    public static final DeferredItem<BlockItem> DIRT_HIGHLY_COMPRESSED = ITEMS.registerSimpleBlockItem("dirt_highly_compressed", ModBlocks.DIRT_HIGHLY_COMPRESSED);
    public static final DeferredItem<BlockItem> DIRT_SUPER_COMPRESSED = ITEMS.registerSimpleBlockItem("dirt_super_compressed", ModBlocks.DIRT_SUPER_COMPRESSED);
    public static final DeferredItem<BlockItem> DIRT_ULTRA_COMPRESSED = ITEMS.registerSimpleBlockItem("dirt_ultra_compressed", ModBlocks.DIRT_ULTRA_COMPRESSED);
    public static final DeferredItem<BlockItem> DIRT_EXTREME_COMPRESSED = ITEMS.registerSimpleBlockItem("dirt_extreme_compressed", ModBlocks.DIRT_EXTREME_COMPRESSED);
    public static final DeferredItem<BlockItem> DIRT_MAX_COMPRESSED = ITEMS.registerSimpleBlockItem("dirt_max_compressed", ModBlocks.DIRT_MAX_COMPRESSED);

}