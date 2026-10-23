
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int[] rightsum = new int[n];
        int[] leftsum = new int[n];
        int[] ans = new int[n];

        leftsum[0] = 0;
        rightsum[n - 1] = 0;

        for (int i = 1; i < n; i++) {
            leftsum[i] = leftsum[i - 1] + nums[i - 1];
            rightsum[n - 1 - i] = rightsum[n - i] + nums[n - i];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(leftsum[i] - rightsum[i]);
        }

        return ans;
    }
}
