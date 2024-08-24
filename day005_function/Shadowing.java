public class Shadowing {
	static int mark = 60;

	public static void main(String[] args) {
		// when variable scope overlap then higher level variable will be shadowed by lower level variable
		

		System.out.println(mark);
		
		// shadowing occur after initilization
		int mark = 75;  // change in this function(method) only
		printMark();
		System.out.println(mark);
	}
	
	static void printMark(){
		System.out.println(mark);
	}
}