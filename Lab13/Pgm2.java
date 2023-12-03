import java.util.*;


class NameException extends Exception {
    public NameException() {
        System.out.println("Name should only contain upper and lower letters.");
    }
}
class AgeException extends Exception {
    public AgeException() {
        System.out.println("Age should be lesser than 35 but greater than zero.");
    }
}

class IdException extends Exception {
    public IdException() {
        System.out.println("Id should be of 6 characters and of a specified format.");
            }
}

class YearException extends Exception {
    public YearException() {
        System.out.println("Year should be any one of the integer values from 1-4.");
    }
}

class Student {

    public String name;
    public int age;
    public int year;
    public String id;

    public Student(String name, int age, int year, String id) throws NameException, AgeException, YearException, IdException{
        this.age=age;
        this.id=id;
        this.name=name;
        this.year=year;
          if (age < 0 || age > 35) {
            throw new AgeException();
        }
          if (year < 1 || year > 4) {
            throw new YearException();
        }
            
         
          for(int i=0;i<name.length();i++)
          {
               char ch;
               ch=name.charAt(i);
               if(ch<'A' || ch>'Z' && ch<'a' || ch>'z'){
                    throw new NameException();
               }}
                      if (id.length()!=6){ throw new IdException();   }


}
}

class Pgm2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        try {
        System.out.println("Enter the name of the student:");
                String n=sc.nextLine();
        System.out.println("Enter the age of the student:");
        int a=sc.nextInt();
        System.out.println("Enter the year:");
        int y=sc.nextInt();
        System.out.println("Enter the ID of the Student:");
        String i=sc.nextLine();
sc.nextLine();
Student st=new Student(n,a,y,i);}
catch(NameException n1) {
    System.out.println(n1);

}
catch(AgeException a1){
    System.out.println(a1);
}
catch(YearException y1){System.out.println(y1);}
catch(IdException i1){System.out.println(i1);}
sc.close();
    }}
