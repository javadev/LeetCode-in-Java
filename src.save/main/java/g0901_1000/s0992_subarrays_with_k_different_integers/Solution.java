package g0901_1000.s0992_subarrays_with_k_different_integers;

// #Hard #Array #Hash_Table #Counting #Sliding_Window
// #2022_03_31_Time_4_ms_(99.36%)_Space_46.2_MB_(86.91%)

public class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int res = 0;
        int prefix = 0;
        int[] cnt = new int[nums.length + 1];
        int i = 0;
        int j = 0;
        int uniqueCount = 0;
        while (i < nums.length) {
            if (cnt[nums[i]]++ == 0) {
                uniqueCount++;
            }
            if (uniqueCount > k) {
                --cnt[nums[j++]];
                prefix = 0;
                uniqueCount--;
            }
            while (cnt[nums[j]] > 1) {
                ++prefix;
                --cnt[nums[j++]];
            }
            if (uniqueCount == k) {
                res += prefix + 1;
            }
            i++;
        }
        return res;
    }
}
