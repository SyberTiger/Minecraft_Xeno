package com.sybertiger.xenomc.world.gen;

import com.sybertiger.xenomc.XenoMC;
import com.sybertiger.xenomc.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModOreGeneration {

    public static PlacedFeature register(String name, PlacedFeature feature){
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, name, feature);
    }

    public static <Config extends FeatureConfiguration> ConfiguredFeature<Config,?> register(String name, ConfiguredFeature<Config,?> configuredFeature){

        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, name, configuredFeature);
    }

    public static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier modifier){
        return List.of(CountPlacement.of(count),InSquarePlacement.spread(),modifier, BiomeFilter.biome());
    }


    @Mod.EventBusSubscriber(modid = XenoMC.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ForgeBusSubscriber{
        @SubscribeEvent
        public static void biomeLoading(BiomeLoadingEvent event){
            List<Supplier<PlacedFeature>> placements = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);
            if(event.getCategory() == Biome.BiomeCategory.NETHER){

            } else if(event.getCategory() == Biome.BiomeCategory.THEEND){

            } else {
                placements.add(()-> ModOrePlacements.SILICON_ORE);
            }
        }
    }
}

