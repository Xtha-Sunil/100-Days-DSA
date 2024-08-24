// yeah class Name has first letter capital by convenction
public class staticBlock {
	static int a = 4;
	static int b;

	// static is dependent to class and not to object, so static block runs only one time during the loading of class
	static {
		System.out.println("I am static block");
		b = a * 5;
	}

	public static void main(String[] args) {
		System.out.println("Runs after static block run.\n");

		staticBlock obj1 = new staticBlock();

		System.out.print("initial value : ");
		System.out.println(staticBlock.a + " " + staticBlock.b);

		// altering the value of b
		staticBlock.b += 3;

		System.out.print("value after alter : ");
		System.out.println(staticBlock.a + " " + staticBlock.b);

		System.out.println("\nCreating instance\n");
		staticBlock obj2 = new staticBlock();

		System.out.print("Creating instance doesnt change value : ");
		System.out.print(staticBlock.a + " " + staticBlock.b);
	}
}

/*		OUTPUT
I am static block
Runs after static block run.

initial value : 4 20
value after alter : 4 23

Creating instance

Creating instance doesnt change value : 4 23
*/