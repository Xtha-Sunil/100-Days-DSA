public class RotatedArray {
    public static void main(String[] args) {
        int[] arr ={7,1,3,5};
        int idx = getK(arr);

        System.out.println(idx + 1 + " cycle(s)");
    }
    private static int getK(int[] arr){
        int s =  0;
        int e = arr.length -1;
        while(s<= e){
            int mid = s + (e-s)/2;

            if(arr[mid] > arr[mid+1] && mid < e){
                return mid;
            } else if(arr[mid] < arr[mid-1] && mid > s)
                return mid-1;

            if(arr[mid] <= arr[s]){
                e = mid - 1;
            } else 
                s = mid + 1;
        }
        return -1;
    }
}
