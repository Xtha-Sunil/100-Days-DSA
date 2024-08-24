public class Unique {
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, -1, 6, -4, -2};
		System.out.print("Unique in array " + findUnique(arr));
	}

	static int findUnique(int[] arr) {
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			n += arr[i];
		}
		return n;
	}
}