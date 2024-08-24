import java.util.Arrays;

// Time : O(N)
// Space : O(N)

public class PrefixSum {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};

		int[] prefixSum = new int[arr.length];
		getPrefix(arr, prefixSum);

		System.out.println(Arrays.toString(prefixSum));
	}

	static void getPrefix(int[] arr, int[] prefixSum) {
		prefixSum[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			prefixSum[i] = arr[i] + prefixSum[i - 1];
		}
	}
}