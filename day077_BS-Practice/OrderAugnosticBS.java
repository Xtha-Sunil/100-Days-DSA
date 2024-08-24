package day010;

public class OrderAugnosticBS {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,4,1};
        int target = 6;

        int idx = orderAugnosticBS(arr, target);
        System.out.println(idx);
    }

    private static int orderAugnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[0] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
                return mid;
            
            if(isAsc){
                if(arr[mid]>target){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            } else {
                if(arr[mid]<target){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }
        }

        return -1;
    }
}
