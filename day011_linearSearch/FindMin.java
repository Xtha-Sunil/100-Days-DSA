public class FindMin {
	public static void main(String[] args) {
		int[] arr = {0, -99, 100, 292, -999};
		System.out.println(min(arr));
	}

	static int min(int[] arr) {
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < ans) {
				ans = arr[i];
			}
		}
		return ans;
	}
}
