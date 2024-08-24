import java.util.*;

public class StringsBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Sunil");
		System.out.println(sb);
		// length
		System.out.println("length is " + sb.length());

		// charAt index 4
		System.out.println("Char at idx 4 of Sunil is " + sb.charAt(4));

		// replace at index 0
		sb.setCharAt(0, 's');
		System.out.println("replace 0 idx with 's' " + sb);

		// insert(index, "string to add")
		sb.insert(0, "xthA");
		System.out.println(sb);

		// delete(start,end) and end is non-inclusive
		sb.delete(0, 4);
		System.out.println(sb);

		// append(string)
		sb.append("Xtha");
		System.out.println(sb);

		// Reverse the string
		StringBuilder sb2 = new StringBuilder("SUNIL");
		for (int i = 0; i < sb2.length() / 2; i++) {
			int front = i;
			int back = sb2.length() - 1 - i;

			char frontChar = sb2.charAt(front);
			char backChar = sb2.charAt(back);

			sb2.setCharAt(front, backChar);
			sb2.setCharAt(back, frontChar);
		}
		System.out.println(sb2);
		System.out.println(sb2.reverse()); // reverse method

		// split
		String fullName = "Sunil Stha";
		System.out.println(Arrays.toString(fullName.split(" ")));


		//check palindrome
		String word = "MADAM";
		System.out.printf("The word %s is %s.\n", word, isPalindrome(word));

		String alphabets = "";
		for (int i = 0; i < 26; i++)
			alphabets += (char)('a' + i);
		System.out.println(alphabets);
		
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			char ch = (char)('a' + i);
			sb3.append(ch);
		}
		System.out.println(sb3.toString());
	}

	static String isPalindrome(String word) {
		if (word == null || word.length() == 0)
			return "palindrome";
		for (int i = 0; i < word.length(); i++) {
			char front = word.charAt(i);
			char back = word.charAt(word.length() - 1 - i);

			if (front != back)
				return "not palindrome";
		}
		return "palindrome";
	}
}