/*Define a class Book which contains private members name (type String), cost (type double). This class
implements the comparable interface as shown below.
class Book implements Comparable<Book> {
private String name,
private double cost;
// fill in the constructor.
// fill in the implementation to compare by name
// Any other methods required..
} // of class Book
Define another class GeneralizedSearch, having a method search(), as shown below.
class GeneralizedSearch {
public static boolean search (Object[] arr, Object item) {
// provide the implementation to return true or false,
// depending on whether the item is present in arr or not.
}
}
Define a class containing the main method, which creates an array of objects of class Book and uses the class
GeneralizedSearch to search of a specific book (by name). Finally display the book details if present.
Also implement the Comparator interface and sort the books on descending order of price and display.*/

import java.util.*;
import java.io.*;


class Book implements Comparable<Book>{
private String name;
private double cost;
Book(String name,double cost){
    this.name=name;
    this.cost=cost;
}
 public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
  public int compareTo(Book b2) {
        return this.name.compareTo(b2.name);
    }


}

class GeneralizedSearch{
    public static boolean search(Object arr[], Object item){
        for (Object obj : arr) {
            if (obj.equals(item)) {
                return true;
            }
        }
        return false;
    }
} 

class BookComparator implements Comparator<Book> {
    
    public int compare(Book book1, Book book2) {
        if (book1.getCost()==book2.getCost()) return 0;
        else if (book1.getCost()>book2.getCost()) return 1;
        else return -1;
    }
}

public class Pgm2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
  Book[] book = {
                new Book("Book3", 123.23),
                new Book("Book1", 432.43),
                new Book("Book2", 532.234)
        };

for (Book bk: book){
System.out.println(bk.getName()+ " "+ bk.getCost());

}
Book item=new Book("Book4",10.5);


boolean isBookPresent = GeneralizedSearch.search(book, item);

if (isBookPresent) {
    System.out.println("Book found: " + item.getName());
} else {
    System.out.println("Book not found: " + item.getName());
}

Arrays.sort(book, new BookComparator());
sc.close();
    }
}


// Method 2:

import java.util.*;

class Book implements Comparable<Book> {
    private String name;
    private double cost;

    Book(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int compareTo(Book bk) {

        return this.name.compareTo(bk.name);
    }
}

class GeneralizedSearch {
    public static boolean search(Book[] arr, Book item) {

        for (Book b1 : arr) {
            if (b1.getName().equals(item)) {
                return true;
            }
        }
        return false;

    }
}

class A implements Comparator<Book> {

    public int compare(Book b1, Book b2) {
        if ((b1.getCost()) > (b2.getCost())) {
            return 1;
        }

        else if (b1.getCost() == b2.getCost()) {
            return 0;
        } else {
            return -1;
        }
    }
}

class pgm {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book("Kelly", 200.09);
        Book b2 = new Book("Key", 200.33);
        Book b3 = new Book("Kell", 200.24);
        Book[] arr = { b1, b2, b3 };
        System.out.println("Enter bk name:");
        String newBook = sc.nextLine();
        for (Book B : arr) {
            if (B.getName().equals(newBook)) {
                System.out.println("Book found!");
                System.out.println(B.getName());
                System.out.println(B.getCost());
                break;
            } else {
                System.out.println("Book not found!");
            }
        }
        Arrays.sort(arr, new A());
        sc.close();

    }
}
