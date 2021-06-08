package com.javatutorialhq;

/**
 * apastukh
 */
public class DeskFan {
    /*
     * DeskFan object definition
     */
        boolean powerOn = false;
        int currentGearSpeed = 3;
        boolean isOscillating = true;

        void turnOn(boolean newVal) {
            powerOn = newVal;
        }

        void changeGearSpeed(int newVal) {
            currentGearSpeed = newVal;
        }

        void changeOscillation(boolean newVal) {
            isOscillating = newVal;
        }

        public void showState() {
            System.out.println("Printing the current state of object DeskFan");
            System.out.println("Is it powerOn:" + powerOn);
            System.out.println("What is the current speed:" + currentGearSpeed);
            System.out.println("Is it oscillating:" + isOscillating);
        }
    }



