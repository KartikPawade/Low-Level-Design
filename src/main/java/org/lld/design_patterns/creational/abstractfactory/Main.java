package org.lld.design_patterns.creational.abstractfactory;

public class Main {

    /**
     * When we need object based on condition, but we need it for a specific type.
     */

    public static void main(String[] args) {
        AbstractVehicleFactory abstractVehicleFactory = new AbstractVehicleFactory();
        VehicleFactory vehicleFactory = abstractVehicleFactory.getVehicleFactory("Luxury");

        Vehicle rollsRoyal = vehicleFactory.getVehicle("RollsRoyal");
        rollsRoyal.drive();
    }
}

class AbstractVehicleFactory {
    public VehicleFactory getVehicleFactory(String typeOfVehicle) {
        return switch (typeOfVehicle) {
            case "Luxury" -> new LuxuryVehicleFactory();
            case "Normal" -> new NormalVehicleFactory();
            default -> throw new IllegalStateException("Unexpected value: " + typeOfVehicle);
        };
    }
}

interface VehicleFactory {
    public Vehicle getVehicle(String vehicle);
}

class NormalVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String vehicle) {
        return switch (vehicle) {
            case "Honda" -> new Honda();
            case "i10" -> new I10();
            default -> throw new IllegalStateException("Unexpected value: " + vehicle);
        };
    }
}

class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String vehicle) {
        return switch (vehicle) {
            case "RollsRoyal" -> new RollsRoyal();
            default -> throw new IllegalStateException("Unexpected value: " + vehicle);
        };
    }
}

interface Vehicle {
    void drive();
}

class Honda implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Honda..");
    }
}

class RollsRoyal implements Vehicle {
    @Override
    public void drive() {
        System.out.println("RollsRoyal..");
    }
}

class I10 implements Vehicle {
    @Override
    public void drive() {
        System.out.println("i10..");
    }
}

