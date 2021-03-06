package Spazzysmod.world.biome;

import net.minecraft.world.biome.BiomeGenBase;

public class SpazzysBiomes {

    public static final BiomeGenBase moonBiome = new BiomeMoonBiome(40)
            .setColor(0xFFD800).setMinMaxHeight(0.1F, 1.5F);

    public static final BiomeGenBase marsBiome = new BiomeMarsBiome(42)
            .setColor(0xFFD800).setMinMaxHeight(0.1F, 1.5F);
}
