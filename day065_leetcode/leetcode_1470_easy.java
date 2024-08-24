// 1470. Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/

class Solution {
	public int[] shuffle(int[] nums, int n) {
		int i = n - 1;
		for (int j = nums.length - 1; j >= n; j--) {
			nums[j] <<= 10;
			nums[j] |= nums[i];
			i--;
		}

		i = 0;
		for (int j = n; j < nums.length; j++) {
			int num1 = nums[j] & 1023;
			int num2 = nums[j] >> 10;
			nums[i] = num1;
			nums[i + 1] = num2;
			i += 2    ;
		}

		return nums;
	}
}