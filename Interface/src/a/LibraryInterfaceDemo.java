package a;

class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers ob = new KidUsers(10, "Kids");
		KidUsers ob1 = new KidUsers(18, "Fiction");
		System.out.println("Test Case 1");
		ob.registerAccount();
		ob1.registerAccount();
		AdultUser ob2 = new AdultUser(5, "Kids");
		AdultUser ob3 = new AdultUser(23, "Fiction");
		System.out.println("\nTest Case 2");
		ob2.registerAccount();
		ob3.registerAccount();
	}

}
