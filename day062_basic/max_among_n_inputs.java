import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int largest = Integer.MIN_VALUE;
		int num;

		do {
			System.out.print("Enter an integer (enter 0 to stop): ");
			num = sc.nextInt();

			if (num > largest)
				largest = num;

		} while (num != 0);

		if (largest != Integer.MIN_VALUE)
			System.out.println("Largest number entered: " + largest);
		else
			System.out.println("No valid numbers entered.");

	}
}