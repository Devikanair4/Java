public class StringEg {

	public static void stringLiteralAndObject() {
		char[] name = {'d','e','v','i','k','a'};
		System.out.println(name);
		String s = new String(name);
		System.out.println(s);
		String name1 = "Devika";
		System.out.println(name1);
	}

	public static void main(String[] args) {
		stringLiteralAndObject();
	}
}