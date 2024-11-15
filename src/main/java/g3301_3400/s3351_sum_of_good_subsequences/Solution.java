package g3301_3400.s3351_sum_of_good_subsequences;

// #Hard #Array #Hash_Table #Dynamic_Programming
// #2024_11_15_Time_13_ms_(99.09%)_Space_55.8_MB_(68.79%)

public class Solution {
    public int sumOfGoodSubsequences(int[] nums) {
        int max = 0;
        for (int x : nums) {
            max = Math.max(x, max);
        }
        long[] count = new long[max + 3];
        long[] total = new long[max + 3];
        long mod = (int) (1e9 + 7);
        long res = 0;
        for (int a : nums) {
            count[a + 1] = (count[a] + count[a + 1] + count[a + 2] + 1) % mod;
            long cur = total[a] + total[a + 2] + a * (count[a] + count[a + 2] + 1);
            total[a + 1] = (total[a + 1] + cur) % mod;
            res = (res + cur) % mod;
        }
        return (int) res;
    }
}
