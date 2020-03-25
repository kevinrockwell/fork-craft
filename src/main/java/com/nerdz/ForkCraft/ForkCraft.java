package com.nerdz.ForkCraft;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ForkCraft.MODID, name = ForkCraft.NAME, version = ForkCraft.VERSION)
public class ForkCraft {
    public static final String MODID = "forkcraft";
    public static final String NAME = "Fork Craft";
    public static final String VERSION = "0.0.0";

    private static Logger logger;

    @EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(final FMLInitializationEvent event) {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
