public class CountSetBit {
	public static void main(String[] args) {
		int num = 256;
		System.out.println(Integer.toBinaryString(num));
		System.out.println("SetBits = " + countSetBits(num));
	}
	
	static int countSetBits(int num){
		int ans = 0;
		
		while( num > 0){
			if((num & 1)==1)
				ans++;
			num >>= 1;
		}

		return ans;
	}
}