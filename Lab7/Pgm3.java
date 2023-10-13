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
