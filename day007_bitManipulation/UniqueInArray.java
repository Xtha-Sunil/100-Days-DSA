public class UniqueInArray {
	public static void main(String[] args) {
		// every element is present twice expect one element
		int oneUniqueArr[] = {1, 2, 3, 2, 1};
		findOneUnique(oneUniqueArr);
		
		// every element is present twice expect two element
		int[] twoUniqueArr = {1, 2, 3,-99,-99, 4, 2, 1};
		findTwoUnique(twoUniqueArr);
	}

	static void findOneUnique(int[] arr) {
		int unique = 0;
		// num ^ num == 0
		// num ^ 0 == num
		for (int i = 0; i < arr.length; i++)
			unique ^= arr[i];

		System.out.println(unique);
	}


	static void findTwoUnique(int[] arr) {
		int xor = 0;
		for (int i = 0; i < arr.length; i++)
			xor ^= arr[i];

		int LSB = xor & 1;
		int cpy = xor;

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & (-arr[i])) == LSB)
				xor ^= arr[i];
		}
		
		int unique2 = xor ^ cpy;
		System.out.println(xor + " " + unique2);
	}
}