import java.util.*;

public class Strings {
	public static void main(String[] args) {
		// string declaration
		String name = "sunil";
		String fullName = "lorem ipsum";

		Scanner sc = new Scanner(System.in);

		// sc.next() takes only one word
		System.out.println("Enter your full name: ");
		name = sc.nextLine();
		System.out.println("Your full name is " + name);


		// Some string functions
		// 1. Concatenation
		System.out.println('a' + 'b'); // 97 + 98 = 195
		System.out.println("a" + "b");  //ab
		System.out.println('a' + 3); // 100
		System.out.println("str" + new ArrayList<>()); // str[]


		// 2. length
		System.out.println(fullName.length());

		// 3. charAt
		// fname[0] doesnt work
		for (int i = 0; i < fullName.length(); i++) {
			System.out.println(fullName.charAt(i));
		}

		// 4. compare
		String w1 = "hello";
		String w2 = "cello";

		System.out.println(w1.compareTo(w2));
		// +ve value if w1 greater than w2
		// -ve value if w2 is greater than w1
		// 0 if they are equal
		// Greater in sense of ASCII value
		
		
		// format printing
		System.out.printf("My name is %s.", "sunil");
		sc.close();
	}
}