import java.util.*;

public class EvenOddPartition {
	public static void main(String[] args) {
		// even odd partition
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		partition(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void partition(int[] arr) {
		int i = -1, j = 0;

		while (j < arr.length) {
			if (arr[j] % 2 == 0) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j++;
		}

	}
}