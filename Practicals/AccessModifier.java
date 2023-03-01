

class Person {
	protected String name = "Ram";
	protected long num = 8888555;
}

public class AccessModifier extends Person {
	private String num1 = "Sam";

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		System.out.println("Name: " + am.name);
		System.out.println("Num: " + am.num);
		System.out.println("Friend Name: " + am.num1);
	}
}