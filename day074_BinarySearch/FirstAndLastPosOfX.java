import java.util.Arrays;

public class FirstAndLastPosOfX {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(solve(arr, target)));
    }

    private static int[] solve(int[] arr, int target){
        int[] ans = {-1,1};

        ans[0] = search(arr, target, true);
        if(ans[0] != -1)
            ans[1] = search(arr, target, false);
        
        return ans;
    }

    private static int search(int[] arr, int target, boolean findStartIndex){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = mid;
                if(findStartIndex)
                    end = mid -1;
                else
                    start = mid+1;
            }else if(target > arr[mid] )
                start = mid+1;
            else
                end = mid - 1;
        }

        return ans;
    }
}
