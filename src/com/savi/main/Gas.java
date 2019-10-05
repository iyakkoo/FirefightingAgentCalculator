package com.savi.main;

import java.util.Scanner;

public class Gas {
    private String[] gasTypes = {"FK 5-1-12", "HFC227ea","IG-01", "IG-100", "IG-55", "IG-541"};
    private int selectedGas;
    private String[] hazardClasses = {"A", "A+", "B"};
    private int selectedClass;
    private double gasConcentration;

    void startGasSelection(){
        selectGas();
        selectClass();
        setGasConcentration();
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
        int gasTypeChoose = 0;
        do {
            System.out.print("Rodzaj gazu: ");
            this.selectedGas = scanner.nextInt();
        } while (selectedGas < 0 || selectedGas > 5);
        System.out.println("## Wybrano " + gasTypes[selectedGas]);
    }

    int getSelectedGas() {
        return selectedGas;
    }

    private void selectClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n## Wybierz klasę zagrożenia\n" +
                "## 0 - dla A\n" +
                "## 1 - dla A+\n" +
                "## 2 - dla B\n");

        do {
            System.out.print("Klasa zagrożenia: ");
            selectedClass = scanner.nextInt();
        } while (selectedClass < 0 || selectedClass > 2);
        System.out.println("## Wybrano klasę zakrożenia: " + hazardClasses[selectedClass]);
    }

    public int getSelectedClass() {
        return selectedClass;
    }

    private void setGasConcentration(){
        double[][] concentrations = {{5.3,5.6,5.9},
                                    {7.9,8.5,9.0},
                                    {41.9,49.2,51.7},
                                    {40.3,45.2,47.6},
                                    {40.3,45.2,47.6},
                                    {39.9,45.7,48.1}};
        gasConcentration = concentrations[selectedGas][selectedClass];

    }

    double getGasConcentration() {
        return gasConcentration;
    }


}
