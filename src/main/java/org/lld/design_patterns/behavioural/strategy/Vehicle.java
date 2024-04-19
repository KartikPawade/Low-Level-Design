package org.lld.design_patterns.behavioural.strategy;
//public class Vehicle {
//    void drive(){
//        System.out.println("Simple Drive");
//    }
//}
//
//class SportVehicle extends  Vehicle{
//
//    @Override
//    void drive() {
//        System.out.println("Special Drive"); // SAME implementation
//    }
//}
//
//class PassengerVehicle extends  Vehicle{ // default/ diff implementation
//
//}
//class OffRoadVehicle extends Vehicle{
//    @Override
//    void drive() {
//        System.out.println("Special Drive"); // SAME implementation
//    }
//}
//
//class LuxuryVehicle extends Vehicle{
//    @Override
//    void drive() {
//        System.out.println("Special Drive"); // SAME implementation
//    }
//}

// when some children of parent are going to have same implementation then we can use this pattern, and separate out the method implementation into hierarchical structure

interface Drive {
    void drive();
}

class SpecialDrive implements Drive {
    @Override
    public void drive() {
        System.out.println("Special Drive");
    }
}

class SimpleDrive implements Drive {
    @Override
    public void drive() {
        System.out.println("Simple Drive");
    }
}

public class Vehicle {
    Drive drive;

    public Vehicle(Drive drive) {
        this.drive = drive;
    }

    void driveVehicle() {
        drive.drive();
    }
}
class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SpecialDrive());
    }
}
class LuxuryVehicle extends Vehicle {
    public LuxuryVehicle() {
        super(new SpecialDrive());
    }
}

class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new SimpleDrive());
    }
}
class VehicleDriver {
    public static void main(String[] args) {
        Vehicle vehicle = new LuxuryVehicle();
        vehicle.drive.drive();
    }
}

