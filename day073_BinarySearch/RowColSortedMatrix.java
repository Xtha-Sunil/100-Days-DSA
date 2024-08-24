import java.util.Arrays;
public class RowColSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,44},
            {33,34,38,50}
        };
        int target = 33;
        int[] idx = search(arr, target);
        System.out.println(Arrays.toString(idx));
    }
    private static int[] search(int[][] arr, int target){
        int row = 0, col = arr[row].length - 1;
        while(col>=0 && row<arr.length){
            if(arr[row][col] == target)
                return new int[]{row, col};
            else if(arr[row][col] < target)
                row++;
            else
                col--;
        }
        return new int[]{-1,-1};
    }
}