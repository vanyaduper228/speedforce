package com.speedforce.client;


import net.minecraft.client.Minecraft;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;


@EventBusSubscriber
public class KeyHandlerMenu {


    private static boolean oldState = false;


    @SubscribeEvent
    public static void tick(ClientTickEvent.Post event) {


        if (Minecraft.getInstance().player == null) {
            return;
        }


        boolean pressed =
                ModKeys.SPEED_FORCE_MENU.isDown();



        if (pressed && !oldState) {

            Minecraft.getInstance()
                    .setScreen(
                            new SpeedForceScreen()
                    );
        }


        oldState = pressed;
    }
}