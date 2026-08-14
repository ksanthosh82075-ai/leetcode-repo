// Last updated: 8/14/2026, 2:34:35 PM
class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            result.append(c);
        }

        return result.toString();
    }
}