package g2901_3000.s2963_count_the_number_of_good_partitions;

// #Hard #Array #Hash_Table #Math #Combinatorics
// #2024_01_16_Time_30_ms_(80.04%)_Space_64.3_MB_(30.54%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numberOfGoodPartitions(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            mp.put(nums[i], i);
        }
        int i = 0;
        int j = 0;
        int cnt = 0;
        while (i < n) {
            j = Math.max(j, mp.get(nums[i]));
            if (i == j) {
                cnt++;
            }
            i++;
        }
        int res = 1;
        for (int k = 1; k < cnt; k++) {
            res = res * 2;
            int mod = 1000000007;
            res %= mod;
        }
        return res;
    }
}
