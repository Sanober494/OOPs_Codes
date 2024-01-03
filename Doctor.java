/*Doctors are working in a clinic by name Aster which is located in the street 18,Main street ,in the city Dubai, that belongs to the country UAE .
Further each Doctor has his own Name which is a string. Represent all the above information in a class by name Doctor.All data types are string.
Illustrate the usage of copy constructor in the above example to create 2 Doctor objects corresponding to Names Arun and Varun.*/

public class Doctor {
    private String name;
    private String clinicName;
    private String street;
    private String city;
    private String country;

    // Constructor
    public Doctor(String name, String clinicName, String street, String city, String country) {
        this.name = name;
        this.clinicName = clinicName;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    // Copy Constructor
    public Doctor(Doctor otherDoctor) {
        this.name = otherDoctor.name;
        this.clinicName = otherDoctor.clinicName;
        this.street = otherDoctor.street;
        this.city = otherDoctor.city;
        this.country = otherDoctor.country;
    }

    // Getter methods (you can add setters if needed)
    public String getName() {
        return name;
    }

    public String getClinicName() {
        return clinicName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a Doctor object using the constructor
        Doctor doctor1 = new Doctor("Arun", "Aster Clinic", "Street 18, Main Street", "Dubai", "UAE");

        // Creating a Doctor object using the copy constructor
        Doctor doctor2 = new Doctor(doctor1);

        // Displaying information for both doctors
        System.out.println("Doctor 1 Information:");
        displayDoctorInfo(doctor1);

        System.out.println("\nDoctor 2 Information (copied from Doctor 1):");
        displayDoctorInfo(doctor2);
    }

    // Display method for showing Doctor information
    private static void displayDoctorInfo(Doctor doctor) {
        System.out.println("Name: " + doctor.getName());
        System.out.println("Clinic Name: " + doctor.getClinicName());
        System.out.println("Street: " + doctor.getStreet());
        System.out.println("City: " + doctor.getCity());
        System.out.println("Country: " + doctor.getCountry());
    }
}
