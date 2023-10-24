package Lab8;
import java.util.LinkedList;
import java.util.Scanner;

class Book {
    private long ISBN_no;
    private String name;
    private int edition;
    private String author;
    private String publisher;
    private int status;

    // Constructor
    public Book(long ISBN_no, String name, int edition, String author, String publisher, int status) {
        this.ISBN_no = ISBN_no;
        this.name = name;
        this.edition = edition;
        this.author = author;
        this.publisher = publisher;
        this.status = status;
    }

    // Public methods
    public void check_Status() {
        System.out.println("Status of the book '" + name + "': " + getStatusString());
    }

    public void change_Status(int newStatus) {
        this.status = newStatus;
        System.out.println("Status of the book '" + name + "' changed to: " + getStatusString());
    }

    public void display() {
        System.out.println("Book Details:");
        System.out.println("ISBN: " + ISBN_no);
        System.out.println("Name: " + name);
        System.out.println("Edition: " + edition);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Status: " + getStatusString());
        System.out.println("----------------------");
    }

    private String getStatusString() {
        switch (status) {
            case 0:
                return "Available";
            case 1:
                return "Issued";
            case 2:
                return "Reserved";
            default:
                return "Unknown";
        }
    }

    public String getName() {
        return name;
    }
}

public class Pgm2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
 
        Book book1 = createBook();
        Book book2 = createBook();

    
        book1.display();
        book2.display();

       
        LinkedList<Book> bookList = new LinkedList<>();
        bookList.addFirst(createBook()); 
        bookList.addLast(createBook());  
       
        System.out.print("Do you want to change or check the status of a book? (yes/no): ");
        String userInput = scanner.next();

        if (userInput.equalsIgnoreCase("yes")) {
            System.out.print("Enter the name of the book: ");
            String bookName = scanner.next();

           
            for (Book book : bookList) {
                if (book.getName().equalsIgnoreCase(bookName)) {
                 
                    System.out.print("Do you want to change or check the status? (change/check): ");
                    String action = scanner.next();

                    if (action.equalsIgnoreCase("change")) {
                       
                        System.out.print("Enter the new status (0 for Available, 1 for Issued, 2 for Reserved): ");
                        int newStatus = scanner.nextInt();
                        book.change_Status(newStatus);
                    } else if (action.equalsIgnoreCase("check")) {
                     
                        book.check_Status();
                    } else {
                        System.out.println("Invalid action. Please enter 'change' or 'check'.");
                    }

                    break;
                }
            }
        }

      
       
    }

    private static Book createBook() {
        System.out.println("Enter Book Details:");
        System.out.print("ISBN: ");
        long ISBN_no = scanner.nextLong();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Edition: ");
        int edition = scanner.nextInt();
        System.out.print("Author: ");
        String author = scanner.next();
        System.out.print("Publisher: ");
        String publisher = scanner.next();
        System.out.print("Status (0 for Available, 1 for Issued, 2 for Reserved): ");
        int status = scanner.nextInt();

        return new Book(ISBN_no, name, edition, author, publisher, status);
    }
}
