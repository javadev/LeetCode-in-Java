package g0901_1000.s0995_minimum_number_of_k_consecutive_bit_flips;

// #Hard #Array #Bit_Manipulation #Prefix_Sum #Sliding_Window
// #2022_03_31_Time_6_ms_(93.95%)_Space_50.3_MB_(97.13%)

public class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int[] pref = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (nums[i] == 0) {
                    pref[i]++;
                }
            } else {
                pref[i] = pref[i - 1];
                int flips = pref[i] - (i - k >= 0 ? pref[i - k] : 0);
                if (flips % 2 == nums[i]) {
                    if (i + k > n) {
                        return -1;
                    }
                    pref[i]++;
                }
            }
        }
        return pref[n - 1];
    }
}
