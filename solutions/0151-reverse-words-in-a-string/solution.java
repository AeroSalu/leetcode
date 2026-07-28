class Solution {
    public String reverseWords(String s) {

        s = s.trim();

        String ans = "";
        String word = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ') {
                word = s.charAt(i) + word;
            } else if (!word.equals("")) {
                ans += word + " ";
                word = "";

                while (i > 0 && s.charAt(i - 1) == ' ') {
                    i--;
                }
            }
        }

        ans += word;

        return ans;
    }
}
