/*
Write a program in Java by considering following scenario and also draw the inheritance hierarchy 
for it and identify type of inheritance. Consider a interface read and work which consist 
of methods of reading() and working(). The Employee class consist of first_name, last_name, and age
as an instance variable. Methods reading() and working() are implemented inside class Employee. 
The method reading() print “Employee is reading Design document of software.” and working() method 
print “Employee is working on development of software.”. The HourlyDeveloper is a class derived from 
Employee class, which consist of per_hour_salary as an final variable with value 2000 and hours_worked 
as an instance variable, and computeSalary() is an method which returns salary according to the number
of hours worked. Create a tester class Employee_Tester, which create the object of HourlyDeveloper 
and assign following values to respective variable,
• hours_worked = 10
• first_name = “XYZ”
• last_name = “ABC”
• age = 35
The tester class also call the method computeSalary() to print developer salary.*/

interface Work {
    void working();
}

interface Read {
    void reading();
}


class Employee implements Work, Read {
    String first_name;
    String last_name;
    int age;

    // Constructor
    public Employee(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

 
    public void working() {
        System.out.println("Employee is working on development of software.");
    }


    public void reading() {
        System.out.println("Employee is reading Design document of software.");
    }
}
class HourlyDeveloper extends Employee {
    final int per_hour_salary = 2000;
    int hours_worked;

    public HourlyDeveloper(String first_name, String last_name, int age, int hours_worked) {
        super(first_name, last_name, age);
        this.hours_worked = hours_worked;
    }


    public int computeSalary() {
        return per_hour_salary * hours_worked;
    }
}

public class Interface {
    public static void main(String[] args) {
   
        HourlyDeveloper developer = new HourlyDeveloper("XYZ", "ABC", 35, 10);
        developer.reading();
        developer.working();

   
        int salary = developer.computeSalary();
        System.out.println("Developer's Salary: $" + salary);
    }
}
