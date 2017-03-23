package com.company;

public class Main {

    public static void main(String[] args) {
        SheepCounter counter = new SheepCounter();

        for (int i = 0; i < 10; i++) {
            new Thread(()->counter.incrementAndPrint()).start();
        }
    }
}
