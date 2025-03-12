//Creating the VehicleRegistrationSystem to display the details of vehicle
import java.util.Scanner;

class Vehicle {

 	// Fields (Attributes)
 	private String ownerName;
 	private String vehicleType;
        private final String registrationNumber; // Variable declared as final
        private static int registrationFee = 1000; // Static variable common for all methods

        // Constructor
 	public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
     	this.registrationNumber = registrationNumber;
     	this.ownerName = ownerName;
     	this.vehicleType = vehicleType;
 	}



        // Displaying the details of vehicle
 	public void displayVehicleDetails() {
     	if (this instanceof Vehicle) { // Using instanceof
         	System.out.println("Registration Number: " + registrationNumber);
         	System.out.println("Owner Name: " + ownerName);
         	System.out.println("Vehicle Type: " + vehicleType);
         	System.out.println("Registration Fee: Rs." + registrationFee);
     	}
 	}
 }

 // Main class
 public class VehicleRegistrationSystem {
 	public static void main(String[] args) {
            
           Scanner scanner = new Scanner(System.in);

          String space = "true";

          while(space.equals("true")){
             System.out.print("Enter registration Number: ");
             String registrationNumber = scanner.nextLine();
 
             System.out.print("Enter owner name: ");
             String ownerName = scanner.nextLine();

             System.out.print("Enter type of vehicle: ");
             String vehicleType = scanner.nextLine();

            // Creating the object
     	    Vehicle vehicle1 = new Vehicle(registrationNumber, ownerName, vehicleType);
     
        
     	    vehicle1.displayVehicleDetails();
 

           System.out.print("Do you want to add more vehicle:(true/false): ");
           space = scanner.nextLine();
 	}

          // closing the scanner
          scanner.close();
 
 	}
 }

// Input:
// Enter registration Number: Z34T42
// Enter owner name: Dharam
// Enter type of vehicle: Car

// Output:
// Registration Number: Z34T42
// Owner Name: Dharam
// Vehicle Type: Car
// Registration Fee: Rs.1000
// Do you want to add more vehicle:(true/false): true

// Input:
// Enter registration Number: C432dR
// Enter owner name: Shatru
// Enter type of vehicle: Truck

// Output:
// Registration Number: C432dR
// Owner Name: Shatru
// Vehicle Type: Truck
// Registration Fee: Rs.1000
// Do you want to add more vehicle:(true/false): false

