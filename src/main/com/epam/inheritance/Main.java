package com.epam.inheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new FordCar();

        //id and method doMark from class Car
        car.doMark();
        //id and method doMark from class FordCar
        car1.doMark();

        //Casting objects
        FordCar fordCar = (FordCar) car1;
        //id and method doMark from class FordCar 
        fordCar.doMark();
    }
}
