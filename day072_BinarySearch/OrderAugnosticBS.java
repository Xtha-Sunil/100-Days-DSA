package day005;

public class OrderAugnosticBS {
    private static int orderAugnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1 ;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
                return mid;
        
            if(isAsc){
                if(target < arr[mid])
                    end = mid;
                else
                    start = mid + 1;
            } else {
                if(target > arr[mid])
                    end = mid;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 12, 23, 26, 37, 40, 45, 50};
        int idx = orderAugnosticBS(arr, 26);
        System.out.println(idx);
    }
}
