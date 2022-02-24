package a;

class EmployeeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1st case");
		TaxCalculator ob = new TaxCalculator();
		ob.basicSalary = 25000;
		ob.citizenship = false;
		ob.calculteTax();
		ob.deductTax();
		ob.validateSalary();
		System.out.println("\n2nd Case");
		TaxCalculator ob1 = new TaxCalculator();
		ob1.basicSalary = 125000;
		ob1.citizenship = true;
		ob1.calculteTax();
		ob1.deductTax();
		ob1.validateSalary();
	}

}
