public class Patterns2 {
	public static void main(String[] args) {
		pattern6(5);
		pattern7(5);
		pattern8(5);
	}

	static void pattern6(int n) {
		/*
		* * * * *
		 * * * *
		  * * *
		   * *
		    *
		    *
		   * *
		  * * *
		 * * * *
		* * * * *
		*/
		for (int row = 0; row < n * 2; row++) {

			int space = (row < n) ? row : 2 * n - 1 - row;
			for (int i = 0; i < space; i++) {
				System.out.print(" ");
			}

			int colInRow = (row < n) ? n - row : row - n + 1;
			for (int col = 0; col < colInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern7(int n) {
		/*
		*                      *
		* *                * *
		* * *          * * *
		* * * *    * * * *
		* * * * * * * * *
		* * * *    * * * *
		* * *          * * *
		* *               * *
		*                     *
		*/

		for (int row = 0; row <= 2 * n; row++) {
			for (int col = 0; col <= 2 * n; col++) {
				int front = (row < n) ? row : 2 * n - row;

				if (col <= front || col >= 2 * n - front)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	static void pattern8(int n) {
		/*
		* * * * * * * * * *
		* * * *       * * * *
		* * *            * * *
		* *                  * *
		*                       *
		*                       *
		* *                 * *
		* * *            * * *
		* * * *       * * * *
		* * * * * * * * * *
		*/
		for (int row = 0; row < 2 * n; row++) {
			for (int col = 0; col < 2 * n; col++) {
				int front = (row < n) ? n - row : row - n + 1;
				if (col < front || col >= 2 * n - front)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}