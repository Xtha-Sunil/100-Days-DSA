import java.util.Arrays;

public class CycleSort {
	public static void main(String[] args) {
		int[] arr = {5, 3, 2, 4, 1};
		cycleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void cycleSort(int[] arr) {
		for (int i = 0; i < arr.length; ) {
			if(arr[i] != i+1)
				swap(arr, i);
			else
				i++;
		}
	}
	
	static void swap(int[] arr, int idx){
		int temp = arr[idx];
		arr[idx] = arr[temp-1];
		arr[temp-1] = temp;
	}
}