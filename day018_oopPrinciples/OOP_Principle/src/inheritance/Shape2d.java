package inheritance;

public class Shape2d {
				float l;
				float b;
				String type;
				
				Shape2d () {
//								super(); // object class
								this.l = -1;
								this.b = -1;
								this.type = "Error";
				}
				
				Shape2d (float l){
								this.l = l;
								this.b = l;
								this.type = "square";
				}
				
				Shape2d (float l, float b){
								this.l = l;
								this.b = b;
								this.type = "rectangle";
				}
				Shape2d (Shape2d other){
								this.l = other.l;
								this.b = other.b;
				}
				String getType(){
								return this.type;
				}
				
				String say(){
								return "I am 2d";
				}
}