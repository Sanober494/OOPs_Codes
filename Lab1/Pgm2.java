
/*2.	WAJP which inputs one number which consists of 5 digits. Now display the number with each digit individually with spaces between the digits. E.g. 23789 is represented as 
2   3   7   8   9
 */
import java.lang.Math;
import java.util.Scanner;

public class Pgm2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 5 digit number: ");
        int num = scanner.nextInt();
        for (int i = 4; i >= 0; i--) {
            int newNum = (int) (num / (Math.pow(10, i)));
            num = (int) (num % (Math.pow(10, i)));
            System.out.print(newNum + " ");
            scanner.close();
        }
    }
}
