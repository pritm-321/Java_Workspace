package a;

class Manager extends Employee {

	Manager() {
		super();
	}

	Manager(long Id, String Name, String Address, Long Phone, double salary) {
		super(Id, Name, Address, Phone, salary);

	}

	double calculateTransportAllowance() {
		double transportAllowance;
		transportAllowance = ((double) 15 / 100) * this.basicSalary;
		return transportAllowance;
	}

}
