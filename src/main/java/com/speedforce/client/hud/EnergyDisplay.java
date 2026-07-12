package com.speedforce.client.hud;


import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;



public class EnergyDisplay {


    public static void draw(
            GuiGraphics guiGraphics,
            int x,
            int y
    ){


        Minecraft minecraft = Minecraft.getInstance();



        guiGraphics.drawCenteredString(
                minecraft.font,
                "ENERGY CORE",
                x,
                y,
                0xAAAAAA
        );



        guiGraphics.drawCenteredString(
                minecraft.font,
                "82.4%",
                x,
                y + 25,
                0xFFFFB300
        );



        guiGraphics.drawCenteredString(
                minecraft.font,
                "CORE STABLE",
                x,
                y + 45,
                0x55FF88
        );



        // индикатор

        guiGraphics.fill(
                x - 70,
                y + 75,
                x + 70,
                y + 82,
                0x33333333
        );


        guiGraphics.fill(
                x - 70,
                y + 75,
                x + 45,
                y + 82,
                0xFFFFB300
        );

    }
}