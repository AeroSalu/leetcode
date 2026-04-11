class Solution {
    public int searchInsert(int[] nums, int target) {
        int lower=0;
        int upper=nums.length-1;
        while(upper>=lower)
        {
            int mid=(upper+lower)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                upper=mid-1;
            else
                lower=mid+1;
        }
        return lower;
    }
}
