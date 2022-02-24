package a;

class TaxCalculator {
	float basicSalary, tax;
	int nettSalary;
	boolean citizenship;

	void calculteTax() {
		tax = 30 * basicSalary / 100;
		System.out.println("The tax of the employee for the " + basicSalary + " is " + tax);
	}

	void deductTax() {
		nettSalary = (int) (basicSalary - tax);
		System.out.println("The nett salary of the employee is " + nettSalary);
	}

	void validateSalary() {
		if (basicSalary > 100000 && citizenship == true)
			System.out.println("The salary and citizenship eligibility: " + citizenship);
		else
			System.out.println("The salary and citizenship eligibility: " + citizenship);
	}

}
