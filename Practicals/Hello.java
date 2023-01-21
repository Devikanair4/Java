class My {
	public static void display() { //static method
		System.out.println("Hey!");
	}
}

class Hello { //start of the class with main()
	public static void main(String args[]) { //entry point
		System.out.println("This is my first program"); //will be printed on console
		My.display(); //calling classname.methodname
	}
	//end of the class
}
