class Myconstructor {
	Myconstructor() {
		System.out.println("Hey!!");
	}
	
	int a;
	String name;
	//creating a default constructor
	public void display() {
		System.out.println(a +" "+ name);
	}
	
	public static void main(String args[]) {
		System.out.println("Aaaa");
		Myconstructor obj = new Myconstructor(); // calling pf the default constructor
		obj.display();
	}
	//0 and null will be provivded by the constructor.
	

}