package day019;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8,3,21,-10,4,12,0,-1,15,-6,5,6};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }

    private static void quicksort(int[] arr,int low, int high){
        if(low >= high) return;

        int s = low;
        int e =high;
        int mid = s+(e-s)/2;
        int pivot = arr[mid];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }

            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quicksort(arr, low, e);
        quicksort(arr, s, high);
    }
}
