package com.chicken.dirtcraft.items;
import com.chicken.dirtcraft.DirtCraft;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DirtCraft.MODID);

    public static final DeferredItem<Item> DIRT_STEAK = ITEMS.registerSimpleItem("dirt_steak",
            new Item.Properties().food(ModFoods.DIRT_STEAK));
}
