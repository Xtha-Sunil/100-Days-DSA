public class SumOfPascalTriangle {
	public static void main(String[] args) {
		/*
        1
      1 2 	1
    1 3 3 1
  1 4 6 4 1
1 5 10 10 5 1

We know that sum of coefficient of pascal triangle is 2^n
		*/
		System.out.println(nthRowSum(3));
		System.out.println(nthRowSum(4));
	}
	
	static int nthRowSum(int row){
		if (row == 1)
			return 1;
		return 1 << row;  // a << b == a * 2^b
	}
}