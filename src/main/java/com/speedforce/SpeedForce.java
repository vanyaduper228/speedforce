package com.speedforce;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(SpeedForce.MODID)
public class SpeedForce {

    public static final String MODID = "speedforce";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SpeedForce(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("╔════════════════════════════════╗");
        LOGGER.info("║    ⚡ SPEED FORCE ACTIVATED ⚡   ║");
        LOGGER.info("║   BARRY ALLEN IS CONNECTED     ║");
        LOGGER.info("║   THE MULTIVERSE IS READY      ║");
        LOGGER.info("╚════════════════════════════════╝");
    }

    @SubscribeEvent
    public static void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("⚡ SERVER: SPEED FORCE ONLINE");
    }
}