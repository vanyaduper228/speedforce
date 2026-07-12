package com.speedforce.client;

import net.minecraft.client.KeyMapping;
import net.minecraft.client.KeyMapping.Category;
import net.minecraft.resources.Identifier;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;

import org.lwjgl.glfw.GLFW;


public class ModKeys {


    public static KeyMapping SPEED_FORCE_KEY;

    public static KeyMapping SPEED_FORCE_MENU;


    private static final Category SPEEDFORCE_CATEGORY =
            Category.register(
                    Identifier.fromNamespaceAndPath(
                            "speedforce",
                            "main"
                    )
            );



    public static void register(IEventBus modEventBus) {

        modEventBus.addListener(ModKeys::registerKeys);

    }



    private static void registerKeys(RegisterKeyMappingsEvent event) {


        SPEED_FORCE_KEY = new KeyMapping(
                "key.speedforce.speed",
                GLFW.GLFW_KEY_G,
                SPEEDFORCE_CATEGORY
        );


        SPEED_FORCE_MENU = new KeyMapping(
                "key.speedforce.menu",
                GLFW.GLFW_KEY_K,
                SPEEDFORCE_CATEGORY
        );


        event.register(SPEED_FORCE_KEY);
        event.register(SPEED_FORCE_MENU);

    }
}