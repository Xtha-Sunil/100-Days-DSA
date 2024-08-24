import java.util.Arrays;
public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}};
        int target = 10;

        int[] idx = searchSortedMatrix(matrix, target);
        System.out.println(Arrays.toString(idx));
    }
    private static int[] searchInRow(int[][] matrix, int row, int colStart, int colEnd, int target){
        while(colStart <= colEnd){
            int mid = colStart + (colEnd - colStart)/2;

            if(matrix[row][mid] == target)
                return new int[]{row,mid};
            else if(matrix[row][mid] < target)
                colStart = mid +1;
            else
                colEnd = mid - 1;
        }
        return new int[]{-1,-1};
    }
    private static int[] searchSortedMatrix(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1)
            return searchInRow(matrix, 0, 0, cols - 1, target);
        
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;

        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart)/2;
            
            if(matrix[mid][cMid] == target)
                return new int[]{mid, cMid};
            
            if(matrix[mid][cMid] < target)
                rStart = mid;
            else
                rEnd = mid;
        }

        if(matrix[rStart][cMid] == target)
            return new int[]{rStart, cMid};
        if(matrix[rStart+1][cMid] == target)
            return new int[]{rStart + 1, cMid};

        if(target <= matrix[rStart][cMid - 1])
            return searchInRow(matrix, rStart, 0, cMid - 1, target);
        
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1])
            return searchInRow(matrix, rStart, cMid + 1, cols-1, target);
        
        if(target <= matrix[rStart+1][cMid- 1])
            return searchInRow(matrix, rStart+1, 0, cMid - 1, target);
        
        return searchInRow(matrix, rStart+1, cMid + 1,cols-1, target);
        }
}
