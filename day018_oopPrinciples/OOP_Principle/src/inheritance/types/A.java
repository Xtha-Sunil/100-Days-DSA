package inheritance.types;

public class A {
				int a;
				
				A (){
								this.a = -1;
				}
				
				A (int a){
								this.a = a;
				}
				
				A (A other){
								this.a = other.a;
				}
				
				void myClass(){
								System.out.println("I am in class A");
				}
}