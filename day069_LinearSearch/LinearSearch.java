public class LinearSearch{
    private static int linearSearch(int[] arr,int  target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int target = 6;

        int idx = linearSearch(arr, target);                        
        
        if(idx != -1){
        } else{
            System.out.println("target does not exist in array ");
        }
    }
}