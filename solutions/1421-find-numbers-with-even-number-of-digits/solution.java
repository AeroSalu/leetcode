class Solution {

    public int findNumbers(int[] nums) {

        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {

            int count1 = 0;
            int ans = nums[i];

            while (ans != 0) {

                ans = ans / 10;
                count1++;
            }

            if (count1 % 2 == 0) {
                count2++;
            }
        }

        return count2;
    }
}
