// 1672. Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/

class Solution {
	public int maximumWealth(int[][] accounts) {
		int max = Integer.MIN_VALUE;

		for (int[] banks : accounts) {
			int total = 0;
			for (int money : banks)
				total += money;
			if (total > max)
				max = total;
		}

		return max;
	}
}