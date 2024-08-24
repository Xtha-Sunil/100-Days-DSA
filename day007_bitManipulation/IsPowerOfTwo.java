public class IsPowerOfTwo {
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(16)); //true
		System.out.println(isPowerOfTwo(17)); //false
	}

	static boolean isPowerOfTwo(int num) {
		// 4 = 3 + 1 => 100 = 11 + 1
		// 8 = 7 + 1 => 1000 = 111 + 1
		
		// 8 & 7 => 1000 & 0111 => 0
		return (num & (num - 1)) == 0;
	}
}