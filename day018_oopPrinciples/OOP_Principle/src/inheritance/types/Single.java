package inheritance.types;

// This is single inheritance example
public class Single extends A {
				int single;
				
				Single (){
								this.single = -1;
				}
				
				Single (int single) {
								this.single = single;
				}
				
				Single(int a, int single){
								super(a);
								this.single = single;
				}
				Single (Single other){
								super(other);
								this.single = single;
				}
				void myClass(){
								System.out.println("I am in class Single");
				}
}