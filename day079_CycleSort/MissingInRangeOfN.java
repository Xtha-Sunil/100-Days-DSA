package day012;
public class MissingInRangeOfN {
    public static void main(String[] args) {
        int[] arr = {4,0,5,2,1};
        cyclesort(arr, arr.length);
        int missingNumber = findMissing(arr, arr.length);
        System.out.println(missingNumber);
    }
    private static void cyclesort(int[] arr, int n){
        for(int i=0; i<n; i++){
            if(arr[i]==n) continue;

            if(arr[i] != i){
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp; 
            }
        }
    }
    private static int findMissing(int[] arr, int n){
        for(int i=0;i<n-1; ++i)
            if(arr[i] != i) return i;
        return n;
    }
}
