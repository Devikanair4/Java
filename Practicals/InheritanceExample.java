class Owner { //parent, super
	final int area = 1000;
	String dateOfPurchase = "04-12-2002";
	String name = "Devika";
	boolean noc = true;

	public void renew() 
	{
		String color = "blue";
		String flat = "2bhk";
		int ceilHeight = 8;
		System.out.println("Old flat value:" +(color + " " + flat + " " + ceilHeight));
	}
}

class NewOwner extends Owner { //child, sub
	String dateOfRegister = "03-02-2023";
	double flatValue = 2.300000;
	String name = "Jeevan";

	public void display() 
	{
		System.out.println("Area is: " + area); //access parent property
		System.out.println("Oner name is: " + super.name); //access parent property
		System.out.println("Current flat price is: " + flatValue);
		System.out.println("New Owner name is: "+name);
	}

	public void renew() 
	{
		String color = "offwhite";
		String flat = "3bhk";
		int ceilHeight = 10;
		
		System.out.println(color + " " + flat + " " + ceilHeight);
		
		super.renew(); //call parent method
	}
	
	}

class InheritanceExample {
	public static void main (String args[]) {
		NewOwner c = new NewOwner();
		c.display();
		c.renew();
	}
}