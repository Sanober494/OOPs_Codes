/*Write a Java program which prints a table of a number. E.g. printTable(5) you need to
print. Read the number n from the user.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
4 8 12 16 20 24 28 32 36 40
5 10 15 20 25 30 35 40 45 50*/
import java.util.Scanner;
public class Pgm3 {
    public static int printTable(int num){
        for (int i=1;i<(num+1);i++){
            for (int j=1;j<11;j++){
            System.out.print(i*j);
            System.out.print("\t");
            }
            System.out.println();
        }
return num;
    }
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    System.out.println("The table is:");
printTable(n);
    }
    

}
