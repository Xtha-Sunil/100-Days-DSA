package day005;

public class BinarySearch {
    private static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // int mid = (start + end) / 2; // this may  give range overflow
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
                return mid;
                
            // target sano => search left half
            else if(target < arr[mid])
                end = mid;
            
            // target thulo => search right half
            else
                start = mid + 1;
        }

        // Not found
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 8, 12, 23, 26, 37, 40, 45, 50};
        int idx = binarySearch(arr, 40);
        System.out.println(idx);
    }
}
