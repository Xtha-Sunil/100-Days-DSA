import java.util.*;

public static class Rearrange {
	// rearrange so that even positioned are greater than odd positioned

	static void rearrange(int[] arr, int N) {

		for (int i = 0; i < N; i += 2) {
			if (i > 0 && arr[i - 1] > arr[i]) {
				int temp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = temp;
			}

			if (i < N - 1 && arr[i + 1] > arr[i]) {
				int temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int N = 4;
		int[] arr = { 1, 2, 2, 1 };

		rearrange(arr, N);

		System.out.print(Arrays.toString(arr));
	}
}