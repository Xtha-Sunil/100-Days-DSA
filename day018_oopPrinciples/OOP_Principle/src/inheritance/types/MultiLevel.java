package inheritance.types;

// A => Single => MultiLevel

public class MultiLevel extends Single{
				int multi;
				
				MultiLevel(){
								this.multi = -1;
				}
				
				MultiLevel(int multi){
								this.multi = multi;
				}
				
				MultiLevel(int a,int single, int multi){
								super(a,single);
								this.multi = multi;
				}
				
				MultiLevel(MultiLevel other){
								super(other);
								this.multi = other.multi;
				}
				
				
				
				void myClass(){
								System.out.println("I am in class Multi Level");
				}
}