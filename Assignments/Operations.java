//Assignment no.1

class Operations { //start
	public void arithmetic() {
		int a=12; //assigning value to a
		int b=15; //assigning value to b
		System.out.println("Addition of a and b :" +(a+b)); //performing addition
		System.out.println("Subtraction of a and b :" +(a-b)); //performing subtraction
		System.out.println("Multiplition of a and b :" +(a*b)); //performing multiplication
		System.out.println("Division of a and b :" +(a/b)); //performing division
		System.out.println("Modulus of a and b :" +(a%b)); //performing modulus
		System.out.println(".............");
	}
	
	public void comparison() { 
		int a=4, b=6;
		System.out.println("a>b:"+(a>b)); //greater than -->false
		System.out.println("a<b:"+(a<b)); //less than -->true
		System.out.println("a>=b:"+(a>=b)); //greater than or equal to -->false
		System.out.println("a<=b:"+(a<=b)); //less that or equal to -->true
		System.out.println("a==b:"+(a==b)); //equals to -->false
		System.out.println("a!=b:"+(a!=b)); //not equals to -->true
		System.out.println(".............");
	}
	
	public void logical() {
		int a=5, b=6;
		System.out.println((a>b)&&(a<b)); //false
		System.out.println((a>b)||(a<b)); //true
		System.out.println(".............");
		
	}
	
	public void assignment() {
		int a=30; //initial value assigned
        System.out.println("a = " + a); //30
        a += 10; //incrementing by 10
		System.out.println("a = " + a); //40
		a -= 20; //decrementing by 20
        System.out.println("a = " + a); //20
	}
	
	public void conditional() {
		int a=4;
		int b=5;
		int c=(a>b) ? a : b;
		System.out.println(c); //5
		System.out.println(".............");
		
	}
	public static void main(String args[]) { //main
		Operations obj = new Operations(); //initializing an object
		obj.arithmetic(); //calling the arithmetic method
		obj.comparison(); //calling the comparison method
		obj.logical(); // calling the logical method
		obj.assignment(); //calling the assigment method
		obj.conditional(); //calling the conditional method
	}
} //end
