// Last updated: 8/14/2026, 2:32:44 PM
import java.util.Arrays;

class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        long sum = 0;
        long ans = -1;

        for (int num : nums) {
            if (num < sum) {
                ans = sum + num;
            }
            sum += num;
        }

        return ans;
    }
}