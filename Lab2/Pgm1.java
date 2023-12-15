/*1. A Java class is used to represent elements from the periodic table of elements. The details to
be captured include atomic number, name of the element, chemical symbol, class, and
atomic weight.
e.g. 11 Sodium Na alkali metal 22.9898
a.Now store the details of three different elements.(User input)
b.You can have a method to display the details of all three elements as well as a method that
displays details of all elements with an atomic weight >15 */

package Lab2;

import java.util.Scanner;

public class Pgm1 {
    public static void displayElement(int atomicNumber, String atomicName, String atomicSymbol, String atomicClass,
            double atomicWeight) {
        System.out.println("Atomic Number: " + atomicNumber + ", Name: " + atomicName + ", Symbol: " + atomicSymbol
                + ", Class: " + atomicClass + ", Weight: " + atomicWeight);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int[] atomicNumbers = new int[3];
        String[] atomicNames = new String[3];
        String[] atomicSymbols = new String[3];
        String[] atomicClasses = new String[3];
        double[] atomicWeights = new double[3];

        // Input details for three different elements
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the atomic number of element " + (i + 1) + ":");
            atomicNumbers[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the name of element " + (i + 1) + ":");
            atomicNames[i] = scanner.nextLine();
            System.out.println("Enter the symbol of element " + (i + 1) + ":");
            atomicSymbols[i] = scanner.nextLine();
            System.out.println("Enter the class of element " + (i + 1) + ":");
            atomicClasses[i] = scanner.nextLine();
            System.out.println("Enter the weight of element " + (i + 1) + ":");
            atomicWeights[i] = scanner.nextDouble();
        }

        // Display details of all three elements
        System.out.println("Details of all three elements:");
        for (int i = 0; i < 3; i++) {
            displayElement(atomicNumbers[i], atomicNames[i], atomicSymbols[i], atomicClasses[i], atomicWeights[i]);
        }

        // Display details of elements with atomic weight > 15
        System.out.println("Elements with atomic weight more than 15:");
        for (int i = 0; i < 3; i++) {
            if (atomicWeights[i] > 15) {
                displayElement(atomicNumbers[i], atomicNames[i], atomicSymbols[i], atomicClasses[i], atomicWeights[i]);
            }
        }

        scanner.close();
    }
}

// Another method solving-> using ArrayList instead

import java.util.*;

class Element {
    int atomicNumber;
    String name;
    String symbol;
    String classification;
    double atomicWeight;

    Element(int atomicNumber, String name, String symbol, String classification, double atomicWeight) {
        this.atomicNumber = atomicNumber;
        this.name = name;
        this.symbol = symbol;
        this.classification = classification;
        this.atomicWeight = atomicWeight;
    }

   
}

public class pgm {
    public static void displayElements(ArrayList<Element> elements) {
        for (Element element : elements) {
            System.out.println(element);
        }
    }

    public static void d15(ArrayList<Element> elements, double weight) {
        for (Element element : elements) {
            if (element.atomicWeight > weight) {
                System.out.println(element);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Element> elements = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter atomic number:");
            int atomicNumber = sc.nextInt();
            sc.nextLine();  // Consume the newline character
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter symbol:");
            String symbol = sc.nextLine();
            System.out.println("Enter classification:");
            String classification = sc.nextLine();
            System.out.println("Enter atomic weight:");
            double atomicWeight = sc.nextDouble();

            Element element = new Element(atomicNumber, name, symbol, classification, atomicWeight);
            elements.add(element);
        }

        System.out.println("All Elements:");
        displayElements(elements);

        System.out.println("\nElements with Atomic Weight > 15:");
        d15(elements, 15.0);

        sc.close();
    }
}

