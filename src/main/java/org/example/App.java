package org.example;

import FactoryDesignPattern.Vehicle;
import FactoryDesignPattern.VehicleFactory;

import static FactoryDesignPattern.VehicleFactory.getVehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // creational design patterns
        factoryDesignPattern();


    }

    public static void factoryDesignPattern(){
        Vehicle vehicle = getVehicle("BIKE");
        vehicle.move();
        vehicle = getVehicle("Car");
        vehicle.move();
    }
}
