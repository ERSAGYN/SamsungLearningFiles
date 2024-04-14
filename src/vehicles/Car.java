package vehicles;

import details.*;
import professions.*;

public class Car {
    private String brand;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine motor;

    public void start() {
        System.out.println("Let's go");
    }

    public void stop() {
        System.out.println("Let's stop");
    }

    public void turnRight() {
        System.out.println("Turn right");
    }

    public void turnLeft() {
        System.out.println("Turn left");
    }
}
