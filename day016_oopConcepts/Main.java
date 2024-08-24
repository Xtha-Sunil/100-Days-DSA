public class Main {
	public static void main(String[] args) {
		Player sunil = new Player("sunil", 18, "Coding");
		System.out.println(sunil.game);	// Coding
		
		Player someone = new Player();
		System.out.println(someone.name);	//player1
		
		Player xtha = new Player(sunil);
		System.out.println(xtha.name);	//sunil
		
		xtha.changeName("Rubik");
		System.out.println(xtha.name);	//Rubik
	}
}

class Player {
	String name;
	int age;
	String game;

	// constructor overloading
	Player(){
		this ("player1", 18, "E-sport");
	}
	Player(String name, int age){
		this.name = name;
		this.age = age;
		this.game = "Football";
	}
	Player(String name, int age, String game){
		this.name = name;
		this.age = age;
		this.game = game;
	}
	
	// copying data of old player
	Player(Player old){
		this.name = old.name;
		this.age = old.age;
		this.game = old.game;
	}
	// method to change name.
	void changeName(String name){
		this.name = name;
	}
}