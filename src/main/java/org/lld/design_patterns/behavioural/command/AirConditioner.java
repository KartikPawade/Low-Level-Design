package org.lld.design_patterns.behavioural.command;

public class AirConditioner {
    Boolean isOn;
    public void turnOn(){
        System.out.println("Turns AC on");
    }
    public void turnOff(){
        System.out.println("Turn AC off");
    }

    public void increaseTemperature(){
        System.out.println("Increases AC Temperature");
    }

    public void decreaseTemperature(){
        System.out.println("Decreases AC Temperature");
    }
}
interface Command{
    void execute();
}
class AcTurnOnAndDecreaseTempretureCommand implements Command{
    AirConditioner airConditioner;

    public  AcTurnOnAndDecreaseTempretureCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }
    @Override
    public void execute() {
        airConditioner.turnOn();
        airConditioner.decreaseTemperature();
    }
}
class AcTurnOffCommand implements Command{

    @Override
    public void execute() {

    }
}

class Main{
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        Command turnOnAndDecreaseTempretureCommand = new AcTurnOnAndDecreaseTempretureCommand(airConditioner);
        turnOnAndDecreaseTempretureCommand.execute();
    }
}
