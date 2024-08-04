package com.chicken.dirtcraft.ui;

import com.chicken.dirtcraft.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.chicken.dirtcraft.DirtCraft.MODID;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DIRT_CRAFT_TAB =
            CREATIVE_TABS.register("dirt_craft", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.dirt_craft"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(Items.DIRT::getDefaultInstance)
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.COOKED_DIRT_STEAK.get().getDefaultInstance());
                        pOutput.accept(ModItems.UNCOOKED_DIRT_STEAK.get().getDefaultInstance());
                    }).build());
}
