package com.savi.main;

import java.util.Scanner;

class MassCalculations {

    private double[] k1 = {0.0664,0.1269,0.56119,0.79968,0.6598,0.65799};
    private double[] k2 = {0.000274,0.000513,0.002055,0.00293,0.002416,0.002239};

    void calcGasMass(Area area, Gas gas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("## Podaj temperaturę przechowywania butli z gazem z dokładnością do 1 stopnia C");
        System.out.print("Temperatura pomieszczenia: ");
        double temperature = scanner.nextInt();
        double gasVolume = k1[gas.getSelectedGas()] + k2[gas.getSelectedGas()] * temperature;
        double gasMass = (area.getTotalVolume() / gasVolume) * (gas.getGasConcentration()/(100 - gas.getGasConcentration()));
        System.out.printf("Obliczona masa gazu wynosi %.1f kg", gasMass);
    }


}
