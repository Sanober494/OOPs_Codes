import java.util.Scanner;

public class Pgm3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();

 
        scanner.close();

  
        identifyPhoneNumber(phoneNumber);
    }

    public static void identifyPhoneNumber(String phoneNumber) {

        String countryCode = phoneNumber.substring(0, 5);

    
        String areaCode;
        if (phoneNumber.charAt(5) == '0') {
            areaCode = phoneNumber.substring(6, 8);
        } else {
            areaCode = phoneNumber.substring(5, 8);
        }


        String phoneType;
        if (phoneNumber.charAt(8) == '5' || phoneNumber.charAt(8) == '6' || phoneNumber.charAt(8) == '7' || phoneNumber.charAt(8) == '8' || phoneNumber.charAt(8) == '9') {
            phoneType = "mobile";
        } else {
            phoneType = "landline";
        }

        System.out.println("Country Code: " + countryCode);
        System.out.println("Area Code: " + areaCode);
        System.out.println("Phone Type: " + phoneType);
    }
}
