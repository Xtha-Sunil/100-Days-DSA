public class Main {
	public static void main(String[] args) {
		int[] nums = {11, 38, 18, 92, -9, 88, -3};
		int target = 88;
		int ans = linearSearch2(nums, target);
		System.out.println(ans);
	}


	static int linearSearch2(int[] arr, int target) {
		if (arr.length == 0) {
			// target may be -1 so we can check as
			// target == -1 ? return -11 : return -1;
			// or return array like {msgNo , foundOrNot} instead of single value
			return -1;
		}

		for (int element : arr) {
			if (element == target) {
				return element;
			}
		}
		
		// not found
		return Integer.MAX_VALUE ;
	}



	// search in the array: return the index if item found
	// otherwise if item not found return -1
	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}

		return -1;
	}
}
