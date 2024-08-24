public class SpiltArrayLargestSum {
    public static void main(String[] args) {
        int[] arr =  {7,2,5,8,10,90};
        int m = 3;

        int sum = findMinimalMaxSum(arr, m);
        System.out.println(sum); // 18 for this testcase 
    }

    private static int findMinimalMaxSum(int[] arr, int m){
        int start=arr[0], end=0;
        for(int num : arr){
            start = Math.max(start, num);
            end += num;
        }

        while(start < end){
            int mid = start + (end - start)/2;

            int part = 1, currSum = 0;

            for (int num : arr) {
                if(currSum + num > mid){
                    currSum = num;
                    part++;
                } else {
                    currSum += num;
                }
            }

            if(part > m){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
