package com.speedforce.client.gui;


import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;


public class EnergyCore {


    public static void draw(
            GuiGraphics guiGraphics,
            int x,
            int y,
            float energy
    ) {


        int color;


        if (energy > 50) {
            color = 0xFFFFAA00;
        }
        else {
            color = 0xFFFF3300;
        }



        // Фон ядра

        guiGraphics.fill(
                x - 35,
                y - 35,
                x + 35,
                y + 35,
                0x55111111
        );



        // Энергия

        int height = (int)(energy * 0.6);



        guiGraphics.fill(
                x - 20,
                y + 25 - height,
                x + 20,
                y + 25,
                color
        );



        // Текст энергии

        guiGraphics.drawCenteredString(
                Minecraft.getInstance().font,
                (int) energy + "%",
                x,
                y - 5,
                0xFFFFFF
        );



        guiGraphics.drawCenteredString(
                Minecraft.getInstance().font,
                "ENERGY",
                x,
                y + 45,
                0xFFFFAA00
        );

    }
}