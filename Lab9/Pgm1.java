
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
