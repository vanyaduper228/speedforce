package com.speedforce.client;


import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;



public class SpeedForceScreen extends Screen {


    private float pulse = 0;


    public SpeedForceScreen() {

        super(Component.literal("Speed Force"));

    }



    @Override
    public void render(
            GuiGraphics guiGraphics,
            int mouseX,
            int mouseY,
            float partialTick
    ) {


        pulse += 0.05f;


        if(pulse > 6.28f){
            pulse = 0;
        }



        // затемнение мира

        guiGraphics.fill(
                0,
                0,
                width,
                height,
                0x99000000
        );



        int panelX = width - 380;
        int panelY = 30;

        int panelWidth = 350;
        int panelHeight = 420;



        // основной корпус

        guiGraphics.fill(
                panelX,
                panelY,
                panelX + panelWidth,
                panelY + panelHeight,
                0xEE070B12
        );



        // рамка сверху

        guiGraphics.fill(
                panelX,
                panelY,
                panelX + panelWidth,
                panelY + 2,
                0xFFFFB300
        );



        // левая линия

        guiGraphics.fill(
                panelX,
                panelY,
                panelX + 2,
                panelY + panelHeight,
                0xFFFFB300
        );



        // углы

        guiGraphics.fill(
                panelX,
                panelY,
                panelX + 35,
                panelY + 4,
                0xFFFFB300
        );


        guiGraphics.fill(
                panelX,
                panelY,
                panelX + 4,
                panelY + 35,
                0xFFFFB300
        );



        // заголовок


        guiGraphics.drawString(
                font,
                "⚡ SPEED FORCE",
                panelX + 25,
                panelY + 20,
                0xFFFFB300,
                true
        );


        guiGraphics.drawString(
                font,
                "STAR LABS // ANALYSIS SYSTEM",
                panelX + 25,
                panelY + 40,
                0xAAAAAA,
                false
        );



        // разделитель


        guiGraphics.fill(
                panelX + 20,
                panelY + 65,
                panelX + panelWidth - 20,
                panelY + 66,
                0x55555555
        );



        // ENERGY CORE


        guiGraphics.drawCenteredString(
                font,
                "ENERGY CORE",
                panelX + 175,
                panelY + 90,
                0xFFFFFF
        );



        int energy = 82;



        guiGraphics.drawCenteredString(
                font,
                energy + "%",
                panelX + 175,
                panelY + 115,
                0xFFFFB300
        );



        guiGraphics.drawCenteredString(
                font,
                "СТАБИЛЬНО",
                panelX + 175,
                panelY + 135,
                0x55FF88
        );



        // индикатор энергии


        guiGraphics.fill(
                panelX + 55,
                panelY + 165,
                panelX + 295,
                panelY + 175,
                0x33222222
        );


        guiGraphics.fill(
                panelX + 55,
                panelY + 165,
                panelX + 55 + (int)(240 * energy / 100f),
                panelY + 175,
                0xFFFFB300
        );



        // линия


        guiGraphics.fill(
                panelX + 20,
                panelY + 200,
                panelX + panelWidth - 20,
                panelY + 201,
                0x55555555
        );



        // данные


        guiGraphics.drawString(
                font,
                "ДАННЫЕ СПИДСТЕРА",
                panelX + 25,
                panelY + 225,
                0xAAAAAA
        );


        String[] data = {

                "УРОВЕНЬ       1",
                "ОПЫТ          0 / 1000",
                "ДИСТАНЦИЯ     0.0 KM",
                "СКОРОСТЬ      0 m/s"

        };


        int y = panelY + 250;


        for(String text : data){

            guiGraphics.drawString(
                    font,
                    text,
                    panelX + 25,
                    y,
                    0xFFFFFF
            );

            y += 20;

        }



        // способности


        guiGraphics.drawString(
                font,
                "СПОСОБНОСТИ",
                panelX + 25,
                panelY + 345,
                0xAAAAAA
        );


        guiGraphics.drawString(
                font,
                "✓ Контроль скорости",
                panelX + 25,
                panelY + 370,
                0x55FF88
        );


        guiGraphics.drawString(
                font,
                "✓ Энергосбережение",
                panelX + 25,
                panelY + 390,
                0x55FF88
        );



        guiGraphics.drawString(
                font,
                "STAR LABS ONLINE",
                panelX + 25,
                panelY + 410,
                0x55FF88
        );

    }

}