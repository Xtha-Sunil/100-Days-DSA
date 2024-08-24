public class DupicateInArray {
    private static int findDup(int[] arr){
        int i = 0;
        while (i<arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
        return arr[arr.length-1];
    }

    private static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,1,2,2,4,3};
        int dup = findDup(arr);
        System.out.println(dup);
        for (int i : arr) System.out.print(i + ", ");
    }
}
