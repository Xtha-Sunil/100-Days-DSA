public class KadanesAlgorithm {
	public static int maxSubArraySum(int[] nums) {
		int maxSoFar = nums[0];
		int currMax = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			int currSum = currMax + nums[i];
			
			currMax = Math.max(nums[i], currSum);
			maxSoFar = Math.max(maxSoFar, currMax);
		}

		return maxSoFar;
	}

	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int maxSum = maxSubArraySum(nums);
		
		System.out.println("Max sum is " + maxSum);
	}
}
