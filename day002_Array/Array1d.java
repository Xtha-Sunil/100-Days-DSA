import java.util.*;

public class Array1d {
	public static void main(String[] args) {
		String[] sub = {"phy,", "chem", "maths"};
		int mark[] = new int[3];

		mark[0] = 53;
		mark[1] = 60;
		mark[2]  = 62;
		System.out.println(sub[0] + " " + mark[0]);


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array ");

		int size = sc.nextInt();
		int roll[] =  new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter roll ");
			roll[i] = sc.nextInt();
		}
		// Java auto initilize array memebers with 0 at declaration
		sc.close();
	}
}