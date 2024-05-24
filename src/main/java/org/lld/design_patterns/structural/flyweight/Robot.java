package org.lld.design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;


class Main {
    public static void main(String[] args) {
        /**
         *
         * FLY-WEIGHT Design Pattern
         * This Pattern is used to save space, and use the same object on place of creating multiple objects.
         * To achieve this pattern we keep the common properties in the class, and pass the dynamic properties(coming from client) at run-time
         * we use map/cache to check of the object is already present, and use it.
         */

        Robot robot = RobotFactory.getRobot(null);
        robot.display();
    }
}


interface Robot {
    void display();
}

enum RobotType {
    Humanoid,
    RoboticDog;
}

class Humanoid implements Robot {
    RobotType robotType;
    int[][] body; // space consuming big 2D array.

    public Humanoid() {
        this.robotType = RobotType.Humanoid;
        this.body = new int[10000][10000];
    }

    @Override
    public void display() {
        System.out.println("Human Robot");
    }
}

class RoboticDog implements Robot {
    RobotType robotType;
    int[][] body; // space consuming big 2D array.

    public RoboticDog() {
        this.robotType = RobotType.RoboticDog;
        this.body = new int[10000][10000];
    }

    @Override
    public void display() {
        System.out.println("Dog as Robot");
    }
}

class NullRobot implements Robot {
    @Override
    public void display() {
        System.out.println("No such Robot");
    }
}

class RobotFactory {
    public static Map<RobotType, Robot> robotCache = new HashMap<>();

    public static Robot getRobot(RobotType robotType) {
        if (robotCache.containsKey(robotType)) {
            return robotCache.get(robotType);
        }
        Robot robot;
        if (RobotType.RoboticDog.equals(robotType)) {
            robot = new RoboticDog();
            robotCache.put(RobotType.RoboticDog, robot);
        } else if (RobotType.Humanoid.equals(robotType)) {
            robot = new Humanoid();
            robotCache.put(RobotType.Humanoid, robot);
        } else {
            return new NullRobot();
        }
        return robot;
    }
}
