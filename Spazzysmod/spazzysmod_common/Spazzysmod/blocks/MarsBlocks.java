package spazzysmod.blocks;

import spazzysmod.Spazzysmod;
import spazzysmod.config.SpazzysConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class MarsBlocks {

    public static Block marsRock;
    public static Block redRock;
    public static Block marsPortal;

    public static void initBlocks() {
        marsRock = new BlockMarsRock(SpazzysConfig.marsRockID, Material.rock)
                .setUnlocalizedName("marsRock");
        GameRegistry.registerBlock(marsRock,
                Spazzysmod.modid + marsRock.getUnlocalizedName2());
        LanguageRegistry.addName(marsRock, "Mars Rock");

        redRock = new BlockRedRock(SpazzysConfig.redRockID, Material.rock)
                .setUnlocalizedName("redRock");
        GameRegistry.registerBlock(redRock,
                Spazzysmod.modid + redRock.getUnlocalizedName2());
        LanguageRegistry.addName(redRock, "Red Rock");

        marsPortal = new BlockMarsPortal(SpazzysConfig.marsPortalID)
                .setUnlocalizedName("marsPortal");
        GameRegistry.registerBlock(marsPortal,
                Spazzysmod.modid + marsPortal.getUnlocalizedName2());
        LanguageRegistry.addName(marsPortal, "Mars Portal");
    }
}
