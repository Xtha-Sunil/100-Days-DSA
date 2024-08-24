public class FinalExample {
	public static void main(String[] args) {

		final int bonus = 2;
//		when a non primitive is final, you cannot reassign it.
//		bonus = 3;	// gives error



		final Gamer sunil = new Gamer("Sunil", "Free Fire");
		System.out.println(sunil.game);	// Free Fire

//		its property can be changed
		sunil.game = "Clash of Clan";
		System.out.println(sunil.game);  // Clash of Clan


//		'sunil' is final data type so cant be re-assigned
//		sunil = new Gamer("Clash Royale"); // this gives error
	}
}

class Gamer {
	String name, game;

	Gamer(String game) {
		this.game = game;;
	}

	Gamer(String name, String game) {
		this.name = name;
		this.game = game;
	}
}
