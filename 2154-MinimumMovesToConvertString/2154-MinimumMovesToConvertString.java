// Last updated: 8/14/2026, 2:33:04 PM
class Solution {
    public int minimumMoves(String s) {
        int count = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                count++;
                i += 3;
            } else {
                i++;
            }
        }

        return count;
    }
}