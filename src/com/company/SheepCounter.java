package com.company;

/**
 * Created by hackeru on 23/03/2017.
 */
public class SheepCounter {
    int counter = 0;
    final private Object lock1 = new Object();

    public void incrementAndPrint() {
        System.out.println("inside");
        synchronized (lock1) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(++counter + " \n");
        }
        System.out.println("Outside");
    }

    public void doSomething() {
        synchronized (lock1) {
            System.out.print("Doing something");
        }
    }
}
