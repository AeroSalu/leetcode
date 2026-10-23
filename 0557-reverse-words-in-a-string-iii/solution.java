class Solution {
    public String reverseWords(String s) {
        String[] words= s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for(String word:words)
        {
            StringBuilder revword= new StringBuilder(word);
            revword.reverse();
            reversed.append(revword).append(" ");
        }
        return reversed.toString().trim();
    }
}
