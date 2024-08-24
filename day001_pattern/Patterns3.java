public class Patterns3 {
	public static void main(String[] args) {
		pattern10(5);
		pattern11(5);
		pattern12(5);
		pattern13(5);
		pattern14(5);
	}
	static void pattern10(int n) {
//		1
//		0 1
//		1 0 1
//		0 1 0 1
//		1 0 1 0 1
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if ((i + j) % 2 == 0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}

	static void pattern11(int n) {
//*                 *
//* *             * *
//*   *         *   *
//*     *     *     *
//*       * *       *
//*       * *       *
//*     *     *     *
//*   *         *   *
//* *             * *
//*                 *

		int N = 2 * n;
		{
			for (int row = 0; row < N; row++) {
				for (int col = 0; col < N; col++) {
					int front = (row < n) ? row + 1 : N - row;
					//if (col < front || col >= N - front)
					if (col == 0 || col == front - 1 || col == N - 1 || col == N - front)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
	}

	static void pattern12(int n) {
		/*
	    	*
		   * *
		  * * *
		 * * * *
		* * * * *
		 * * * *
		  * * *
		   * *
		    *
		*/
		for (int row = 0; row < 2 * n; row++) {

			int totalCol = (row < n) ? row : 2 * n - row;
			int space = (row < n) ? n - row : n - totalCol;

			for (int s = 0; s < space; s++)
				System.out.print(" ");

			for (int col = 0; col < totalCol; col++)
				System.out.print("* ");

			System.out.println();
		}
	}

	static void pattern13(int n) {
		/*
						1
					2 1 2
				3 2 1 2 3
			4 3 2 1 2 3 4
		5 4 3 2 1 2 3 4 5
			4 3 2 1 2 3 4
				3 2 1 2 3
					2 1 2
						1
		*/
		for (int row = 1; row <= 2 * n; row++) {

			int space = (row <= n) ? n - row : row - n;
			for (int s = 0; s < space; s++)
				System.out.print("  ");

			int toPrint = (row <= n) ? row : 2 * n - row;
			for (int col = toPrint; col >= 1 ; col--)
				System.out.print(col + " ");

			for (int col = 2; col <= toPrint ; col++)
				System.out.print(col + " ");

			System.out.println();
		}
	}

	static void pattern14(int n) {
		/*
		1  2  3  4  5	26 27 28 29 30
			6  7  8  9	22 23 24 25
			10 11 12	19 20 21
				 13 14	17 18
					  15	16
		    */
		int i = 1, j = n * n + 1;
		for (int row = 0; row < n; row++) {
			for (int s = 0; s < row; s++)
				System.out.print("   ");

			for (int col = 0; col < n - row; col++) {
				if (i < 10)
					System.out.print(" " + i++ + " ");
				else
					System.out.print(i++ + " ");
			}

			for (int col = 0; col < n - row; col++)
				System.out.print(j++ + " ");

			j = j - 2 * (n - row) + 1; // j = j - 2*col + 1;
			System.out.println();
		}
	}
}