package g2801_2900.s2897_apply_operations_on_array_to_maximize_sum_of_squares;

// #Hard #Array #Hash_Table #Greedy #Bit_Manipulation
// #2023_12_20_Time_29_ms_(98.00%)_Space_63.8_MB_(14.00%)

import java.util.List;

public class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] bits = new int[32];
        for (int n : nums) {
            for (int i = 0; i < 32; ++i) {
                bits[i] += (n >> i) & 1;
            }
        }
        int mod = 1_000_000_007;
        long sum = 0;
        for (int i = 0; i < k; ++i) {
            long n = 0;
            for (int j = 0; j < 32; ++j) {
                if (bits[j] > i) {
                    n |= 1 << j;
                }
            }
            sum = (sum + n * n % mod) % mod;
        }
        return (int) sum;
    }
}
