// 7. Reverse Integer
// https://leetcode.com/problems/reverse-integer/

class Solution {
	public int reverse(int x) {
		int ans = 0;

		int num = Math.abs(x);
		
		while (num > 0) {
			int rem = x % 10;

			if ((Integer.MAX_VALUE - rem) / 10 < ans)
				return 0;

			ans = ans * 10 + rem;
			x = x / 10;
		}
		
		return x > 0 ? return ans : return (-ans);
	}
}