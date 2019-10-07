package com.savi.gas;

public class GasConcentration {

    public GasConcentration(int choiceNumberForGasType, int choiceNumberForHazardClass) {
        this.choiceNumberForGasType = choiceNumberForGasType;
        this.choiceNumberForHazardClass = choiceNumberForHazardClass;
    }
    private int choiceNumberForGasType;
    private int choiceNumberForHazardClass;
    private double gasConcentration;


    private double setGasConcentration(){
        double[][] concentrations = {{5.3,5.6,5.9},
                {7.9,8.5,9.0},
                {41.9,49.2,51.7},
                {40.3,45.2,47.6},
                {40.3,45.2,47.6},
                {39.9,45.7,48.1}};
        return gasConcentration = concentrations[choiceNumberForGasType][choiceNumberForHazardClass];
    }

    double getGasConcentration() {
        setGasConcentration();
        return gasConcentration;
    }
}
