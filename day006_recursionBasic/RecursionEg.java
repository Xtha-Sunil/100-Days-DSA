public class RecursionEg {
	public static void main(String[] args) {
		// print 1 to 5 using recursion
		print(1);
	}
	static void print(int n) {
		System.out.println(n);
		if (n == 5) //base case
			return;
		print(n + 1);
	}
}