package com.savi.gas;

import java.util.Scanner;

public class GasType {
    private String[] gasTypes = {"FK 5-1-12", "HFC227ea","IG-01", "IG-100", "IG-55", "IG-541"};
    private int choiceNumberForGasType;
    private String[] hazardClasses = {"A", "A+", "B"};
    private int choiceNumberForHazardClass;
    private double gasConcentration;

    public void startGasSelection(){
        selectGas();
        selectClass();
        setGasConcentration();
    }

    String getGasType (int selectedGas){
        return gasTypes[selectedGas];
    }

    String getClass (int selectedClass){
        return hazardClasses[selectedClass];
    }

    int getChoiceNumberForGasType() {
        return choiceNumberForGasType;
    }
    private void selectGas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("## Wybierz rodzaj środka gaśniczego dla przestrzeni gaszonej\n" +
                "## 0 - dla FK 5-1-12\n" +
                "## 1 - dla HFC227ea\n" +
                "## 2 - dla IG-01\n" +
                "## 3 - dla IG-100\n" +
                "## 4 - dla IG-55\n" +
                "## 5 - dla IG-541\n");
        do {
            System.out.print("Rodzaj gazu: ");
            this.choiceNumberForGasType = scanner.nextInt();
        } while (choiceNumberForGasType < 0 || choiceNumberForGasType > 5);
        System.out.println("## Wybrano " + gasTypes[choiceNumberForGasType]);
    }



    private void selectClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n## Wybierz klasę zagrożenia\n" +
                "## 0 - dla A\n" +
                "## 1 - dla A+\n" +
                "## 2 - dla B\n");
        do {
            System.out.print("Klasa zagrożenia: ");
            choiceNumberForHazardClass = scanner.nextInt();
        } while (0 > choiceNumberForHazardClass || choiceNumberForHazardClass > 2);
        System.out.println("## Wybrano klasę zakrożenia: " + hazardClasses[choiceNumberForHazardClass]);
    }

    public int getChoiceNumberForHazardClass() {
        return choiceNumberForHazardClass;
    }

    private void setGasConcentration(){
        double[][] concentrations = {{5.3,5.6,5.9},
                                    {7.9,8.5,9.0},
                                    {41.9,49.2,51.7},
                                    {40.3,45.2,47.6},
                                    {40.3,45.2,47.6},
                                    {39.9,45.7,48.1}};
        gasConcentration = concentrations[choiceNumberForGasType][choiceNumberForHazardClass];
    }

    double getGasConcentration() {
        return gasConcentration;
    }


}
