package g0601_0700.s0697_degree_of_an_array;

// #Easy #Array #Hash_Table #Udemy_Arrays #2022_03_22_Time_14_ms_(93.19%)_Space_55.9_MB_(11.41%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static class Value {
        int count;
        int start;
        int end;

        public Value(int c, int s, int e) {
            count = c;
            start = s;
            end = e;
        }
    }

    public int findShortestSubArray(int[] nums) {
        int max = 1;
        Map<Integer, Value> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j = nums[i];
            if (map.containsKey(j)) {
                Value v = map.get(j);
                v.count++;
                max = Math.max(max, v.count);
                v.end = i;
            } else {
                map.put(j, new Value(1, i, i));
            }
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Value> entry : map.entrySet()) {
            Value v = entry.getValue();
            if (v.count == max) {
                min = Math.min(min, v.end - v.start);
            }
        }
        return min + 1;
    }
}
