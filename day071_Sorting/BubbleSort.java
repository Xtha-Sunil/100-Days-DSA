import java.util.Arrays;

public class BubbleSort {
    private static void bubbleSort(int[] arr){
        if (arr.length <= 1) return;

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false; 
            for(int j=1; j<=arr.length - i -1; j++)
                if(arr[j] <  arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            if(!swapped) break;
        }
    }

    public static void main(String[] args){
        int[] arr = {4,5,1,3,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}