import java.util.Arrays;

public class InsertionSort{
    private static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) 
            for (int j = i+1; j >0 ; --j) 
                if(arr[j] < arr[j-1])
                    swap(arr, j, j-1);
                else
                    break;
    }
    private static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {8,9,19,-12,0,7,8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}