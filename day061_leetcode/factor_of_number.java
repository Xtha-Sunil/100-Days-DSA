public class Main {
	public static void main(String[] args) {
		int num = 100;

		for (int i = 1; i * i <= num; i++)
			if (num % i == 0) {
				System.out.print(i + " ");
				if (num / i != i)
					System.out.print(num / i + " ");
			}

	}
}