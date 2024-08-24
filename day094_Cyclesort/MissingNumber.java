public class MissingNumber {
    private static int findMissing(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]) 
                swap(arr, i, correct);
            else
                i++;
        }

        for(i=0;i<arr.length;i++){
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }
    private static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,0,2,1,3};
        int missing = findMissing(arr);
        System.out.println(missing);
    }
}
