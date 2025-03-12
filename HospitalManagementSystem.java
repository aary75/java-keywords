// Patient class representing hospital patients
import java.util.Scanner;

 class Patient {
 	
        //Fields (Attributes)
 	private final int patientID; // Final variable (Unique ID for each patient)
 	private String ailment;
 	private int age;
 	private String name;
        private static String hospitalName = "Bansal Life Care"; // Variable declared as static to shared all among entities
        private static int totalPatients = 0; // static counter

 	// Constructor using 'this' to resolve ambiguity
 	public Patient(int patientID, String name, int age, String ailment) {
     	   this.patientID = patientID;
     	   this.ailment = ailment;
     	   this.name = name;
     	   this.age = age;
     	   totalPatients++; // Increase patient count
 	}

 	// Display patient details
 	public void displayPatientDetails() {
     	if (this instanceof Patient) { // Using instanceof
         	System.out.println("Patient ID: " + patientID);
         	System.out.println("Name: " + name);
         	System.out.println("Age: " + age);
         	System.out.println("Ailment: " + ailment);
                System.out.println("Hospital Name: " + hospitalName);
     	}
 	}

 	// Display total number of patients
 	public static void getTotalPatients() {
     	System.out.println("Total Patients Admitted: " + totalPatients);
 	}
 }

 // Main class 
 public class HospitalManagementSystem {
 	public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);

          String space = "true";

          while(space.equals("true")){
             System.out.print("Enter patint ID: ");
             int patientId = scanner.nextInt();
 
              scanner.nextLine();
             System.out.print("Enter patient name: ");
             String name = scanner.nextLine();

             System.out.print("Enter age: ");
             int age = scanner.nextInt();

             scanner.nextLine();
             System.out.print("Enter patient's ailment: ");
             String ailment = scanner.nextLine();

             // Creating the patient object
             Patient patient1 = new Patient(patientId, name, age, ailment);
     
             // Displaying the detials of patient
     	     patient1.displayPatientDetails();
 

              System.out.println();

             // Display the total number of patients admit
             Patient.getTotalPatients();

             System.out.print("Do you want to add more patients:(true/false): ");
             space = scanner.nextLine();
 	}

           // closing the scanner
           scanner.close();

 	}
 }

// Input:
// Enter patint ID: 1
// Enter patient name: Aaryan
// Enter age: 23
// Enter patient's ailment: Fever

// Output:
// Patient ID: 1
// Name: Aaryan
// Age: 23
// Ailment: Fever
// Hospital Name: Bansal Life Care

// Total Patients Admitted: 1
// Do you want to add more patients:(true/false): true

// Input:
// Enter patint ID: 2
// Enter patient name: Hitesh
// Enter age: 24
// Enter patient's ailment: Cold

// Output:
// Patient ID: 2
// Name: Hitesh
// Age: 24
// Ailment: Cold
// Hospital Name: Bansal Life Care

// Total Patients Admitted: 2
// Do you want to add more patients:(true/false): false
