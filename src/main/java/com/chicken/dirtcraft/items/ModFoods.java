package com.chicken.dirtcraft.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties COOKED_DIRT_STEAK = new FoodProperties.Builder().alwaysEdible().nutrition(8).saturationModifier(15f).build();
    public static final FoodProperties UNCOOKED_DIRT_STEAK = new FoodProperties.Builder().alwaysEdible().nutrition(2).effect(new MobEffectInstance(MobEffects.HUNGER, 150, 200), .7f).build();
}
