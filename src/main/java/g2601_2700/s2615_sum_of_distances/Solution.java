package g2601_2700.s2615_sum_of_distances;

// #Medium #Array #Hash_Table #Prefix_Sum #2023_08_30_Time_13_ms_(100.00%)_Space_70.4_MB_(43.45%)

import java.util.HashMap;

public class Solution {
    public long[] distance(int[] nums) {
        HashMap<Integer, long[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            long[] temp = map.computeIfAbsent(nums[i], k -> new long[4]);
            temp[0] += i;
            temp[2]++;
        }
        long[] ans = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            long[] temp = map.get(nums[i]);
            ans[i] += i * temp[3] - temp[1];
            temp[1] += i;
            temp[3]++;
            ans[i] += temp[0] - temp[1] - i * (temp[2] - temp[3]);
        }
        return ans;
    }
}
