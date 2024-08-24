public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,17, 18};
        int target = 15;

        // find number just gerater or equal to target
        int idx = ceilingOfNumber(arr, target);
        System.out.println(idx);
    }

    private static int ceilingOfNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = arr[end];

        while(start <=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target)
                return arr[mid];
            
            if(arr[mid] < target)
                start = mid+1;
            else{
                end = mid -1;
                ans = Math.min(ans, arr[mid]);
            }
        }
        return ans;
    }
}

// for floor of number
// while(start <=end){
//     int mid = start + (end - start)/2;
//     if(arr[mid]==target)
//         return arr[mid];

//     if(arr[mid] < target){
//         start = mid+1;
//         ans = Math.max(ans, arr[mid]);
//     }
//     else{
//         end = mid -1;
//     }
// }