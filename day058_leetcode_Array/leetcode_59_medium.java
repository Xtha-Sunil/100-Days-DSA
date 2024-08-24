// 59. Spiral Matrix II
// https://leetcode.com/problems/spiral-matrix

class Solution {
    public int[][] generateMatrix(int n) {
        int k=1;
        int left = 0, top = 0;
        int right = n - 1;
        int bottom = n - 1;

        while (top <= bottom && left <= right) {
            // top => left to right
            for (int i = left; i <= right; i++)
                matrix[top][i]=k++;
            top++;

            // right => top to bottom
            for (int i = top; i <= bottom; i++)
                matrix[i][right]=k++;
            right--;

            // bottom => right to left
            if (top <= bottom) {
                for (int i = right; i >= left; --i)
                    matrix[bottom][i]=k++;
                bottom--;
            }

            // left => bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; --i)
                    matrix[i][left] = k++;
                left++;
            }
        }

        return list;
    }
}