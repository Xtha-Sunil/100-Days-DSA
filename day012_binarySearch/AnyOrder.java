public class AnyOrder {
	public static void main(String[] args) {
		int[] arr = {-23, -12, 0, 10, 23, 33, 44, 66, 68, 78, 88, 90};
		int[] arr2 = {90, 68, 66, 44, 33, 23, 10, -1, -23, -34};
		int target = -1;

		System.out.println("index " + binarySearch(arr, target));
		System.out.println("index " + binarySearch(arr2, target));
	}

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target)
				return mid;

			if (isAsc) {
				if(arr[mid] < target){
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				if(arr[mid] > target){
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}
}