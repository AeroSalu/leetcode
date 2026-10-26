class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maximum = arr[i + 1];

            for (int j = i + 1; j < arr.length; j++) {
                maximum = Math.max(maximum, arr[j]);
            }

            arr[i] = maximum;
        }

        arr[arr.length - 1] = -1;

        return arr;
    }
}