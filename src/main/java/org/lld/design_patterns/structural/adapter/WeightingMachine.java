package org.lld.design_patterns.structural.adapter;


class Main {
    public static void main(String[] args) {

        /**
         * ADAPTER PATTERN
         * When Existing functionality response is required to be converted/not, we use Adapter patter
         * Eg:- existing library gives response in JSON, but client might need it in XML, so we use adapter which converts JSON to XML.
         *
         */

        WeightingAdapter weightingAdapter = new WeightingAdapterForBabies(new WeightingMachineForBabies());
        System.out.println(weightingAdapter.getWeightInKG());
    }
}

public interface WeightingMachine {
    public Double getWeightInPound();
}

class WeightingMachineForBabies implements WeightingMachine {
    @Override
    public Double getWeightInPound() {
        System.out.println("Weight in pounds");
        return 10.2;
    }
}

class WeightingMachinesForBabies implements WeightingMachine {
    @Override
    public Double getWeightInPound() {
        System.out.println("Weight in pounds");
        return 10.2;
    }
}

interface WeightingAdapter {
    double getWeightInKG();
}

class WeightingAdapterForBabies implements WeightingAdapter {
    WeightingMachine weightingMachine;

    public WeightingAdapterForBabies(WeightingMachine weightingMachine) {
        this.weightingMachine = weightingMachine;
    }

    @Override
    public double getWeightInKG() {
        double weightInPound = weightingMachine.getWeightInPound();
        System.out.println("Weight in KG");
        return weightInPound + 100;
    }
}
