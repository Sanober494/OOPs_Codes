/* A Java class is used to represent elements from the periodic table of elements. The details to
be captured include atomic number, name of the element, chemical symbol, class, and
atomic weight.
e.g. 11 Sodium Na alkali metal 22.9898
a.Now store the details of three different elements.
b.You can have a method to display the details of all three elements as well as a method that
displays details of all elements with an atomic weight >15 
*/
package Lab3;

import java.util.Scanner;

public class Pgm1 {
    public int atNumber;
    public String atName;
    public String atSymbol;
    public String atClass;
    public float atWeight;

    public Pgm1(int atNumber, String atName, String atSymbol, String atClass, float atWeight) {
        this.atNumber = atNumber;
        this.atName = atName;
        this.atSymbol = atSymbol;
        this.atClass = atClass;
        this.atWeight = atWeight;
    }

    public void displayElements() {
        System.out.println("The atomic number of the element is: " + atNumber);
        System.out.println("The name of the element is: " + atName);
        System.out.println("The atomic symbol of the element is: " + atSymbol);
        System.out.println("The class of the element is: " + atClass);
        System.out.println("The atomic weight of the element is: " + atWeight);

    }

    public static void main(String args[]) {
        Pgm1[] element = new Pgm1[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            System.out.println("Enter details of element " + (i + 1) + ":");
            System.out.println("Enter the atomic number of the element:");
            int atNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the atomic name:");
            String atName = scanner.nextLine();

            System.out.println("Enter the atomic symbol:");
            String atSymbol = scanner.nextLine();

            System.out.println("Enter the class of the element:");
            String atClass = scanner.nextLine();

            System.out.println("Enter the atomic weight:");
            float atWeight = scanner.nextFloat();

            element[i] = new Pgm1(atNumber, atName, atSymbol, atClass, atWeight);
        }
        scanner.close();
        System.out.println("The details of all the elements are:");
        for (Pgm1 elements : element) {
            elements.displayElements();
        }
        System.out.println("The detail(s) of elements whose atomic number is greater than 15 is/are:");
        for (Pgm1 elements : element) {
            if (elements.atWeight > 15) {
                elements.displayElements();
            }

        }

    }
}
