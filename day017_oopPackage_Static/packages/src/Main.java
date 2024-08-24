//	package is path to folder, where the file is saved.
// 	by the help of package we can have more than one class with common name, of course in different folders(package)

//	if there is same method name then it will have "ambigious error"
import static english.Greet.greetEnglish;
import static nepali.Greet.greetNepali;

public class Main {
	public static void main(String[] args) {
		//package helps in importing methods from other class
		greetNepali();	// namaste sunil
		greetEnglish();	// hi sunil


		// Singleton means we can create only one instance
		Singleton obj1 =  Singleton.getInstance("sunil");
		Singleton obj2 = Singleton.getInstance("utsav");
		Singleton obj3 = Singleton.getInstance("ashik");
		Singleton obj4 = Singleton.getInstance("sudin");


		// its just returning first made instace for all variables so all have name "sunil"
		System.out.println(obj1.name);	// sunil
		System.out.println(obj2.name);	// sunil
		System.out.println(obj3.name);	// sunil
		System.out.println(obj4.name);	// sunil
	}
}