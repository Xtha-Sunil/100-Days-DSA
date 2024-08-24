public class RotatedArrayWithDupes {
    public static void main(String[] args) {
        int[] arr = {9,4,4,7,8,9};
        int target = 4;

        int pivot = getPeak(arr);
        int idx;
        
        // if pivot is not found then the array is not rotated
        if(pivot == -1){
            idx = binarySearch(arr, target, 0, arr.length);
        }
        else if(arr[pivot] == target){
            idx = pivot;
        } else if(arr[0] > target){
            idx = binarySearch(arr, target, pivot + 1, arr.length -1 );
        }else{
            idx = binarySearch(arr, target, 0, pivot);
        }

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
            
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip dupes after check if they are pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                if(arr[end] <arr[end -1]){
                    return end -1;
                }
                end--;
            }

            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }

        return -1;
    }
}
