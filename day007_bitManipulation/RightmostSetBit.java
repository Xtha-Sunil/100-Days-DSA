public class RightmostSetBit {
	public static void main(String[] args) {
		System.out.println(rightmostSetBit(12));
	}

	static int rightmostSetBit(int num) {
		/*
		to find rightmostSetBit of a number we can & it with number which has complement of part before rightmostSetBit which is negative of its own;

			__a_      _b_
			1000 1 000
		&  0111 1 000
		=  0000 1 000
		*/


		return num & (-num);	//4 coz bin(100) = dec(4)
	}
}