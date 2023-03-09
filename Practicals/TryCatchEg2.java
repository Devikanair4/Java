import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatchEg2 {
	public static void main(String args[]) {
		try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the first input: ");
				int x = sc.nextInt();
				System.out.println("Enter the second input: ");
				int y = sc.nextInt();
				int result = x / y;
				System.out.println("Result is: " + result);
			} catch (ArithmeticException e) {
				System.out.println("You cannot divide by zero.");
			} catch (InputMismatchException e) {
				System.out.println("Please enter valid input.");
			}
	}
}
			
		
	