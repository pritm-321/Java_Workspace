package a;

class KidUsers implements LibraryUser {
	int age;
	String bookType;

	KidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if (age < 12) {
			System.out.println("You have successfully registerd under a Kids Account");
		} else {
			System.out.println("\nSorry, Age must be less than 12 to register as a kid");
		}
		requestBook();
	}

	@Override
	public void requestBook() {
		if (bookType.equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are allowed to take only kids books");
		}

	}

}
