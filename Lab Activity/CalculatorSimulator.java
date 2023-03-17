package Exception;

public class CalculatorSimulator {

	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator();
		// Test Case 1
		try {
			double taxAmount = taxCalculator.calculateTax("Ron", false, 34000);
			System.out.println("Tax amount is " + taxAmount);
		} catch (CountryNotValidException e) {
			System.out.println("Country not valid: " + e.getMessage());
			e.printStackTrace();
		} catch (EmployeeNameInvalidException e) {
			System.out.println("Employee name not valid: " + e.getMessage());
			e.printStackTrace();
		} catch (TaxNotEligibleException e) {
			System.out.println("Not eligible for Tax calculation: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("----------");

		// Test Case 2
		try {
			double taxAmount = taxCalculator.calculateTax("Tim", true, 1000);
			System.out.println("Tax amount is " + taxAmount);
		} catch (CountryNotValidException e) {
			System.out.println("Country not valid: " + e.getMessage());
			e.printStackTrace();
		} catch (EmployeeNameInvalidException e) {
			System.out.println("Employee name not valid: " + e.getMessage());
			e.printStackTrace();
		} catch (TaxNotEligibleException e) {
			System.out.println("Not eligible for Tax calculation: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("----------");

		// Test Case 3
		try {
			double taxAmount = taxCalculator.calculateTax("Jack", true, 55000);
			System.out.println("Tax amount is " + taxAmount);
		} catch (CountryNotValidException e) {
			System.out.println("Country not valid: " + e.getMessage());
			e.printStackTrace();
		} catch (EmployeeNameInvalidException e) {
			System.out.println("Employee name not valid: " + e.getMessage());
			e.printStackTrace();
		} catch (TaxNotEligibleException e) {
			System.out.println("Not eligible for Tax calculation: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("----------");

		// Test Case 4
		try {
			double taxAmount = taxCalculator.calculateTax("", true, 30000);
			System.out.println("Tax amount is " + taxAmount);
		} catch (CountryNotValidException e) {
			System.out.println("Country not valid: " + e.getMessage());
			e.printStackTrace();
		} catch (EmployeeNameInvalidException e) {
			System.out.println("Employee name not valid: " + e.getMessage());
			e.printStackTrace();
		} catch (TaxNotEligibleException e) {
			System.out.println("Not eligible for Tax calculation: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("----------");
	}

}
