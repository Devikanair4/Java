import java.util.Scanner;

public class ScannerExample {
    // Declaring a static variable 
    static int userInput;

public static void main(String[] args) {
// Creating a Scanner object
    Scanner scanner = new Scanner(System.in);
        
        // Displaying the menu of options to the user 
        do {
            System.out.println("Enter Option: \n Add - 1\n Subtract - 2\n Multiply - 3\n Even / Odd Number - 4\n Quit - 5");
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    // If the user chooses option 1, addition will be performed
                    System.out.println("Enter two numbers to be added: \n");
                    double firstNumber = Double.parseDouble(scanner.next());
                    double secondNumber = Double.parseDouble(scanner.next());
                    System.out.println("The result is " + (firstNumber + secondNumber));
                    break;
                case 2:
                    // If the user chooses option 2, subtraction will be performed
                    System.out.println("Enter two numbers to be subtracted: \n");
                    firstNumber = Double.parseDouble(scanner.next());
                    secondNumber = Double.parseDouble(scanner.next());
                    System.out.println("The result is " + (firstNumber - secondNumber));
                    break;
                case 3:
                    // If the user chooses option 3, multiplication will be performed
                    System.out.println("Enter two numbers to be multiplied: \n");
                    firstNumber = Double.parseDouble(scanner.next());
                    secondNumber = Double.parseDouble(scanner.next());
                    System.out.println("The result is " + (firstNumber * secondNumber));
                    break;
                case 4:
                    // If the user chooses option 4, odd or even will be performed
                    System.out.println("Enter a number: \n");
                    double number = Double.parseDouble(scanner.next());
                    if (number % 2 == 0) {
                        System.out.println("The result is even.");
                    } else {
                        System.out.println("The result is odd.");
                    }
                    break;
                case 5:
                    // If the user chooses option 5, quit the program
                    System.out.println("-The End-");
                    break;
                default:
                    // If the user enters an invalid option, throw an exception with an error message
                    throw new IllegalArgumentException("Invalid Input: " + userInput);
            }
        } while (userInput != 5); // Continue looping until the user chooses to quit
    }
}