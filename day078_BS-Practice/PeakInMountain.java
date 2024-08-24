public class PeakInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,0};
        int idx = findPeak(arr);

        System.out.println(idx);
    }   

    private static int findPeak(int[] arr){
        int s = 0;
        int e =arr.length - 1;

        while(s<e){
            int m = s+(e-s)/2;

            if(arr[m] > arr[m+1]){
                e = m;
            }else{
                s=m+1;
            }
        }
        return s;
    }
}
