class Solution {
    public String reversePrefix(String word, char ch) {
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                String sub = word.substring(0, i+1);
                String rev= new StringBuilder(sub).reverse().toString();
                String ans= rev+ word.substring(i+1,word.length());
                return ans;
            }
        }
        return word;
    }
}
