public class NumberOfDigits {
	public static void main(String[] args) {
		// count number of digits of number  N in base B
		int num = 7777;
		int base = 8;

		System.out.println(countDigitsBruteForce(num, base));
		System.out.println(countDigits(num, base));
	}

	static int countDigitsBruteForce(int num, int base) {
		StringBuilder sb = new StringBuilder();
		while (num > 0) {
			int rem = num % base;
			num /= base;
			sb.insert(0, Integer.toString(rem));
		}
		return sb.length();
	}


	static int countDigits(int num, int base) {
		int ans = (int)(Math.log(num) / Math.log(base)) + 1;

					
					System.out.printf("\n\n\n=>" + (Math.log(16) /Math.log(2)));
		return ans;
	}
}