imort java.util.Arrays;

public class RotateArrayRight {
	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		// if k == n then array is not roatated
		k = k % n;
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
	}

	private static void reverse(int[] nums, int s, int e) {
		while (s < e) {
			int temp = nums[s];
			nums[s] = nums[e];
			nums[e] = temp;
			s++;
			e--;
		}
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		
		rotate(nums, k);
		
		System.out.print(Arrays.toString(nums));
	}
}
