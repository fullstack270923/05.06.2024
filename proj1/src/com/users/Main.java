package com.users;

import com.company.Car;

public class Main {

    static int add(int x, int y) {
        return x + y;
    }

    static float add(float x, float y) {
        return x + y;
    }

    public static void main(String[] args) {

        new Car("honda", "civic", "Red", 5); // no one saves the car
    }
}
