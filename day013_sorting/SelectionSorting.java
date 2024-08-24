import java.util.Arrays;

public class SelectionSorting {
		
		public static int find(int[] arr, int start, int end){
				int max = start;
				for(int i=0; i<=end; i++){
						if(arr[i] > arr[max] ){
								max = i;
						}
				}
				return max;
		}
		
		public static void swap(int[] arr, int max, int last){
				int temp = arr[last];
				arr[last] = arr[max];
				arr[max] = temp;
		}
		
		public static void main(String[] args){
				int[] arr = {0,-1,0};
				
				for(int i=0; i<arr.length; i++){
						int last = arr.length - i - 1;
						int maxIdx = find(arr, 0, last);
						swap(arr, maxIdx, last);
				}
				
				System.out.println(Arrays.toString(arr));
		}
}