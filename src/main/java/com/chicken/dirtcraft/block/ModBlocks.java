package com.chicken.dirtcraft.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.chicken.dirtcraft.main.DirtCraft.MODID;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static final DeferredBlock<Block> DIRT_COMPRESSED = BLOCKS.register("dirt_compressed",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)));
    public static final DeferredBlock<Block> DIRT_HIGHLY_COMPRESSED = BLOCKS.register("dirt_highly_compressed",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)));
    public static final DeferredBlock<Block> DIRT_SUPER_COMPRESSED = BLOCKS.register("dirt_super_compressed",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)));
    public static final DeferredBlock<Block> DIRT_ULTRA_COMPRESSED = BLOCKS.register("dirt_ultra_compressed",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)));
    public static final DeferredBlock<Block> DIRT_EXTREME_COMPRESSED = BLOCKS.register("dirt_extreme_compressed",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)));
    public static final DeferredBlock<Block> DIRT_MAX_COMPRESSED = BLOCKS.register("dirt_max_compressed",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)));
}
