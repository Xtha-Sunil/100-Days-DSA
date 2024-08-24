package inheritance;

public class Main {
    public static void main(String[] args) {
    				Shape3d obj = new Shape3d(2);
    				// sub class can access property of super class
    				System.out.printf("%.2f %.2f %.2f\n", obj.l, obj.b, obj.h);
    				System.out.println(obj.type);
    				
    				Shape2d obj1 = new Shape2d(2,3);
    		//		System.out.println(obj1.h);	// gives error because parent class is unaware about property of child class
    				System.out.println(obj1.type);	// rectangle
    				
    				// here shape3d extens shape2d so shape3d is child or sub-class and shape2d is super-class
    				Shape2d obj2 = new Shape3d(5);
    				System.out.printf("%f %f\n", obj2.l, obj2.b);	//no error
    				System.out.println(obj2.type);	// square
//    				System.out.println(obj2.h); // gives error
    				
    				/*
    				Note : 
    				Parent obj = new Child();
    				
    				Here refrence variable is type of parent Class but object type is of child Class.
    				It is type of refrence variable that determines that which property can refrence variable access.
    				
    				When refrence of sub-class object is assigned to super-class variable then the super-class variable will have access to only those properties which are defined in super-class.
    				*/
    				
    				
    				
    				// If we do like this, this will give error
    				// Child obj = new Parent();
    				// Shape3d objj = new Shape2d(8);
    				/*
    				WHY DOES THIS GIVE ERROR??????
    				Here refrence variable is of type of sub-class means the refrence variable should have access to all property of sub-class. But to use them it should be initialized first.
    				
    				But how will the object of super-class how can we call the constructor of child class.
    				
    				Hence it gives error.
    				*/
    }
}