/*Write a java program to store information for a showroom that has a class name a Car with attributes:
Vehicle_id: String
Cost: Float[]; stores base, exercise duty and sales tax for each car
Total: float; stores total after calling calc_total
Grand_total: float; stores price after subtracting discount
calc_total() calculates total price (Base + Exercise duty + Sales tax)
calc_grand_total() calculates the price after a discount of a 10% Diwali discount.
In main method, Create an array of objects of Car.
Now call calc_total() to calculate total. Then after call calc_grand_total() to calculate the price after the discount.
Now Create a method which prints the details of the car with the highest grand price.
Note the array of object store the detail of n number of employees*/
package Lab7;
import java.util.*;

class Car {
    public String Vehicle_id;
    public float base, exerciseDuty, salesTax;
    public float[] Cost = new float[3];
    public float total;
    public float Grand_total;

    Car(String Vehicle_id, float Cost[]) {
        this.Vehicle_id = Vehicle_id;
        this.Cost = Cost;
        this.base = Cost[0];
        this.exerciseDuty = Cost[1];
        this.salesTax = Cost[2];
    }

    public void calc_total() {
        total = base + exerciseDuty + salesTax;
        System.out.println("The total price is: " + total);
    }

    public float calc_grand_total() {
        Grand_total = total - ((10f / 100) * total);
        return Grand_total;
    }
}

public class Pgm1 {
    static float highestGrandTotal = 0;
static int index;
    public void highestTotal(float grandTotal) {
        System.out.println("The highest grand total is: " + grandTotal);
    }
    public void DetailsHighestGrandTotal(Car[] cars, int index) {
       
            System.out.println("Details of the car with the highest grand total:");
            System.out.println("Vehicle ID: " + cars[index].Vehicle_id);
            System.out.println("Base Price: " + cars[index].base);
            System.out.println("Exercise Duty: " + cars[index].exerciseDuty);
            System.out.println("Sales Tax: " + cars[index].salesTax);
            System.out.println("Total Price: " + cars[index].total);
            System.out.println("Grand Total: " + cars[index].calc_grand_total());
        }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cars in the showroom:");
        int n = sc.nextInt();
        sc.nextLine();

        Car[] arr = new Car[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of car " + (i + 1));
            System.out.println("Enter Vehicle id:");
            String Vehicle_id = sc.nextLine();
            System.out.println("Base price:");
            float base = sc.nextFloat();
            System.out.println("Exercise duty:");
            float exerciseDuty = sc.nextFloat();
            System.out.println("Sales Tax:");
            float salesTax = sc.nextFloat();
            float[] Cost = { base, exerciseDuty, salesTax };
            arr[i] = new Car(Vehicle_id, Cost);
            sc.nextLine();
        }

        for (int j = 0; j < arr.length; j++) {
            arr[j].calc_total();
            float GT = arr[j].calc_grand_total();
            System.out.println("The grand total is: " + GT);
            if (GT > highestGrandTotal) {
                highestGrandTotal = GT;
                index=j;
            }
        }

        Pgm1 l = new Pgm1();
        l.highestTotal(highestGrandTotal);
        l.DetailsHighestGrandTotal(arr, index);
        sc.close();
    }
}
