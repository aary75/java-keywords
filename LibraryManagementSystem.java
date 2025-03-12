// Creating the LibraryManagementSystem class to manage library
import java.util.Scanner;

class Book {
 	private static String libraryName = "City Library"; // Static variable
 	private final String isbn; // Final variable (cannot be changed)
 	private String title;
 	private String author;

 	// Constructor 
 	public Book(String isbn, String title, String author) {
     	this.isbn = isbn;
     	this.title = title;
     	this.author = author;
 	}

 	public void displayBookDetails() {
     	if (this instanceof Book) { // Using instanceof
         	System.out.println("Library: " + libraryName);
         	System.out.println("ISBN: " + isbn);
         	System.out.println("Title: " + title);
         	System.out.println("Author: " + author);
  	   }
 	}
        
       //Display library name
 	public static void displayLibraryName() {
     	System.out.println("Library Name: " + libraryName);
 	}
 }

 // Main class
 public class LibraryManagementSystem {
 	public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

          String space = "true";

          while(space.equals("true")){
             System.out.print("Enter isbn: ");
             String isbn = scanner.nextLine();

          
             System.out.print("Enter title: ");
             String title = scanner.nextLine();

             System.out.print("Enter author: ");
             String author = scanner.nextLine();

             // Creating the book object
             Book book1 = new Book(isbn, title, author);
     
             book1.displayBookDetails(); // Call the display function
             Book.displayLibraryName();  // Call the function to display library name

            System.out.print("Do you want to add more books(true/false): ");
            space = scanner.nextLine();
           }
          // closing the scanner
         scanner.close();
 	}
 }

// Input:
// Enter isbn: 343323
// Enter title: NCERT History
// Enter author: NCERT
// Library: City Library

// Output:
// ISBN: 343323
// Title: NCERT History
// Author: NCERT
// Library Name: City Library
// Do you want to add more books(true/false): true

// Input:
// Enter isbn: 42422
// Enter title: NCERT History
// Enter author: NCERT
// Library: City Library

// Output:
// ISBN: 42422
// Title: NCERT History
// Author: NCERT
// Library Name: City Library
// Do you want to add more books(true/false): false
