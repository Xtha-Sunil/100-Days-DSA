public class GarbageCollector {
public static void main(String[] args) {
    Car car1 = new Car();
    for(int i=0; i< 600000; i++){
        car1 = new Car();
    }
    
    // car1.finalize();
}
	
    static class Car {
		String name;
		String engine;
		Car (){
			this.name = "tesla";
			this.engine = "electric";
		}
		
		@Override
		protected void finalize() throws Throwable {
			System.out.println(this.name + " car is destroyed.");
		}
	}
}