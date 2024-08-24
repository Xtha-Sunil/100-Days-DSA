1. In `public static void main(String[] args) {	...	} `, why is main method declared static ?
=> Static means that the method / property that can be used without making instance / object of the class in which the method / property is declared.
In Java eveything is put inside Class, including main(thats why its method) and while running java program `main` is the first method that java executes from.
Then how can we run the program to make instance of class if main method is point of start.
So, in order to execute java program we should be able to run main method without making instance of class in which it is declared. That can only be achieced by declaring it as static.


2. In given snippet, it gives error that non - static method cant be used in static method.
public class Main {
	public static void main(String[] args) {
		greetings();
	}
	void greetings() {
		System.out.println("Namaste");
	}
}

static method cant access non-static data. Static method are independent to object but non-static are dependent to object. And while using non-static data inside static method then the static method will be dependent to the object of non-static data, which dont make sense.

	[ Now I dont think line 18 itself is making any sense LOL ]


In order to overcome this we can create object of class in which the	non-static data is declared as follow:


public class Main {
	public static void main(String[] args) {
		// greetings();	// error

		// so making object of class where it is declared
		Main obj = new Main();
		obj.greetings();
	}

	void greetings() {
		System.out.println("Namaste");
	}
}


3. We can call non-static method inside non-static method because at the end every non-static method will have instance of its own;

class Main {
	public static void main(String[] args) {
		Main obj = new Main();
		obj.func();
	}
	
	// not error because greetings is dependent to object and func is also dependent to object as well.
	void func() {
		greetings();
	}
	void greetings() {
		System.out.println("Namaste");
	}
}


4. We cant use 'this' keyword inside non-static block.

5. As static class, methods have nothing to do with object hence they are resolved during compile time.