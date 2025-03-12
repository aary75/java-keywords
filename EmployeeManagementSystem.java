import java.util.Scanner;

class Employee {
 	private static String companyName = "Tech Corp"; // Static variable
 	private static int totalEmployees = 0; // Static counter
 	private final int id; // Final variable
 	private String name;
 	private String designation;

 	public Employee(int id, String name, String designation) {
     	this.id = id;
     	this.name = name;
     	this.designation = designation;
     	totalEmployees++;
 	}

 	public void displayEmployeeDetails() {
     	if (this instanceof Employee) { // Using instanceof
         	System.out.println("Company: " + companyName);
         	System.out.println("ID: " + id);
         	System.out.println("Name: " + name);
         	System.out.println("Designation: " + designation);
     	}
 	}

 	public static void displayTotalEmployees() {
     	System.out.println("Total Employees: " + totalEmployees);
 	}
 }

 // Main class
 public class EmployeeManagementSystem {
 	public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);

          String space = "true";

          while(space.equals("true")){
             System.out.print("Enter id: ");
             int id = scanner.nextInt();

              scanner.nextLine();
             System.out.print("Enter name: ");
             String name = scanner.nextLine();

             System.out.print("Enter Designation: ");
             String designation = scanner.nextLine();

             // Creating the employee object
             Employee emp1 = new Employee(id, name, designation);

             emp1.displayEmployeeDetails(); // Call the display function
             Employee.displayTotalEmployees();  // Call the function to display total employees

            System.out.print("Do you want to add more employees(true/false): ");
            space = scanner.nextLine();
           }
          // closing the scanner
         scanner.close();
        }

 	}
 
// Input:
// Enter id: 1
// Enter name: Aaryan
// Enter Designation: Engineer

// Output:
// Company: Tech Corp
// ID: 1
// Name: Aaryan
// Designation: Engineer
// Total Employees: 1
// Do you want to add more employees(true/false): false
