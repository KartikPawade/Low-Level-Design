package org.lld.design_patterns.structural.bridge;

public abstract class LivingThing {

    BreathTechnique breathTechnique;

    public LivingThing(BreathTechnique breathTechnique) {
        this.breathTechnique = breathTechnique;
    }

    public abstract String getBreathingTechnique();
}

class Frog extends LivingThing{

    public Frog(BreathTechnique breathTechnique){
        super(breathTechnique);
    }

    @Override
    public String  getBreathingTechnique() {
       return breathTechnique.breathingTechnique();
    }
}
