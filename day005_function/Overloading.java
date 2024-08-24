public class Overloading {
	// overloading occurs when we define more than one method with same name but one or all thing different
	// 1. different return type
	// 2. differnt number of arguments
	// 3. different data type of argument
	
	public static void main(String[] args) {
		int age = 19;
		String name = "Sunil";
		print(age);
		print(name);
		print(age, name);
		
		int x = print();
		System.out.println(x);
	}
	
	static void print(int age){
		System.out.println("only age called");
		System.out.println(age);
	}
	
	static int print(){
		System.out.println("return method called");
		return 9999;
	}
	
	static void print(String name){
		System.out.println("only name called");
		System.out.println(name);
	}
	
	static void print(int age, String name){
		System.out.println("both name and age called");
		System.out.println(age + " " + name);
	}
}