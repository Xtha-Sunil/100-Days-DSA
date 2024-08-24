import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int num;

		do {
			System.out.print("Enter an integer (enter 0 to stop): ");
			num = sc.nextInt();

			sum += num;

		} while (num != 0);

		System.out.println("Sum of entered numbers: " + sum);
		
		sc.close();
	}
}