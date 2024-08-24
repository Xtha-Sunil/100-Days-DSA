import java.util.Arrays;


public class CyclicSort{
    private static void cyclicSort(int[] arr){
        int i = 0;

        while (i<arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
    }
    private static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        cyclicSort(arr);

        System.out.println(Arrays.toString(arr));

    }
}