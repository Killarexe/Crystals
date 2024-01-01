package github.killarexe.crystals.worldgen.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration.TargetBlockState;

public record CrystalFeatureConfig(TargetBlockState target) implements FeatureConfiguration{
	public static final Codec<CrystalFeatureConfig> CODEC = RecordCodecBuilder.create(instance -> instance.group(
		TargetBlockState.CODEC.fieldOf("target").forGetter(CrystalFeatureConfig::target)
	).apply(instance, CrystalFeatureConfig::new));
}
