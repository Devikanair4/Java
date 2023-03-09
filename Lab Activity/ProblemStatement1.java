package Testing;

public class ProblemStatement1 {
		private static String myString; //declaring a static variable

		public static void main(String[] args) {
			createString("Welcome to Java World"); //using createString to create a string
			return5th(myString); //returning the 5th character
			compareString(myString); //comparing the string
			concatenateString("- Let us learn"); //concatenating
			firstOccOfa(myString); //calling the first occurrence of character
			replaceWithE(myString); //replacing all occurrence of A with E
			returnBW4thAnd10th(myString); //returning strings between 4th and 10th position
			returnLower(myString); // returning all lower case
		}
		
		private static void createString(String string) {  
			myString = new String(string);
			System.out.println("Value of variable myString: " + myString);
		}

		private static void return5th(String myString2) { //returning the 5th character
			System.out.println("Character at 5th position: " + myString2.charAt(5));
		}

		private static void compareString(String myString2) { //comparing the string
			int order = myString2.compareToIgnoreCase("Welcome");

			if (order < 0) {
				System.out.println("Welcome comes after " + myString2);
			} else if (order > 0) {
				System.out.println(myString2 + " comes after welcome");
			} else {
				System.out.println(myString2 + " and welcome are the same words");
			}
		}
		private static void concatenateString(String string) {  //concatenating
			System.out.println(myString + " " + string);
		}

		private static void firstOccOfa(String myString2) { //calling the first occurrence of character
			System.out.println("Position of the first occurrence of character 'a': " + myString2.indexOf("a"));
		}

		private static void replaceWithE(String myString2) { //replacing all occurrence of A with E
			System.out.println("After replacing all 'a' characters with 'e' characters: " + myString2.replace('a', 'e'));
		}

		private static void returnBW4thAnd10th(String myString2) { //returning strings between 4th and 10th position
			System.out.println("String between 4th position and 10th position: " + myString2.substring(3, 10));
		}

		private static void returnLower(String myString2) { // returning all lowercase
			System.out.println("String in lower case: " + myString2.toLowerCase());
		}
	}