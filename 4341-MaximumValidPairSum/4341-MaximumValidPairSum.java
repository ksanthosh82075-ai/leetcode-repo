// Last updated: 8/14/2026, 2:32:33 PM
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n=nums.length;
        int mv=-1;
        int pm=Integer.MIN_VALUE;
        for(int j=k;j<n;j++){
            pm=Math.max(pm,nums[j-k]);
            mv=Math.max(mv,pm+nums[j]);
        }
        return mv;
        
        
    }
}