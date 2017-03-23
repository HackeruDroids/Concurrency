package com.company;

public class Main {

    public static void main(String[] args) {

        class Drives implements Drivable {
            @Override
            public void drive() {
                System.out.println("Driving");
            }
        }

        Drivable d = new Drives();
        d(d);


        Drivable drivable = new Drivable() {
            @Override
            public void drive() {
                System.out.println("Driving");
            }
        };

        Drivable lambdaDrive = ()->{};
        d(()->{});
    }


    public static void d(Drivable d) {
        d.drive();
    }
}
