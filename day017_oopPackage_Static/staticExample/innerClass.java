// yeah class Name has first letter capital by convenction
public class innerClass {
	static class Demo1 {
		static String name;		
		
		Demo1(String name) {
			this.name = name;
		}
	}

	public static void main(String[] args) {
		// if Demo1 is non-static it will cause error
		Demo1 obj1 = new Demo1("sunil");
		System.out.println(obj1.name);	// sunil
		
		Demo1 obj2 = new Demo1("sudin");
		System.out.println(obj1.name);	// sudin
		
		// here name is declared static so name of obj1 is changed
		System.out.println(obj1.name);	// sudin
		System.out.println(obj2.name);	// sudin
		
		// if name was not declared static then the name of previous instance wont get changed
	}
}