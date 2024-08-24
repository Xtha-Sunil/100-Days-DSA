// 54. Spiral Matrix I
// https://leetcode.com/problems/spiral-matrix

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int left = 0, top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        while (top <= bottom && left <= right) {
            // top => left to right
            for (int i = left; i <= right; i++)
                list.add(matrix[top][i]);
            top++;

            // right => top to bottom
            for (int i = top; i <= bottom; i++)
                list.add(matrix[i][right]);
            right--;

            // bottom => right to left
            if (top <= bottom) {
                for (int i = right; i >= left; --i)
                    list.add(matrix[bottom][i]);
                bottom--;
            }

            // left => bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; --i)
                    list.add(matrix[i][left]);
                left++;
            }
        }

        return list;
    }
}