package org.lld.design_patterns.structural.bridge;

public class Main {

    /**
     *
     * BRIDGE DESIGN PATTERN
     * We use this pattern to dynamically change the behaviour of class method at runtime;
     *
     */


    public static void main(String[] args) {
        LivingThing frog1 = new Frog(new WaterBreather());
        LivingThing frog2 = new Frog(new LandBreather());

        System.out.println(frog1.getBreathingTechnique());
        System.out.println(frog2.getBreathingTechnique());

    }
}
