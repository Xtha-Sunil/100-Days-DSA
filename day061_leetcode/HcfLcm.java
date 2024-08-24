public class HcfLcm {

	// Function to find HCF
	private static int findHCF(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		/*
		12, 18
		T = 18, B = 12, A = 18
		T = 12, B = 6, A = 12
		T = 6, B = 0, A = 6
		*/
		return a;
	}

	// Function to find LCM
	public static int findLCM(int a, int b) {
		return (a * b) / findHCF(a, b);
	}

	public static void main(String[] args) {
		int num1 = 18;
		int num2 = 12;

		int lcm = findLCM(num1, num2);
		int hcf = findHCF(num1, num2);
		
		System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
		System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
	}
}