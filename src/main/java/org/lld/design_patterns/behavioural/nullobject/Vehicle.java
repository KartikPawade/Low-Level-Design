package org.lld.design_patterns.behavioural.nullobject;


import java.util.Objects;

class Main {

    /**
     * NULL OBJECT DESIGN
     * To prevent null checks on all multiple places, we use null object design pattern
     *
     */

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle("CAR");
        vehicle.details();
    }
}


class VehicleFactory {
    public Vehicle getVehicle(String vehicle) {
        if (Objects.equals(vehicle, "CAR")) return new Car();
        return new NullVehicle();
    }
}

interface Vehicle {
    public void details();
}

class Car implements Vehicle {
    @Override
    public void details() {
        System.out.println("4 Wheeler Vehicle.");
    }
}

class NullVehicle implements Vehicle {
    @Override
    public void details() {
        System.out.println("No Vehicle");
    }
}