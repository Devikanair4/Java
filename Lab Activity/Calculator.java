//write a program to design a calculator using switch case.

import java.util.Scanner;
public class Calculator {
	public void calc (int a, int b, String operation) {
		switch (operation) {
			case "Add":
				System.out.println(a+ "+" +b +"="+ +(a+b));
				break;
				
			case "Subtract":
				System.out.println(a+ "-" +b +"="+ +(a-b));
				break;
				
			case "Multiply":	
				System.out.println(a+ "x" +b +"="+ +(a*b));
				break;
				
			case "Divide":
				System.out.println(a+ "/" +b +"="+ +(a/b));
				break;
				
			default:
				System.out.println("Please enter a valid operation!");
			
		}
		
	}
	
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform from the following: \n 1-Add \n 2-Subtract \n 3-Multiply \n 4-Divide");
		String operation = sc.next();
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
        Calculator obj = new Calculator();
		obj.calc(a,b,operation);
    }

	
}