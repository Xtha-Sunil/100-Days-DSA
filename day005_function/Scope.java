public class Scope {
	public static void main(String[] args) {
		// Function level scope
		int a = 90, b = 20;
		System.out.printf("Before swap fn : %s , %s\n", a, b); //90,20
		swap(a, b);	// 20, 90
		System.out.printf("After swap fn : %s , %s\n", a, b); //90, 20


		// Block level scope
		{
			//	int a = 20; // error
			int c = 40;
			a = 10;
		}
		System.out.println(a) ; //20 : there is no creation of new variable, both are pointing same refrence

		//System.out.println(c);	//cant access outside block
	}


	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("Inside swap fn : %s , %s\n", a, b); //20, 90
	}
}