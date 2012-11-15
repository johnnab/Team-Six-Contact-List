/**
* @author Tony Tran
* @author Johnna Cornnet
* @author Arash Aria
* @author Rina Srivastava
*
* This class tests the program by calling upon methods.
* Creating an entry.
* Printing the contact list.
* Searching for an entry by last name.
* Searching for an entry by e-mail name.
* Searching for an entry by zip name.
* Deleting an entry.
*/
import java.util.Scanner;
public class Main {
public static void main(String args[]) {

Scanner input = new Scanner(System.in);
int mainMenuChoice;
//ContactInfo[] myList = new ContactInfo[100];

//Prompts user to make a choice in the console menu.
System.out.println("Hello, and welcome to Team 6's contact list.");
System.out.println("What would you like to do?");
System.out
.println("Please enter the corresponding number of choice:\n");
System.out.println("1: Search the contact list.");
System.out.println("2: Print the entire contact list.");
System.out.println("3: Search for a contact.");
System.out.println("4: Delete a contact.");
System.out.println("5: Exit the program.");
System.out.print("\nPlease enter a number from 1-5.\n");

//Loops if choice is invalid. Otherwise, make selection and call on methods that do things to ContactList.
do {
mainMenuChoice = input.nextInt();
if (mainMenuChoice == 1) {
System.out.println("Searching...");
} else if (mainMenuChoice == 2) {
System.out.println("Printing list...");
} else if (mainMenuChoice == 3) {
System.out.println("Search by...");
System.out.println("1: Last name.");
System.out.println("2: E-mail.");
System.out.println("3: Zip code.");
System.out.println("4: Exit.");

int subMenuChoice = input.nextInt();

if (subMenuChoice == 1) {
System.out.println("Enter last name:");
} else if (subMenuChoice == 2) {
System.out.println("Enter e-mail:");
} else if (subMenuChoice == 3) {
System.out.println("Enter zip code:");
} else if (subMenuChoice == 4) {
System.out.println("Exiting.");
}

} else if (mainMenuChoice == 4) {
System.out.println("Delete who?");
} else if (mainMenuChoice == 5) {
System.out.println("Goodbye.");
} else {
System.out.println("Please enter a valid choice.");
}
} while (!(mainMenuChoice == 1 || mainMenuChoice == 2
|| mainMenuChoice == 3 || mainMenuChoice == 4 || mainMenuChoice == 5));

System.out.println("Exited loop. Reached end of code. Exiting program.");

}
}
//test