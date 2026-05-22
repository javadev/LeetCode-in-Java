package g3701_3800.s3784_minimum_deletion_cost_to_make_all_characters_equal;

// #Medium #Array #String #Hash_Table #Enumeration #Senior #Weekly_Contest_481
// #2026_05_22_Time_3_ms_(94.77%)_Space_104.58_MB_(97.09%)

public class Solution {
    public long minCost(String s, int[] cost) {
        long[] arr = new long[26];
        long m = Integer.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += cost[i];
        }
        for (long i : arr) {
            if (i > m) {
                m = i;
            }
            sum += i;
        }
        return sum - m;
    }
}
