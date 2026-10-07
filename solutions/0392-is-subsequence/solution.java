class Solution {
    public boolean isSubsequence(String s, String t) {
        int spointer = 0;
        for (int i = 0; i < t.length() && spointer < s.length(); i++) {
            if (t.charAt(i) == s.charAt(spointer)) {
                spointer++;
            }
        }
        return spointer == s.length();
    }
}
