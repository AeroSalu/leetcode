
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLucky(int[] arr) {
        int result = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                result = Math.max(result, entry.getKey());
            }
        }

        return result;
    }
}
