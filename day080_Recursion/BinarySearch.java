package day013;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,12,14,18,23};
        int target = 23;

        int idx = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(idx);
    }

    private static int binarySearch(int[] arr, int target, int start, int end){
        if(start > end) return -1;
        
        int mid = start + (end - start)/2;
        if(arr[mid] == target) return mid;

        if(target < arr[mid])
            return binarySearch(arr, target, start, mid -1);
        else
            return binarySearch(arr, target, mid+1, end);            
    }
}
