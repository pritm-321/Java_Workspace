package a;

class AdultUser implements LibraryUser {
	int age;
	String bookType;

	AdultUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if (age > 12) {
			System.out.println("\nYou have successfully registerd under an adult Account");
		} else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		requestBook();

	}

	@Override
	public void requestBook() {
		if (bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		} else {
			System.out.println("Oops, you are allowed to take only adult books");
		}

	}
}
