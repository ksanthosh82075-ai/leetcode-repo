// Last updated: 8/14/2026, 2:33:34 PM
class Solution {
public:
    vector<int> decompressRLElist(vector<int>& nums) {
        vector<int> res;
        for (int i = 0; i < nums.size(); i += 2) {
            int freq = nums[i], val = nums[i + 1];
            res.insert(res.end(), freq, val);
        }
        return res;
    }
};
