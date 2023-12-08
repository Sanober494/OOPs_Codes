/*Create a class SavingsAccount. Use a static variable annualInterestrate to store the
interest rate for all account holders. Each object of the class contains a private instance
variable savingsBalance indicating the current amount in the account. Provide method
calculateMonthlyInterest to calculate the monthly interest by multiplying the
savingsBalance by annualInterestRate divided by 12.This interest should be added to
the savingsBalance. Provide a static method modifyInterestRate that sets the annual
interest rate to a new value.
Write a program to test the SavingsAccount class. Instantiate three SavingsAccount
objects. Set annualInterestRate to 4%, calculate the monthly interest for each account
and print the new balance.Now set annualInterestrate to 5% and calculate the next
month’s interest and print the new balance for all three accounts. You can create an
array of three objects.*/

import java.util.*;
class SavingsAccount{
    static double annualIntRate=0.1;
    private double savingsBalance;
public void calcMonthlyInt(){
double monthlyInt= (savingsBalance*annualIntRate)*12;
savingsBalance+=monthlyInt;
} 
public static void modifyIntRate(double newAnnualIntRate){
annualIntRate=newAnnualIntRate;
}
SavingsAccount(double savingsBalance){this.savingsBalance=savingsBalance;}
public double getSavingsBalance() {
        return savingsBalance;
    }
}
public class Pgm2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the balance in account 1:");
        double n1=sc.nextDouble();
        System.out.println("Enter the balance in account 2:");
        double n2=sc.nextDouble();
        System.out.println("Enter the balance in account 3:");
        double n3=sc.nextDouble();
SavingsAccount[] accounts= {new SavingsAccount(n1),new SavingsAccount(n2),new SavingsAccount(n3)};
System.out.println("When the annual Interest Rate is 4%: ");
for (int i=0;i<3;i++){
    accounts[i].modifyIntRate(0.04);
   accounts[i].calcMonthlyInt();
    System.out.println("The savings balance of account" + (i+1) + " is "+accounts[i].getSavingsBalance());
}
System.out.println("When the annual Interest Rate is 5%: ");
for (int i=0;i<3;i++){
    accounts[i].modifyIntRate(0.05);
   accounts[i].calcMonthlyInt();
    System.out.println("The savings balance of account" + (i+1) + " is "+accounts[i].getSavingsBalance());
}

accounts[0].getSavingsBalance();
accounts[1].getSavingsBalance();
accounts[2].getSavingsBalance();
sc.close();
    }
    
}
