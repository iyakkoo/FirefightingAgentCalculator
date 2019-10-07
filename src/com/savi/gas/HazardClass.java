package com.savi.gas;

import java.util.Scanner;

public class HazardClass {

    private String[] hazardClasses = {"A", "A+", "B"};
    private int choiceNumberForHazardClass;

    String getClass (int selectedClass){
        return hazardClasses[selectedClass];
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
}
