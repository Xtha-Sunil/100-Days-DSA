package day017;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,0,3,1,2,-8,-7,12};
        selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr, int i, int j, int max){
        if(i == 0) return;

        if(j<i){
            if(arr[j]>arr[max]){
                selection(arr, i,j+1,j);
            }else{
                selection(arr, i, j+1, max);
            }
        }else{
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            selection(arr, i-1, 0, 0);
        }
    }
}
