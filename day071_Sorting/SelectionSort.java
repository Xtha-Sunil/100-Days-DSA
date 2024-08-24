
import java.util.Arrays;

public class SelectionSort {
    private static void selectionSort(int[] arr){
        int len = arr.length - 1;
        for(int i=0; i<len; i++){
            int last = len - i;
            int idx = selection(arr, 0, last);
            swap(arr, idx, last);
        }
    }

    private static int selection(int[] arr, int start, int end){
        int max = start;
        for(int i=start + 1; i<end; ++i){
            if(arr[i] > arr[max])
                max = i;
        }
        return max;
    }

    private static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {8,9,19,-12,0,7,8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
