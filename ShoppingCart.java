// Creating the shoppintCart Class to manage a shoppint cart
import java.util.Scanner;

class Product {
 	// Fields(Attributes)
 	private final int productID; // Final variable
 	private String productName;
 	private double price;  
 	private int quantity;
        private static double discount = 15.0; // static variable
 	
        //Consturctor
        public Product(int productID, String productName, double price, int quantity) {
     	this.productID = productID;
     	this.productName = productName;
     	this.price = price;
     	this.quantity = quantity;
 	}

        // Display the details
 	public void displayProductDetails() {
     	if (this instanceof Product) { // Using instanceof
         	System.out.println("Product ID: " + productID);
         	System.out.println("Name: " + productName);
         	System.out.println("Price: $" + price);
         	System.out.println("Quantity: " + quantity);
         	System.out.println("Discount: " + discount + "%");
     	}
 	}

        // Update discount
 	public static double updateDiscount(double newDiscount) {
     	discount = discount + newDiscount;

            return discount;
 	}
 }

 // Main class
 public class ShoppingCart {
 	public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in); // scanner class to get user's input

          String space = "true";

          while(space.equals("true")){
             System.out.print("Enter Product ID: ");
             int productID = scanner.nextInt();
 
              scanner.nextLine();
             System.out.print("Enter product name: ");
             String productName = scanner.nextLine();

             System.out.print("Enter price: ");
             int price = scanner.nextInt();
             
             System.out.print("Enter quantity: ");
             int quantity = scanner.nextInt();

              // Creating the object
     	      Product prod1 = new Product(productID, productName, price, quantity);
     
     	      prod1.displayProductDetails();
 
              System.out.print("Enter Discount: ");
     	      double discount = scanner.nextInt();
         
              // Updatingh the discount
              discount = Product.updateDiscount(discount);

              System.out.println("Get a new Discount: " + discount + "%");   
               scanner.nextLine();

              System.out.print("Do you want to add more products(true/false): ");
              space = scanner.nextLine();
 	}
      // closing the scanner
      scanner.close();
     	
     	
 	}
 }

// Input:
// Enter Product ID: 1
// Enter product name: Soap
// Enter price: 20
// Enter quantity: 1

// Output:
// Product ID: 1
// Name: Soap
// Price: $20.0
// Quantity: 1
// Discount: 15.0%
// Enter Discount: 20
// Get a new Discount: 35.0%
// Do you want to add more products(true/false): true

// Input:
// Enter Product ID: 2
// Enter product name: Oil
// Enter price: 10
// Enter quantity: 2
// Product ID: 2

// Output:
// Name: Oil
// Price: $10.0
// Quantity: 2
// Discount: 35.0%
// Enter Discount: 0
// Get a new Discount: 35.0%
// Do you want to add more products(true/false): false
