//Write a program to print even, odd, sum of natural number using for loop from 1-200

public class loopsEg {
	public void evennumbers() {
		System.out.println("The even numbers between 1 to 200 are: ");
		for(int i=1; i<200; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public void oddnumbers() {
		System.out.println("The odd numbers between 1 to 200 are: ");
		for(int i=1; i<200; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
	}
	
	public void summation() {
		System.out.println("The sum of the numbers between 1 to 200 are: ");
		int sum = 0;
		for(int i=1; i<=200; i++)
			sum = sum + i;
			System.out.println(sum);
			}
	
	public static void main (String args[]){
		loopsEg obj = new loopsEg();
		obj.evennumbers();
		obj.oddnumbers();
		obj.summation();
	}
}
