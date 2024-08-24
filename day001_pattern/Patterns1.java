public class Patterns1 {
	public static void main(String[] args) {
		pattern1(4);
		pattern3(5);
		pattern4(4);
		pattern5(5);
		pattern2(4);
	}
	static void pattern1(int n) {
		/*
				* * * *
				* * * *
				* * * *
				* * * *
		*/
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern2(int n) {
		/*
				* * * *
				  * * *
				    * *
				      *
		*/
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i * 2; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern3(int n) {
		/*
				1
				1 2
				1 2 3
				1 2 3 4
				1 2 3 4 5
		*/
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	static void pattern4(int n) {
		/*
				*
				* *
				* * *
				* * * *
				* * *
				* *
				*
		*/
		for (int row = 0; row < 2 * n; row++) {
			int totalColInRow = (row > n) ? 2 * n - row : row;
			for (int col = 0; col < totalColInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern5(int n) {
		/*
			*********
			*******
			*****
			***
		    *
		*/
		for (int row = 0; row < n; row++) {
			for (int i = 0; i < row; i++) {
				System.out.print(" ");
			}
			for (int col = 0; col < 2 * (n - row) - 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}