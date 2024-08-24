package inheritance.types;

public class Main {
				
				public static void main(String[] args) {
								// !! TRYING RANDOM THINGS !!
								
								A obj1 = new A();
								Single obj2 = new Single();
								MultiLevel obj3 = new MultiLevel(88,2,3);
								Hierarchical obj4 = new Hierarchical(2,4);
								System.out.println(obj3.a); // 88
								
								
								MultiLevel obj5 = new MultiLevel(obj3);
								System.out.println(obj5.a);
								
								System.out.println(obj4.hier);
								
								
								
								System.out.println(obj1.a);
								System.out.println(obj2.a);
								//System.out.println(obj1.single);
								//System.out.println(obj2.multi);
				}
}