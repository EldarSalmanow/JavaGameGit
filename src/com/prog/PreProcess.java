package com.prog;

public class PreProcess {
    public static void preProcess() {
        System.out.println("PreProcess initialise started...");
        sleep();
        System.out.println("Registration players started...");
        sleep();
        Generators.regPlayers();
        sleep();
        System.out.println("Registration players is end...");
        sleep();
        System.out.println("Registration enemies started...");
        sleep();
        Generators.genEnemy();
        sleep();
        System.out.println("Registration enemies is end...");
        sleep();
        System.out.println("PreProcess initialise is end...");
    }

    private static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
    }
}
