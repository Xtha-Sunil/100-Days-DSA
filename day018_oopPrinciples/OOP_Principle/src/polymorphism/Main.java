package polymorphism;

public class Main {
				public static void main(String[] args) {
								Shapes shape = new Shapes();
								Rectangle rect = new Rectangle();
								Circle circ = new Circle();
								Triangle tri = new Triangle();
								
								// polymorphism :
								shape.msg();
								rect.msg();
								circ.msg();
								tri.msg();
								
								
								Shapes obj = new Triangle();
								obj.msg(); // I am inside Triangle class ....	due method overriding
								
								
								// compile time polymorphism
								Sum obj1 = new Sum();
								
								// although there is no method which takes 2 argument of int, int there is method for double , int. so java automatic type-cast converts int to double
									System.out.println(obj1.sum(1,2));
								
								// but this gives error
								// no method for (double, double)
								// System.out.println(obj1.sum(1.1,2.9));
								
								System.out.println(obj1.sum(1,2,3));
								// System.out.println(obj1.sum(1,2,3,4));
				}
}