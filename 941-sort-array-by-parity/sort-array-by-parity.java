class Solution {
    public int[] sortArrayByParity(int[] nums) {
    int[] arr= new int[nums.length];
    int leftcnt=0;
    int rightcnt=nums.length-1;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]%2==0)
        {
            arr[leftcnt]=nums[i];
            leftcnt++;
        }
        else
        {
            arr[rightcnt]=nums[i];
            rightcnt--;
        }
    }
    return arr;
    }
}