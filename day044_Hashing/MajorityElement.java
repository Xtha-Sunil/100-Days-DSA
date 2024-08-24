// majority element are those element in array which appear more than n/3 times.

import java.util.*;

public class MajorityElement {
		public static void printMajority(int[] arr){
				HashMap<Integer, Integer> freq = new HashMap<>();
				for(int i : arr){
						if(!freq.containsKey(i)){
								freq.put(i, 1);
						} else {
								freq.put(i, freq.get(i) + 1);
						}
				}
				
				for(int key : freq.keySet()){
						if(freq.get(key) > arr.length / 3){
								System.out.print(key + ", ");
						}
				}
				
		}
		
		public static void main(String[] args) {
				int[] arr = {1,2};
				printMajority(arr);
		}
}