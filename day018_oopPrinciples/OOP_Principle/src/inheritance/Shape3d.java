package inheritance;

public class Shape3d extends Shape2d {
				float h;
				String type;
				
				Shape3d () {
								this.h = -1;
								this.type = "error";
				}
				
				Shape3d (float h){
								super(h);
								this.h = h;
								this.type = "cube";
				}
				
				Shape3d (float l, float b, float h){
								super(l,b);
								this.h = h;
								this.type = "cuboid";
				}
				
				Shape3d(Shape3d other){
								super(other);
								this.h = h;
				}
				
				String getType(){
								return this.type;
				}
				
				String say(){
								return "I am 3d";
				}
				
				/*
				1. Super keyword is use to call parent class constructor.
				
				2. If we explicitly wants to call property of parent class then we do super.property;
				*/
}