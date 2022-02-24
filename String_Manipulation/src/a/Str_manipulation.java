package a;

import java.util.StringTokenizer;

class Str_manipulation {
	void string() {
		String str = "Welcome to Java World";
		System.out.println("...String...");
		System.out.println("Character at 5th position " + str.charAt(5));
		System.out.println("Differences " + str.compareTo("Welcome"));
		System.out.println(str.concat(" Let us learn"));
		System.out.println("Occurence of a " + str.indexOf('a'));
		System.out.println("New string is : " + str.replace('a', 'e'));
		System.out.println("String between 4th position and 10th position : " + str.substring(4, 11));
		System.out.println("String in lower case : " + str.toLowerCase());
	}

	void string_Buffer() {
		StringBuffer str = new StringBuffer("This is StringBuffer");
		System.out.println("\n\n...String Buffer...");
		System.out.println("New String : " + str.append(" This is a sample program"));
		System.out.println("New String : " + str.insert(21, " Object "));
		int val = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'B') {
				val = i;
				break;
			}
		}
		System.out.println("Replaced String : " + str.replace(val, val + 6, "Builder"));
		System.out.println("Reverse String : " + str.reverse());

	}

	void string_Builder() {
		StringTokenizer str = new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
		int i = 1;
		String a = "", b = "", c = "";
		while (str.hasMoreTokens()) {

			if (i == 1) {
				a = str.nextToken("\\");
				i++;
			} else if (i == 2 || i == 3) {
				b += str.nextToken("\\");
				b = b.concat("||");
				i++;
			} else if (i == 4) {
				b += str.nextToken("\\");
				i++;
			} else {
				c = str.nextToken("\\");
				i++;
			}

		}
		System.out.println("\n\n...String Builder...");
		System.out.println("Drive : " + a + "\nFolders : " + b + "\nFile : " + c);

	}

	public static void main(String[] args) {
		Str_manipulation ob = new Str_manipulation();
		ob.string();
		ob.string_Buffer();
		ob.string_Builder();
	}

}
