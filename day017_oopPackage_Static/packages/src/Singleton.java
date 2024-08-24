public class Singleton {
	String name;
	private Singleton(String name) {
		this.name = name;
	}

	private static Singleton instance;

	public static Singleton getInstance(String name) {
		if (instance == null){
			// private constructor can be called in same file
			instance = new Singleton(name);
		}
		
		return instance;
	}
}