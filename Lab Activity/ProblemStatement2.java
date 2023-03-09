package Testing;

public class ProblemStatement2 {
		private static StringBuffer myBuffer;

		public static void main(String[] args) {
			createBuffer("This is StringBuffer"); //calling the method createBuffer 
			addString("This is a sample program");// calling the method addString
			insertString("Object"); //calling the method insertString 
			reverseString(myBuffer); //calling the method reverseString
			replaceString(myBuffer.reverse().toString()); //calling the method replaceString
		}
		
		private static void addString(String string) {
			System.out.println(myBuffer.append(string));
		}

		private static void createBuffer(String string) {
			myBuffer = new StringBuffer(string);
			System.out.println("Value of variable myBuffer: " + myBuffer);
		}
		
		private static void insertString(String string) { //insertion
			System.out.println("Inserting at 21st position: " + myBuffer.insert(21, string));

		}
		
		private static void reverseString(StringBuffer myBuffer2) { //reverse
			System.out.println("Reversed string: " + myBuffer2.reverse());

		}
		
		private static void replaceString(String myString) {  //replace
			System.out.println("Replacing the word Buffer with Builder: " + myString.replaceAll("Buffer", "Builder"));

		}
	}


