public class Circle { // defining class 

	private float radius; // instance variable
	float pi; // declaring pi 

	private Circle() { // defining constructor
		super(); // superclass
		this.radius = 1.5f; // value of radius- 1.5
	}

	Circle(float radius) { // defining constructor
		this(radius, 3.5f); // value for pi.
	}

	private Circle(float radius, float pi) { // defining private constructor with radius and pi values as parameters.
		super(); 
		this.radius = radius; 
		this.pi = pi; 
	}

	double calculateCircleArea(float radius) { // defining a method
		double result; // declaring a local variable
		result = pi * radius * radius; // calculating the area of circle
		return result; // returning result
	}

	double calculateCircumference(float radius) { // defining a method for cicumference
		double result; // declaring a variable for its result.
		result = 2 * pi * radius; // calculating the circumference
		return result; // returning result
	}

	public static void main(String[] args) { // main method
		Circle circle = new Circle(4); 
		double area = circle.calculateCircleArea(4); // calculating area of the circle
		System.out.println("Area of the circle is: "+area); // printing area 
		double circumference = circle.calculateCircumference(4); // calculating circumference
		System.out.println("Circumference of the circle is: "+circumference); // printing the cicumference
	}

}