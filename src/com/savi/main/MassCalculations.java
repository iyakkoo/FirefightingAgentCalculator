package com.savi.main;

import com.savi.gas.GasType;

import java.util.Scanner;

class MassCalculations {

    private double[] k1 = {0.0664,0.1269,0.56119,0.79968,0.6598,0.65799};
    private double[] k2 = {0.000274,0.000513,0.002055,0.00293,0.002416,0.002239};

    void calcGasMass(Area area, GasType gasType) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n## Podaj temperaturę przechowywania butli z gazem z dokładnością do 1 stopnia C\n");
        System.out.print("Temperatura pomieszczenia: ");
        double temperature = scanner.nextInt();
        double gasVolume = k1[gasType.getChoiceNumberForGasType()] + k2[gasType.getChoiceNumberForGasType()] * temperature;
        double gasMass = (area.getTotalVolume() / gasVolume)
                * (gasType.getGasConcentration()/(100 - gasType.getGasConcentration()));
        System.out.printf("\nObliczona masa gazu wynosi %.1f kg\n", gasMass);
    }


}
