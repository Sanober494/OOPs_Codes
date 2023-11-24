package Lab10;

class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name: " + name + ", " + "address: " + address + "]";
    }

}

class Student extends Person {

    public Student(String name, String address, int year, double fee, String program) {

        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    private String program;
    private int year;
    private double fee;

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString() {
        return "Student[Person[name: " + super.getName() + ", " + "address: " + super.getAddress() + "program:"
                + program + " fee:" + fee + " Year: " + year;
    }

}

class Staff extends Person {

    public Staff(String name, String address, double pay, String school) {

        super(name, address);
        this.pay = pay;
        this.school = school;

    }

    private String school;

    private double pay;

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String toString() {
        return "Staff[Person[name: " + super.getName() + ", " + "address: " + super.getAddress() + "school:" + school
                + " pay:" + pay + "]";
    }

}

public class Pgm1 {
    public static void main(String args[]) {
        Student student = new Student("Sanober", "123 Main St", 2022, 1000.0, "Computer Science");
        System.out.println(student.toString());
        Staff staff = new Staff("Jungkook", "321 Main St", 5000.0, "BITS Pilani");
        System.out.println(staff.toString());

    }
}
