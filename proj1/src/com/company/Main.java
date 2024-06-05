package com.company;

public class Main {

    // Main m = new Main();
    // m.main();

    // Main.main();

    public static void main(String[] args) {

        new Car("honda", "civic", "Red", 5); // no one saves the car
        int x = 1;
        String name = "danny";
        Car honda = new Car("honda", "civic", "Red", 120, 5);
        honda.speed = 100;
        honda.doors = 5;
        honda.type = "Honda";

        // new --> constructor
        Car mitsubishi = new Car("Mitsubishi", "Outlander", "Black", 180, 7);
        mitsubishi.type = "Mitsubishi";
        mitsubishi.model = "Outlander";
        mitsubishi.speed = 220;

        System.out.println(honda);

        System.out.println("max speed = " + Car.max_speed);
        Car.max_speed = 180;

        System.out.println(mitsubishi.isFamilyCar());

        System.out.println("220 is legal? "+ Car.isSpeedLegal(220));

        System.out.println("mitsubishi legal? "+ mitsubishi.isthisCarsSpeedLegal());


        //System.out.println("max speed = " + Car.speed); // Error
        // <Car type="honda" />
        // <Car type="mitsubishi" />
    }


}
