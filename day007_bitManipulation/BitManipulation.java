public class BitManipulation {
	public static void main(String[] args) {
		System.out.println(getBit(10, 3));
		System.out.println(setBit(10, 3));
		System.out.println(clearBit(10, 2));
		System.out.println(updateBit(10, 2, false));
	}

	static int getBit(int num, int pos) {
		int idx = pos - 1;
		int bitMask = 1 << idx;

		if ((bitMask & num) == 0)
			return 0;

		return 1;
	}

	static int setBit(int num, int pos) {
		int idx = pos - 1;
		int bitMask = 1 << idx;

		return bitMask | num;
	}


	static int clearBit(int num, int pos) {
		int idx = pos - 1;
		int bitMask = ~(1  << idx);
		return bitMask & num;
	}


	static int updateBit(int num, int pos, boolean isSet) {
		if (isSet)
			return setBit(num, pos);

		return clearBit(num, pos);
	}
}