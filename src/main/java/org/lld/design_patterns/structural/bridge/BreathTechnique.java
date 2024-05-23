package org.lld.design_patterns.structural.bridge;

interface BreathTechnique {
    String breathingTechnique();
}

class LandBreather implements BreathTechnique{
    @Override
    public String breathingTechnique() {
        return "Breathes on Land";
    }
}
class WaterBreather implements  BreathTechnique{

    @Override
    public String breathingTechnique() {
        return "Breathes in Water";
    }
}
