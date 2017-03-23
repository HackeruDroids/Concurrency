package com.company;

import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);



        Thread t = new Thread(() -> {
            while (true)
            //run:
            try {
                Thread.sleep(1000);
                System.out.println(LocalTime.now());
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        });
        t.start();
        t.interrupt();
    }


}
