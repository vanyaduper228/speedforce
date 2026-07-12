package com.speedforce;


public class SpeedForceData {

    // Энергия Силы Скорости
    private int energy = 100;


    // Общий уровень игрока
    private int level = 1;


    // Очки для прокачки
    private int skillPoints = 0;


    // Сколько блоков игрок пробежал
    private double distance = 0;


    // Уровень скорости
    private int speedLevel = 1;


    // Контроль расхода энергии
    private int controlLevel = 1;


    private boolean active = false;



    public int getEnergy() {
        return energy;
    }


    public void setEnergy(int energy) {
        this.energy = energy;
    }



    public int getLevel() {
        return level;
    }


    public void setLevel(int level) {
        this.level = level;
    }



    public int getSkillPoints() {
        return skillPoints;
    }


    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }



    public double getDistance() {
        return distance;
    }


    public void setDistance(double distance) {
        this.distance = distance;
    }



    public int getSpeedLevel() {
        return speedLevel;
    }


    public void setSpeedLevel(int speedLevel) {
        this.speedLevel = speedLevel;
    }



    public int getControlLevel() {
        return controlLevel;
    }


    public void setControlLevel(int controlLevel) {
        this.controlLevel = controlLevel;
    }



    public boolean isActive() {
        return active;
    }


    public void setActive(boolean active) {
        this.active = active;
    }
}