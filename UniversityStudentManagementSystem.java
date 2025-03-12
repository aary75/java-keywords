// Creating the UniversityStudentManagemtSystem to manage the recod of university student
import java.util.Scanner;

class Student {

        // Fileds(Attributes)
        private final int rollNumber; // Final vairbale
 	private static String universityName = "Chitkara University"; // Static variable
 	private String name;
 	private String grade;

 	public Student(int rollNumber, String name, String grade) {
     	this.rollNumber = rollNumber;
     	this.name = name;
     	this.grade = grade;
 	}

        // Displaying the details of student
 	public void displayStudentDetails() {
     	if (this instanceof Student) { // Using instanceof
         	System.out.println("Roll number: " + rollNumber);
         	System.out.println("Name: " + name);
         	System.out.println("University: " + universityName);
         	System.out.println("Grade: " + grade);
     	}
 	}
 }

 // Main class
 public class UniversityStudentManagementSystem {
 	public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             String space = "true";

          while(space.equals("true")){
             System.out.print("Enter roll number: ");
             int rollNumber = scanner.nextInt();
 
              scanner.nextLine();
             System.out.print("Enter student's name: ");
             String name = scanner.nextLine();

             System.out.print("Enter grade: ");
             String grade = scanner.nextLine();

             // Creating the object
       	     Student student1 = new Student(rollNumber, name, grade);
     
     	     student1.displayStudentDetails();
 

           System.out.print("Do you want to add more students:(true/false): ");
           space = scanner.nextLine();
 	}
          // closing the scanner
          scanner.close();

 	}
 }

// Input:
// Enter roll number: 1
// Enter student's name: Aaryan
// Enter grade: 3.4

// Output:
// Roll number: 1
// Name: Aaryan
// University: Chitkara University
// Grade: 3.4
// Do you want to add more students:(true/false): true

// Input:
// Enter roll number: 1
// Enter student's name: Hitesh
// Enter grade: 3.8
// Roll number: 1
// Output:
// Name: Hitesh
// University: Chitkara University
// Grade: 3.8
// Do you want to add more students:(true/false): false
