class VariableExample {
	static int num= 99; //static
	long num1= 56789; //instance
	
	public void display() {
		char a = 'M';//local
		double num2 = 45.76;
		System.out.println("Local variable value: "+a); // printing local variable
		System.out.println("Local variable value: "+num2); // printing local variable
	}
	
	public static void calc() {
		double b = 67.45;
		double c = 43.35;
		double res=b*c;
		System.out.println("Result is : "+res);
	}

 public static void main(String args[]) {	
	VariableExample obj = new VariableExample(); //object creation
	obj.display(); //invoke nonstatic method with obj
	calc();
	System.out.println("Instance variable value: "+obj.num1); // printing instance variable
	System.out.println("Static variable value: "+num); // calling static variable
 }

}