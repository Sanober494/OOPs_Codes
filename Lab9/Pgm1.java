/*Write a JAVA Program to construct the BITS student id (as a single String) from the
following details read from the user. Also print the bits email id of the student.
i) Year,
ii) Discipline (CHEM - A1, EEE-A3, MECH-A4, CS-A7 )
iii) Assume only PS/TS
iv) Campus (Pilani P. Hyderabad H, Goa G, Dubai U).
v) The 3 digit no can a non-zero random no. generated using the class Random
Input: Year = 2014 Discipline = CS PS/TS = PS Campus = Dubai ( can be 1 of Pilani,
Hyderabad, Goa, or Dubai)
Output: 2014A7PS001U f2014001@dubai.bits-pilani.ac.in
Input: Year = 2014 Discipline = MECH PS/TS = TS Campus = Pilani ( can be 1 of Pilani,
Hyderabad, Goa, or Dubai)
Output: 2014AAPS001P f2014001@pilani.bits-pilani.ac.in*/
import java.util.*;

public class Pgm1 {
   
    public static void main(String args[]){
        String Campus;
        Random rand = new Random();
        int rand_int = rand.nextInt(1000);
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter year:");
        String year=sc.nextLine();
        System.out.println("Enter discipline (CHEM - A1, EEE-A3, MECH-A4, CS-A7 ):");
        String discipline=sc.nextLine();
        System.out.println("Enter PS or TS:");
        String school=sc.nextLine();
        System.out.println("Enter the campus  (Pilani P. Hyderabad H, Goa G, Dubai U):");        
        String campus=sc.nextLine();
        if (campus=="U"){
            Campus="dubai";
                }
        else if(campus=="G"){Campus="goa";}
         else if(campus=="P"){Campus="pilani";}
         else{Campus="hyderabad";}
        
        if ((rand_int<100)&& (rand_int>10))
        {
            System.out.println("The id of the student is: "+year+discipline+school+"0"+rand_int+campus);
        System.out.println("The email address is: f"+year+"0"+rand_int+"@"+Campus+".bits-pilani.ac.in");
        }
        if (rand_int<10){
       System.out.println("The id of the student is: "+year+discipline+school+"00"+rand_int+campus);
        System.out.println("The email address is: f"+year+"00"+rand_int+"@"+Campus+".bits-pilani.ac.in");}

sc.close();
    }
    
}
