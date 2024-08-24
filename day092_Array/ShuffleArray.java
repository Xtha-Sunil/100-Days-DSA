import java.util.*;


public class ShuffleArray {
	public static void shuffle(int[] nums) {
		
		Random random = new Random();
		
		for (int i = nums.length - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);
			
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		shuffle(nums);
		
		System.out.print(Arrays.toString(nums));
	}
}
