// 1389. Create Target Array in the Given Order
// https://leetcode.com/problems/create-target-array-in-the-given-order/

class Solution {
	public int[] createTargetArray(int[] nums, int[] index) {
		int[] target = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			int idx = index[i];

			if (i > idx)
				for (int j = i - 1; j >= idx; j--)
					target[j + 1] = target[j];

			target[idx] = value;
		}

		return target;
	}
}