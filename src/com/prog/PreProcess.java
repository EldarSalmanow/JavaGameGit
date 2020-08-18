package com.prog;

public class PreProcess {
    public static void preProcess() {
        System.out.println("PreProcess initialise started...");
        sleep();
        System.out.println("Registration players started...");
        sleep();
        Generators.regPlayers();
        System.out.println("");
        Generators.genEnemy();
    }

    private static void sleep() {
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException error) {
            error.printStackTrace();
        }
    }
}
