// Creating the BankAccountSystem class to manage the account
import java.util.Scanner;

class BankAccount {
 	private static String bankName = "Central Bank"; // Static variable shared across all accounts
 	private static int totalAccounts = 0; // Static counter for total accounts
 	private final int accountNumber; // Final variable that cannot be changed
 	private String accountHolderName;
 	private double balance;
  
 	// Constructor
 	public BankAccount(int accountNumber, String accountHolderName, double balance) {
     	this.accountNumber = accountNumber;
     	this.accountHolderName = accountHolderName;
   	  this.balance = balance;
     	totalAccounts++; // Increment total accounts
 	}

 	public void displayAccountDetails() {
     	if (this instanceof BankAccount) { // Using instanceof
         	System.out.println("Bank Name: " + bankName);
         	System.out.println("Account Number: " + accountNumber);
         	System.out.println("Account Holder: " + accountHolderName);
         	System.out.println("Balance: $" + balance);
     	}
 	}

 	public static void getTotalAccounts() {
     	System.out.println("Total Bank Accounts: " + totalAccounts);
 	}
 }

 // Main class to test the BankAccount class
 public class BankAccountSystem {
 	public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          String space = "true";

          while(space.equals("true")){
             System.out.print("Enter account Number: ");
             int accountNumber = scanner.nextInt();
 
              scanner.nextLine();
             System.out.print("Enter account holder name: ");
             String accountHolder = scanner.nextLine();

             System.out.print("Enter balance: ");
             int balance = scanner.nextInt();

        // Creating the object
     	BankAccount acc1 = new BankAccount(accountNumber, accountHolder, balance);
     
        scanner.nextLine();
     	acc1.displayAccountDetails();
 
     	BankAccount.getTotalAccounts();

           System.out.print("Do you want to add more account:(true/false): ");
           space = scanner.nextLine();
 	}
      // closing the scanner
      scanner.close();
  }

 }

// Input:
// Enter account Number: 101
// Enter account holder name: Aaryan
// Enter balance: 20000
// Bank Name: Central Bank

// Output:
// Account Number: 101
// Account Holder: Aaryan
// Balance: $20000.0
// Total Bank Accounts: 1
// Do you want to add more account:(true/false): true
// Input:
// Enter account Number: 102
// Enter account holder name: Harman
// Enter balance: 30000

// Output:
// Bank Name: Central Bank
// Account Number: 102
// Account Holder: Harman
// Balance: $30000.0
// Total Bank Accounts: 2
// Do you want to add more account:(true/false): false
