import java.util.Scanner;

public class CombinationPermutation {

	// Factorial function
	static long factorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}

	// Calculate nCr
	static long nCr(int n, int r) {
		return factorial(n) / (factorial(r) * factorial(n - r));
	}

	// Calculate nPr
	static long nPr(int n, int r) {
		return factorial(n) / factorial(n - r);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();

		System.out.print("Enter the value of r: ");
		int r = sc.nextInt();

		if (n < r)
			System.out.println("n should be greater than or equal to r.");
		else {
			System.out.println("nCr = " + nCr(n, r));
			System.out.println("nPr = " + nPr(n, r));
		}

		sc.close();
	}
}