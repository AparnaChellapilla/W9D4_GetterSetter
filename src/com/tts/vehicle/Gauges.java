package com.tts.vehicle;

public class Gauges {
    public int getCurrentRPM() {
        return currentRPM;
    }

    public void setCurrentRPM(int currentRPM) {
        this.currentRPM = currentRPM;
    }

    private int currentRPM;
    private int speed;


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

   /* private int calculateRPM(int speed) {

        int rpm = speed * getBestGear(speed) * engineFactor();

        return rpm;
    }

    private int engineFactor() {
        return 0;
    }

    private int getBestGear(int speed) {

        return speed;
    }*/
}