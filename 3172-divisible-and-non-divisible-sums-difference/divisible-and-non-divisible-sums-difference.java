class Solution {
    public int differenceOfSums(int n, int m) {
      int nondiv=0;
      int div=0;
      for(int i=0;i<=n;i++)
      {
        if(i%m!=0)
        {
            nondiv+=i;
        }
        else
        {
            div+=i;
        }
      }
      return nondiv-div;

    }
}