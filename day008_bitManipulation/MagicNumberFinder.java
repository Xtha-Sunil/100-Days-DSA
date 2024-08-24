public class MagicNumberFinder {
	public static void main(String[] args) {
		/*
		Magic number are converting decimal number to binary then multiply each bit starting fom right with 5 raised to power of 1 to number of bits.

		magicNumber => decimal => binary => ans
		- first => 1 => 1 => 1*5^1 = 5
		- sec  => 2 => 10 => 1*5^2 + 0*5^1 = 25
		- third => 3 => 11 => 25 + 5 => 30
		- fourth => 4 => 100 => 125 + 0 + 0 = 125
		- fifth => 5 => 101 => 125 + 0 + 5 => 130	
		*/
		System.out.println(nthMagicNumber(6));
	}

	static int nthMagicNumber(int num) {
		int ans = 0;
		int base = 5;

		while (num > 0) {
			int lsb = num & 1;
			ans += lsb * base;
			base *= 5;
			num = num >> 1;
		}
		
		return ans;
	}
}