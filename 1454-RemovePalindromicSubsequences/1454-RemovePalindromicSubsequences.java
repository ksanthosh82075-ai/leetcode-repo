// Last updated: 8/14/2026, 2:33:12 PM
class Solution {
    public int removePalindromeSub(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return 2;
            }
            left++;
            right--;
        }

        return 1;
    }
}