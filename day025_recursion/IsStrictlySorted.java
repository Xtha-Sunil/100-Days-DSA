//time complixity is worst when array is sorted and is O(N)

public class IsStrictlySorted {
	public static boolean isSorted(int[] arr, int idx) {
		if (idx == arr.length - 1) {
			return true;
		}

		if (arr[idx] >= arr[idx + 1])
			return false;

		return isSorted(arr, idx + 1);
	}
		
	public static void main(String[] args) {
		System.out.println(isSorted(new int[] {1, 2, 3, 4, 4}, 0));
	}
}