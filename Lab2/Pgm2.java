/*2. Write a Java program to simulate a guessing game. The game involves a game object and three
player objects. The game generates a random number between 0 and 9, and the three player objects
try to guess the number.
You must then announce the result about which player/players was/were successful in guessing the
correct number.
Note: There are multiple ways to generate random numbers. One method is
int targetNumber = (int) (Math.random() * 10); This generates one random number in the range
from 0-9. You could of course generate numbers in the range from 0-100 but then the probability of
guessing the right number would drop. */

package Lab2;
import java.util.Random;
import java.util.Scanner;

public class Pgm2{
    String name;
    int n;
    public static int count=0;
    static int targetNumber = (int) (Math.random() * 10); 

Pgm2(String name){
this.name=name;
}


void makeGuess(int n){
if (n==targetNumber){
    count=1;
} 
}
public static void main(String args[]){
    Scanner scanner= new Scanner(System.in);
Pgm2 try1= new Pgm2("Attempt 1");
Pgm2 try2= new Pgm2("Attempt 2");
Pgm2 try3= new Pgm2("Attempt 3");

System.out.println("Enter guess 1: ");
int n= scanner.nextInt();
try1.makeGuess(n);
System.out.println("Enter guess 2: ");
int n1= scanner.nextInt();
try2.makeGuess(n1);
System.out.println("Enter guess 3: ");
int n2= scanner.nextInt();
try3.makeGuess(n2);
System.out.println("The number is: "+targetNumber);
if (count==1){
System.out.println("You have guessed the correct number!");}
else {System.out.println("You have guessed the wrong number...");};
scanner.close();







}
}

