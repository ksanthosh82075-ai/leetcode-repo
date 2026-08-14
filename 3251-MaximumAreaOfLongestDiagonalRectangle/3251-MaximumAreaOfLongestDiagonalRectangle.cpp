// Last updated: 8/14/2026, 2:32:55 PM
class Solution {
public:
    int areaOfMaxDiagonal(vector<vector<int>>& dimensions) {
        double maxDiag = 0;
        int maxArea = 0;
        
        for (auto &d : dimensions) {
            int l = d[0], w = d[1];
            double diag = sqrt((double)l * l + (double)w * w);
            int area = l * w;
            
            if (diag > maxDiag || (fabs(diag - maxDiag) < 1e-9 && area > maxArea)) {
                maxDiag = diag;
                maxArea = area;
            }
        }
        return maxArea;
    }
};
