package com.speedforce;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import com.speedforce.client.ModKeys;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.bus.api.SubscribeEvent;


@Mod(SpeedForce.MODID)
public class SpeedForce {

    public static final String MODID = "speedforce";

    public static final Logger LOGGER = LogUtils.getLogger();


    public SpeedForce(IEventBus modEventBus, ModContainer modContainer) {


        // Регистрация клавиш G и K
        ModKeys.register(modEventBus);


        LOGGER.info("SILA SKOROSTI AKTIVIROVANA");
        LOGGER.info("BARRY ALLEN CONNECTED");
        LOGGER.info("MULTIVERSE READY");
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

        LOGGER.info("SERVER SPEED FORCE ONLINE");

    }
}