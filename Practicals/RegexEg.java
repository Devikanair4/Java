package Container;
import java.util.regex.Pattern;

public class RegexEg {
	public static void main(String args[]) {
		boolean b = Pattern.matches("[a-z1-9]{5,}","devika123456");
		System.out.println(b);
		b=Pattern.matches("[a-z1-9]{5,}","Hello");
		System.out.println(b);
	}

}
