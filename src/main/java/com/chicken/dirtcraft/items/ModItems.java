package com.chicken.dirtcraft.items;
import com.chicken.dirtcraft.DirtCraft;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DirtCraft.MODID);

    public static final DeferredItem<Item> COOKED_DIRT_STEAK = ITEMS.registerSimpleItem("cooked_dirt_steak",
            new Item.Properties().food(ModFoods.COOKED_DIRT_STEAK));
    public static final DeferredItem<Item> UNCOOKED_DIRT_STEAK = ITEMS.registerSimpleItem("uncooked_dirt_steak",
            new Item.Properties().food(ModFoods.UNCOOKED_DIRT_STEAK));
}
