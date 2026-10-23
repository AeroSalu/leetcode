class Solution {
    public char findTheDifference(String s, String t) {
        int start=0;
        int end=0;
        for (int i = 0; i < s.length(); i++) 
        {
       start += s.charAt(i);
        }
         for (int j = 0; j < t.length(); j++) 
        {
        end += t.charAt(j);
        }
        int fin = end-start;
        char c = (char) fin;
        return c;
    }

}
