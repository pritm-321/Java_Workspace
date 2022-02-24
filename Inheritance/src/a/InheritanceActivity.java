package a;

class InheritanceActivity {

	public static void main(String[] args) {
		Manager ob = new Manager(126534, "Peter", "Chennai India", (long) 237844, 65000);
		Trainee ob1 = new Trainee(29846, "Jack", "Mumbai India", (long) 442085, 45000);
		System.out.println("Salary for manager :" + ob.calculateSalary());
		System.out.println("Transport Allowance for manager :" + ob.calculateTransportAllowance());
		System.out.println("Salary for trainee :" + ob1.calculateSalary());
		System.out.println("Transport Allowance for trainee :" + ob1.calculateTransportAllowance());
	}

}
