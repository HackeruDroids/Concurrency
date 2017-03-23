package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        SheepCounter sheepCounter = new SheepCounter();
        for (int i = 0; i < 10; i++) {
            executor.submit(() -> {
                sheepCounter.incrementAndPrint();
            });
        }

        executor.shutdown(); //Now();

        //

        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(4);
        scheduledThreadPool.schedule(()->{}, 1, TimeUnit.SECONDS);

        scheduledThreadPool.scheduleAtFixedRate(() -> {
            System.out.println(1);
            System.out.println(1);
            System.out.println(1);
            System.out.println(1);
            System.out.println(1);
            System.out.println(1);
        }, 1, 1, TimeUnit.SECONDS);



    }
}
