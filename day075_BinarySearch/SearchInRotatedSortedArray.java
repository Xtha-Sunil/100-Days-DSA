public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {7,8,9,10,0,1,2,3,4,5,6};
        int target = 4;

        int pivot = getPeak(arr);
        int idx;
        
        // if pivot is not found then the array is not rotated
        if(pivot == -1)
            idx = binarySearch(arr, target, 0, arr.length);
        else if(arr[pivot] == target)
            idx = pivot;
         else if(arr[0] > target)
            idx = binarySearch(arr, target, pivot + 1, arr.length -1 );
        else
            idx = binarySearch(arr, target, 0, pivot);
        
        System.out.println(idx);
    }

    private static int binarySearch(int[] arr, int target, int start, int end){
        while(start<= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                end = mid -1;
            else
                start = mid + 1;
        }
        return -1;
    }

    // get peak in rotated sorted array
    private static int getPeak(int[] arr){
        int start = 0;
        int end = arr.length -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            } else if(mid > start && arr[mid] < arr[mid - 1] ){
                return mid - 1 ;
            }
            
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
