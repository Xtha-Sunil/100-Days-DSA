// yeah class Name has first letter capital by convenction
public class staticExample {
	public static void main(String[] args) {
		// we can access static variable before creating any instance
		System.out.println(Human.population);	// 0

		// we dont need to import as both file are in same package
		Human sunil = new Human("sunil", 18, "Reverse Engineer");
		System.out.println(sunil.name);	// sunil
		System.out.println(sunil.age);	// 18
		System.out.println(sunil.job);	// Reverse Engineer

		// lets make some more instance
		Human abc1 = new Human("abc1", 2, "Civil Engineer");
		Human abc2 = new Human("def2", 3, "Social Engineer");
		Human abc3 = new Human("abc3", 4, "Prompt Engineer");

		System.out.println(Human.population);	// 4

		// this will also work but convection is accessing static var via class
		System.out.println(sunil.population);	// 4
	}
}

class Human {
	int age;
	String name;
	String job;

	// population doesnt depend upon object of class so declared as static
	static long population;	// auto inilitize with 0

	public Human(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
		Human.population += 1;
	}
}