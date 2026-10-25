class Solution {
    public void duplicateZeros(int[] arr) {
        int newarr[] = new int[arr.length];
        int arrcount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (arrcount < arr.length) {
                    newarr[arrcount] = 0;
                    arrcount++;
                }

                if (arrcount < arr.length) {
                    newarr[arrcount] = 0;
                    arrcount++;
                }
            } else {
                if (arrcount < arr.length) {
                    newarr[arrcount] = arr[i];
                    arrcount++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = newarr[i];
        }
    }
}