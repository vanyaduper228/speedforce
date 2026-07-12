package com.speedforce.client;

import com.speedforce.SpeedForce;
import com.speedforce.player.FlashMovement;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;


@EventBusSubscriber(modid = SpeedForce.MODID)
public class KeyHandler {

    private static boolean wasPressed = false;
    private static boolean speedActive = false;


    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event) {

        Minecraft minecraft = Minecraft.getInstance();

        if (minecraft.player == null) {
            return;
        }


        boolean pressed = ModKeys.SPEED_FORCE_KEY.isDown();


        if (pressed && !wasPressed) {

             speedActive = !speedActive;
             FlashMovement.setSpeed(speedActive);



            if (speedActive) {

                minecraft.player.addEffect(
                        new MobEffectInstance(
                                MobEffects.SPEED,
                                999999,
                                9,
                                false,
                                false
                        )
                );


                minecraft.player.displayClientMessage(
                        Component.literal("⚡ СИЛА СКОРОСТИ ВКЛЮЧЕНА"),
                        false
                );


            } else {

                minecraft.player.removeEffect(
                        MobEffects.SPEED
                );


                minecraft.player.displayClientMessage(
                        Component.literal("⚡ СИЛА СКОРОСТИ ВЫКЛЮЧЕНА"),
                        false
                );
            }
        }


        wasPressed = pressed;
    }
}