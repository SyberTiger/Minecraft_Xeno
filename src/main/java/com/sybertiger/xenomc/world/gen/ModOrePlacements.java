package com.sybertiger.xenomc.world.gen;

import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModOrePlacements {
    public static final PlacedFeature SILICON_ORE = ModOreGeneration.register("silicon_ore", ModOreFeatures.SILICON_ORE.placed(ModOreGeneration.commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.bottom(),VerticalAnchor.absolute(96)))));
}
