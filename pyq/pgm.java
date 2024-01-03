/*A class to represent an employee
class Employee
{
int id, salary;
String name;
// Constructor
public Employee(int id,int salary , String name)
{
this.id = id;
this.salary= salary;
this.name = name;
}
}
Now derive Test class in whose main method 3 different Employee objects each with different Id,different salary,and
different name and store them in a ArrayList object.
Now Derive a class SortByName that implements the Comparator interface .
Now using sort method of Collections arrange the above 3 objects in the ArrayList obj, in
the form of ascending order wrt their names. Provide appropriate implementation in the method of the class SortByName to achieve the same.*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    int id, salary;
    String name;

    public Employee(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
}

class SortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

public class Pgm {
    public static void main(String[] args) {
     
        ArrayList<Employee> employeeList = new ArrayList<>();

       
        Employee emp1 = new Employee(101, 50000, "John");
        Employee emp2 = new Employee(102, 60000, "Alice");
        Employee emp3 = new Employee(103, 45000, "Bob");

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

      
        Collections.sort(employeeList, new SortByName());

        System.out.println("Employees sorted by name:");
        for (Employee emp : employeeList) {
            System.out.println("ID: " + emp.id + ", Salary: " + emp.salary + ", Name: " + emp.name);
        }
    }
}
