package com.chicken.dirtcraft.items;
import com.chicken.dirtcraft.DirtCraft;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DirtSteak {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DirtCraft.MODID);

    public static final DeferredItem<Item> DIRT_STEAK = ITEMS.registerSimpleItem("dirt_steak",
            new Item.Properties().food(new FoodProperties.Builder().alwaysEdible().nutrition(6).saturationModifier(2f).build()));
}
