import java.util.Arrays;

public class PassValue {
	public static void main(String[] args) {
		// There is no pass by refrence in java
		//  Primitive data type are passed by value
		// Non-primitive data type are passed with value of refrence variable

		int num = 20;
		primitive(num);  //40
		System.out.println(num); // 20
		
		
		int[] arr ={1,2,3,4};
		nonPrimitive(arr);
		System.out.println(Arrays.toString(arr));  // changed here also
	}
	static void primitive(int num) {
		num = 40;
		System.out.println(num); // 40
	}
	
	static void nonPrimitive(int[] arr){
		arr[0] = 55;
		System.out.println(Arrays.toString(arr));
	}
}