package a;

class Employee {
	long employeeId;
	String employeeName, employeeAddress;
	Long employeePhone;
	double basicSalary, specialAllowance = 250.80, hra = 1000.50;

	Employee() {
		super();
	}

	Employee(long Id, String Name, String Address, Long Phone, double salary) {
		super();
		employeeId = Id;
		employeeName = Name;
		employeeAddress = Address;
		employeePhone = Phone;
		basicSalary = salary;
	}

	double calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		return salary;
	}

	double calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = ((double) 10 / 100) * basicSalary;
		return transportAllowance;
	}

}
