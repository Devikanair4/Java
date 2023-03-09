package Exception;

public class TestCostumException {
	
	static void checkAge(int age) throws CostumException {
		if(age<18 || age>25) {
			throw new CostumException("sorry! Student should be between the age of 18-25 for admission");
		}
		else {
			System.out.println("Student is eligible for admission");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(22);
		}
		catch(CostumException e) {
			System.out.println(e);
			
		}
	

	}

}
