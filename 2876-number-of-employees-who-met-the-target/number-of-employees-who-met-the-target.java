class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int cnt=0;
        for(int i=0;i<hours.length;i++)
        {
            if(target<=hours[i])
            cnt++;
        }
        return cnt;
    }
}