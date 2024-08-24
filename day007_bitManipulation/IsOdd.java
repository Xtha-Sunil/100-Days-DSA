public class IsOdd {
	public static void main(String[] args) {
		System.out.println(isOdd(9)); //true
		System.out.println(isOdd(50)); //false
	}
	
	static boolean isOdd(int num){
		// as every bit in binary is multiple of 2 so only LSB is responsible for number to be odd or even
		
		// 5 & 1 => 101 & 001 => 001 => odd
		// 6 & 1 => 110 & 001 => 000 => even
		
		// num & 1 gives LSB
		return (num & 1) == 1;
	}
}