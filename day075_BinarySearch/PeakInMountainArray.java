public class PeakInMountainArray{
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4, 5,6,4,3,2};        // no duplicates

        int idx = getPeakIndex(arr);
        System.out.println(idx);
    }
    private static int getPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start )/2;

            // decreasing part
            if(arr[mid] > arr[mid + 1])
                end = mid;
            //increasing part so increase left pointer
            else 
                start = mid + 1;
        }
        // loop breaks when start == end == mid
        return start;
    }
}