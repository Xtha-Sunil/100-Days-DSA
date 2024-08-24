public class PowerCalc {
	public static void main(String[] args) {
		int pow = 10;
		int num = 2;

		System.out.println(power(num, pow));
	}

	// Time Complixity : O(log(pow))
	static int power(int num, int pow) {
		int ans = 1;
		while (pow > 0) {
			if ((pow & 1) == 1)
				ans *= num;

			num *= num;
			pow >>= 1;
		}
		return ans;
	}
}