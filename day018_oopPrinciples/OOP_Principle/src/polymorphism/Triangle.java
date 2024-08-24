package polymorphism;

public class Triangle extends Shapes {
				int a;
				int b;
				int c;
				
				Triangle (){
								this.a = -1;
								this.b = -1;
								this.c = -1;
				}
				
				@Override
				void msg(){
								System.out.println("I am inside Triangle class");
				}
}