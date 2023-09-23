/*WAJP which allows you to read 5 integer numbers and then counts the number of positive,
           negative and zeroes input.
 */
import java.util.Scanner;
public class Pgm4 {
    public static int countZero=0;

    public static int countOdd=0;
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int countEven=0;
        for (int i=0; i<5;i++){
System.out.println("Enter number "+ (i+1)+":");
int num= scanner.nextInt();
if (num==0 ){
    countZero++;
}
else if(num%2==0){
countEven++;

}
else{
    countOdd++;
}
        }
System.out.println("The number of zero(s) is/are: "+countZero);
System.out.println("The number of even digit(s) is/are: "+countEven);
System.out.println("The number of odd digit(s) is/are: "+countOdd);
scanner.close();
    }
}
