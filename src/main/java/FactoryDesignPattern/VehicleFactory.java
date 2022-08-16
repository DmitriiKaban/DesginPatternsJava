package FactoryDesignPattern;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicle){
        vehicle = vehicle.toLowerCase();

        if(vehicle.equals("car"))
            return new Car();
        else if(vehicle.equals("bike"))
            return new Bike();
        else
            return null;
    }
}
