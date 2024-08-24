package inheritance.types;

public class Hierarchical extends A{
				int hier;
				
				Hierarchical(){
								this.hier = -1;
				}
				
				Hierarchical(int hier){
								this.hier = hier;
				}
				
				Hierarchical(int a, int hier){
								super(a);
								this.hier = hier;
				}
				
				void myClass(){
								System.out.println("I am in class hierarchical");
				}
}