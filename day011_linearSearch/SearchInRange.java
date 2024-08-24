public class SearchInRange {
	public static void main(String[] args) {
		int[] arr = {20, 18, 16, 12, -7, 3, 14, 28};
		int target = 20;
		System.out.println(linearSearch(arr, target, 1, 4));
	}

	static int linearSearch(int[] arr, int target, int start, int end) {
		if (arr.length == 0) {
			return -1;
		}


		for (int index = start; index <= end; index++) {
			// check for element at every index if it is = target
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}

		return -1;
	}
}
