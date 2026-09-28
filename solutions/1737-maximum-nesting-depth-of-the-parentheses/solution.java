class Solution {
    public int maxDepth(String s) 
    {
        int maxcount=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            count++;
            if(s.charAt(i)==')')
            count--;
            if(maxcount<count)
            maxcount=count;
        }
        return maxcount;
    }
}
