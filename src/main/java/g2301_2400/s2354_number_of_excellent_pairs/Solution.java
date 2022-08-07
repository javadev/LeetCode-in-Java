package g2301_2400.s2354_number_of_excellent_pairs;

// #Hard #Array #Hash_Table #Binary_Search #Bit_Manipulation
// #2022_08_07_Time_80_ms_(86.77%)_Space_109.2_MB_(29.50%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public long countExcellentPairs(int[] nums, int k) {
        long[] cnt = new long[30];
        long res = 0L;
        Set<Integer> set = new HashSet<>();
        for (int a : nums) {
            set.add(a);
        }
        for (int a : set) {
            cnt[Integer.bitCount(a)]++;
        }
        for (int i = 1; i < 30; ++i) {
            for (int j = 1; j < 30; ++j) {
                if (i + j >= k) {
                    res += cnt[i] * cnt[j];
                }
            }
        }
        return res;
    }
}
