package com.sybertiger.xenomc.world.gen;

import com.sybertiger.xenomc.block.ModBlocks;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModOreFeatures {
    public static final ConfiguredFeature<?,?> SILICON_ORE = ModOreGeneration.register("silicon_ore", Feature.ORE.configured(new OreConfiguration(List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILICON_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,ModBlocks.DEEPSLATE_SILICON_ORE.get().defaultBlockState())), 10)));
}
