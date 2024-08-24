public class RangeXor {
	public static void main(String[] args) {
		/*
		0^1 = 1							|			0^1^2^3^4^5 = 1
		0^1^2 = 3						|			0^1^2^3^4^5^6 = 7
		0^1^2^3 = 0					|			0^1^2^3^4^5^6^7 = 0
		0^1^2^3^4 = 4				|			0^1^2^3^4^5^6^7^8 = 8
		*/

		System.out.println(xor(9));	//1
		System.out.println(xor(10));	//11

		/*
		for a = 4 and b = 6
		4^5^6 = (1^2^3^4^5^6)^(1^2^3) = xor(b) ^ xor(a-b)
		*/

		int a = 6;
		int b = 16;
		System.out.println(xor(b) ^ xor(a - 1));	//17
	}

	static int xor(int num) {
		if (num % 4 == 0)
			return num;

		else if (num % 4 == 1)
			return 1;

		else if (num % 4 == 2)
			return num + 1;

		return 0;
	}
}