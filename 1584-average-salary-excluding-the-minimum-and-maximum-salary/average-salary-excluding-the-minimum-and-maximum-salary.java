
class Solution {
    public double average(int[] salary) {
        int maxi = salary[0];
        int mini = salary[0];
        int totalSalary = 0;

        for (int i = 0; i < salary.length; i++) {
            totalSalary += salary[i];
            maxi = Math.max(maxi, salary[i]);
            mini = Math.min(mini, salary[i]);
        }

        return (double) (totalSalary - maxi - mini) / (salary.length - 2);
    }
}
