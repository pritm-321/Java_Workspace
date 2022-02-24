package a;

import javax.swing.JOptionPane;

class TaxCalculator {
	double taxAmount;

	void calculateTax(String empName, boolean isIndian, double empSal) throws Exception {
		if (isIndian == false) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}
		if (empName.equals("")) {
			System.out.println(empName);
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
		if (empSal > 100000 && isIndian == true)
			taxAmount = empSal * 0.08;
		else if (empSal > 50000 && empSal < 100000 && isIndian == true)
			taxAmount = empSal * 0.06;
		else if (empSal > 30000 && empSal < 50000 && isIndian == true)
			taxAmount = empSal * 0.05;
		else if (empSal > 10000 && empSal < 30000 && isIndian == true)
			taxAmount = empSal * 0.04;

		else
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		JOptionPane.showMessageDialog(null, taxAmount, "Tax Amount is", 3);
	}

}
