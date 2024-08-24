package day012;
import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {4,5,3,1,2};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cycleSort(int[] arr){
        for(int i=0; i<arr.length ;){
            if(arr[i] != i+1)
                swap(arr,i);
             else
                i++;
        }
    }
    private static void swap(int[] arr, int idx){
        int temp  = arr[idx];
        arr[idx] = arr[temp-1];
        arr[temp-1] = temp;
    }
}
