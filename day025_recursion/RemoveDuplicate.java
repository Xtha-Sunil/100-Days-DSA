// time complixity : O(N)

public class RemoveDuplicate {
	public static void remDup(String str, int idx, boolean[] map, String ans) {
		if (idx == str.length()) {
			System.out.println(ans);
			return;
		}

		char currChar = str.charAt(idx);

		// boolean array is initilized with false
		// !false = true means its first appearance
		if (!map[currChar - 'a']) {
			ans += currChar;
			map[currChar - 'a'] = true;
		}
		remDup(str, idx + 1, map, ans);
	}

	public static void main(String[] args) {
		String str = "aabuaarahehaicloudclass";
		boolean[] map = new boolean[26];
		remDup(str, 0, map, "");
	}
}