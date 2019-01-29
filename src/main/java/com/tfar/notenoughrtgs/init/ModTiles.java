package com.tfar.notenoughrtgs.init;


import com.tfar.notenoughrtgs.tile.generator.TileRTGCompact;
import com.tfar.notenoughrtgs.tile.generator.TileRTGDense;
import com.tfar.notenoughrtgs.util.reference;
import nc.config.NCConfig;
import nc.util.InfoHelper;
import nc.util.UnitHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.List;

import static nc.util.InfoHelper.infoLine;


public class ModTiles {


    public static void register() {
    GameRegistry.registerTileEntity(TileRTGCompact.UraniumCompact.class, reference.MOD_ID + ":rtg_uranium_compact");
 /*   GameRegistry.registerTileEntity(TileRTGCompact.PlutoniumCompact.class, reference.MOD_ID + ":rtg_plutonium_compact");
    GameRegistry.registerTileEntity(TileRTGCompact.AmericiumCompact.class, reference.MOD_ID + ":rtg_americium_compact");
    GameRegistry.registerTileEntity(TileRTGCompact.CaliforniumCompact.class, reference.MOD_ID + ":rtg_californium_compact");
    GameRegistry.registerTileEntity(TileRTGDense.UraniumDense.class, reference.MOD_ID + ":rtg_uranium_dense");
    GameRegistry.registerTileEntity(TileRTGDense.PlutoniumDense.class, reference.MOD_ID + ":rtg_plutonium_dense");
    GameRegistry.registerTileEntity(TileRTGDense.AmericiumDense.class, reference.MOD_ID + ":rtg_americium_dense");
    GameRegistry.registerTileEntity(TileRTGDense.CaliforniumDense.class, reference.MOD_ID + ":rtg_californium_dense");
*/}

    }




