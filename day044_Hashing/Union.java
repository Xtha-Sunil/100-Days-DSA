import java.util.*;

public class Union {
		public static void union(int[] arr1, int[] arr2){
				HashSet<Integer> allElem = new HashSet<>();
				
				for(int i=0; i<arr1.length; i++){
						allElem.add(arr1[i]);
				}
				for(int i=0; i<arr2.length; i++){
						allElem.add(arr2[i]);
				}
				
				for(int i : allElem){
						System.out.print(i + ", ");
				}
				System.out.println();
		}
		public static void main(String[] args) {
				int[] arr1 = {1,2,3,4,5,6,1,12};
				int[] arr2 = {2,4,6,8,10, 12};
				
				union(arr1, arr2);
		}
		
}