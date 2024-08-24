package day018;
import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,21,-10,4,12,0,-1,15,-6,5,6};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortInPlace(int[] arr, int s, int e){
        if(e-s == 1) return;

        int mid = s + (e-s)/2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        merge(arr, s, mid, e);
    }

    private static void merge(int[] arr, int s, int m, int e){
        int[] ans = new int[e-s];

        int i=s;
        int j=m;
        int k =0;

        while(i<m && j<e){
            if(arr[i] < arr[j]){
                ans[k] = arr[i];
                i++;
            }else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            ans[k] = arr[i];
            i++;
            k++;
        }

        while(j<e){
            ans[k] = arr[j];
            j++;
            k++;
        }

        System.arraycopy(ans, 0, arr, s, ans.length);
    }
}
