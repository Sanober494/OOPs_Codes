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
