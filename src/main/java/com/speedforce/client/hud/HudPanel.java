package com.speedforce.client.hud;


import net.minecraft.client.gui.GuiGraphics;


public class HudPanel {


    public static void draw(
            GuiGraphics guiGraphics,
            int x,
            int y
    ) {


        int width = 300;
        int height = 430;



        // стеклянная панель

        guiGraphics.fill(
                x,
                y,
                x + width,
                y + height,
                0xCC05080D
        );



        // верхняя линия

        guiGraphics.fill(
                x,
                y,
                x + width,
                y + 1,
                0xFFFFB300
        );



        // левая линия

        guiGraphics.fill(
                x,
                y,
                x + 1,
                y + height,
                0xFFFFB300
        );



        // технические линии

        guiGraphics.fill(
                x + 15,
                y + 55,
                x + width - 15,
                y + 56,
                0x55666666
        );


        guiGraphics.fill(
                x + 15,
                y + 180,
                x + width - 15,
                y + 181,
                0x55666666
        );


        guiGraphics.fill(
                x + 15,
                y + 320,
                x + width - 15,
                y + 321,
                0x55666666
        );

    }
}