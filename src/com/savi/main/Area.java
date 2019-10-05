package com.savi.main;

import java.util.Scanner;

public class Area {
    private double mainVolume;
    private double underFloorVolume;
    private double ceilingVolume;
    private double totalVolume;

    void calcVolume(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("## Podaj wymiary pomieszczenia w celu obliczenia kubatury, wymiary podawaj w metrach \n" +
                            "## lub wpisz 0, jeśli dana przestrzeń niewystępuje\n");
        System.out.print("Powierzchnia pomieszczenia = ");
        double field = scanner.nextDouble();
        System.out.print("Wysokość przestrzeni głównej = ");
        double mainHeight = scanner.nextDouble();
        System.out.print("Wysokość przestrzeni pod podłogą podniesioną = ");
        double underFloorHeight = scanner.nextDouble();
        System.out.print("Wysokość przestrzeni nad sufitem podwieszanym = ");
        double ceilingHeight = scanner.nextDouble();
        this.mainVolume = field * mainHeight;
        this.ceilingVolume = field * ceilingHeight;
        this.underFloorVolume = field * underFloorHeight;
        this.totalVolume = mainVolume + underFloorVolume + ceilingVolume;
    }

    public double getMainVolume() {
        return mainVolume;
    }

    public double getUnderFloorVolume() {
        return underFloorVolume;
    }

    public double getCeilingVolume() {
        return ceilingVolume;
    }

    double getTotalVolume() {
        return totalVolume;
    }
}
