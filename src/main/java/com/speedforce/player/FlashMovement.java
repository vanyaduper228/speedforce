package com.speedforce.player;

import com.speedforce.SpeedForce;
import com.speedforce.SpeedForceData;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;


@EventBusSubscriber(modid = SpeedForce.MODID)
public class FlashMovement {

    private static boolean speedActive = false;

    private static final SpeedForceData data = new SpeedForceData();


    public static void setSpeed(boolean active) {
        speedActive = active;
        data.setActive(active);
    }


    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {

        Player player = event.getEntity();


        if (player.getAttribute(Attributes.MOVEMENT_SPEED) == null) {
            return;
        }


        if (speedActive) {

            int level = data.getLevel();


            double speed = switch (level) {

                case 1 -> 0.18D;
                case 2 -> 0.22D;
                case 3 -> 0.28D;
                case 4 -> 0.35D;
                case 5 -> 0.45D;

                default -> 0.6D;
            };


            player.getAttribute(Attributes.MOVEMENT_SPEED)
                    .setBaseValue(speed);


        } else {

            player.getAttribute(Attributes.MOVEMENT_SPEED)
                    .setBaseValue(0.1D);
        }
    }
}