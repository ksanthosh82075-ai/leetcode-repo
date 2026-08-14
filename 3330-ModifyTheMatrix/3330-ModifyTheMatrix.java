// Last updated: 8/14/2026, 2:32:42 PM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] maxInCol = new int[cols];

        // Find the maximum value in each column
        for (int j = 0; j < cols; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < rows; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            maxInCol[j] = max;
        }

        // Replace -1 with the maximum of its column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = maxInCol[j];
                }
            }
        }

        return matrix;
    }
}