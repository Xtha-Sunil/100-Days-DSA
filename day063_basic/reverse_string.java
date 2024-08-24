public class Main {
	public static void main(String[] args) {
		String str = "sunil shrestha";
		char[] chars = str.toCharArray();

		int l = 0;
		int r = chars.length - 1;

		while (l < r) {
			char temp = chars[l];
			chars[l] = chars[r];
			chars[r] = temp;

			l++;
			r--;
		}

		System.out.println("Reversed string : " + new String(chars));
	}
}