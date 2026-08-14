// Last updated: 8/14/2026, 2:32:49 PM
class Solution {
public:
    vector<vector<int>> modifiedMatrix(vector<vector<int>>& matrix) {
        int m = matrix.size(), n = matrix[0].size();
        vector<int> colMax(n, INT_MIN);

        // First pass: compute column maxima
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                colMax[j] = max(colMax[j], matrix[i][j]);
            }
        }

        // Second pass: replace -1 with column max
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = colMax[j];
                }
            }
        }
        return matrix;
    }
};
