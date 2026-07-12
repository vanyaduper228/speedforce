package com.speedforce.client.hud;


import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;



public class HudText {


    public static void draw(
            GuiGraphics guiGraphics,
            int x,
            int y
    ){


        Minecraft mc = Minecraft.getInstance();



        String[] data = {

                "SUBJECT: SPEEDSTER",
                "LEVEL: 01",
                "EXPERIENCE: 0000",
                "DISTANCE: 0.00 KM",
                "",
                "CURRENT SPEED: 0 m/s",
                "MAX VELOCITY: UNKNOWN",
                "",
                "ABILITY MATRIX",
                "> VELOCITY CONTROL",
                "> ENERGY EFFICIENCY",
                "> RECOVERY SYSTEM"

        };



        int offset = 0;


        for(String line : data){


            guiGraphics.drawString(
                    mc.font,
                    line,
                    x,
                    y + offset,
                    0xDDE7F0
            );


            offset += 18;
        }

    }
}