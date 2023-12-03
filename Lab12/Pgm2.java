

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
