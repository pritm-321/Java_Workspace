package a;

import javax.swing.JOptionPane;

class CalculatorSimulator {

	public static void main(String[] args) throws Exception {
		TaxCalculator ob = new TaxCalculator();
		String name = JOptionPane.showInputDialog("Enter name");
		double sal = Double.parseDouble(JOptionPane.showInputDialog("Enter salary"));
		boolean b = Boolean.parseBoolean(JOptionPane.showInputDialog("Enter citizenship -true/false"));
		try {
			ob.calculateTax(name, b, sal);
		} catch (CountryNotValidException e) {
			JOptionPane.showMessageDialog(null, e);

		} catch (EmployeeNameInvalidException e) {
			JOptionPane.showMessageDialog(null, e);

		} catch (TaxNotEligibleException e) {
			JOptionPane.showMessageDialog(null, e);

		}

	}

}
