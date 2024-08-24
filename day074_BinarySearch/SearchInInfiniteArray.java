public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr= {2,3,5,6,7,8,10,11,12,13,15,21,29,30,40,44,45,55,84};
        int target = 21;
        System.out.println(solve(arr, target));
    }

    private static int solve(int[] arr, int target){
        // find the range first;; start with window size 2
        int start = 0;
        int end = 1;

        // doubling the size of window till last element in window is smaller than target
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }
    // simple BS
    private static int binarySearch(int[] arr, int target, int start, int end){
        while(start<= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid])
                return mid;
            else if(target > arr[mid]) 
                start = mid +1;
            else 
                end = mid - 1;
        }

        return -1;
    }
}
