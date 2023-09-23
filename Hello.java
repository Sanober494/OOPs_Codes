import java.util.Scanner;

class Employee {
    private String id;
    private String name;
    private int dept;
    private float basic;
    private float allowance;
    private float totalSalary;

    public Employee() {
    
    }

    public Employee(String id, String name, int dept, float basic) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.basic = basic;
        calculateSalary();
    }

    public void calculateSalary() {
        float hra = 0;
        switch (dept) {
            case 1:
                allowance = 1500;
                hra = 0.4f * basic;
                break;
            case 2:
                allowance = 2500;
                hra = 0.4f * basic;
                break;
            case 3:
                allowance = 3500;
                hra = 0.4f * basic;
                break;
            default:
                System.out.println("Invalid department code.");
        }

        totalSalary = basic + hra + allowance;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Basic Salary: " + basic);
        System.out.println("Allowance: " + allowance);
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create three Employee objects using user input
        Employee[] employees = new Employee[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department (1 for staff, 2 for accounts, 3 for admin): ");
            int dept = scanner.nextInt();
            System.out.print("Basic Salary: ");
            float basic = scanner.nextFloat();
            scanner.nextLine(); 

            employees[i] = new Employee(id, name, dept, basic);
        }

        // Display details of all Employee objects
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }

        scanner.close();
    }
}
