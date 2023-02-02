//write a program to print numbers from 1 to 100, which are divisible by 5 and if the number is greater than 40.

public class Dividefive {
	public void number() {
		System.out.println("The numbers from 1 to 100 which are divisible by 5 and greater than 40 are: ");
		for(int i=1; i<100; i++) {
			if(i%5==0 && i>40) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String args[]) {
		Dividefive obj = new Dividefive();
		obj.number();
	}
}