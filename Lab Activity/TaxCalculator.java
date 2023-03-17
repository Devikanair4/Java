package Exception;

public class TaxCalculator {

	// This method calculates the tax amount based on the employee name, salary, and nationality
	public double calculateTax(String empName, boolean isIndian, double empSal)
			throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

		// Initialize the tax amount to zero
		double taxAmount = 0.0;

		// Check if the employee is Indian, if not, throw an exception
		if (!isIndian) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
		}

		// Check if the employee name is empty, if yes, throw an exception
		if (empName == null || empName.isEmpty()) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}

		// Calculate the tax based on the employee's salary
		if (empSal > 100000 && isIndian) {
			taxAmount = empSal * 8 / 100;
		} else if (empSal >= 50000 && empSal <= 100000 && isIndian) {
			taxAmount = empSal * 6 / 100;
		} else if (empSal >= 30000 && empSal < 50000 && isIndian) {
			taxAmount = empSal * 5 / 100;
		} else if (empSal >= 10000 && empSal < 30000 && isIndian) {
			taxAmount = empSal * 4 / 100;
		} else {
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		}

		// Return the tax amount
		return taxAmount;

	}
}