package g0901_1000.s0992_subarrays_with_k_different_integers;

// #Hard #Array #Hash_Table #Sliding_Window #Counting

public class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int res = 0, prefix = 0;
        int[] cnt = new int[nums.length + 1];
        for (int i = 0, j = 0, unique_count = 0; i < nums.length; i++) {
            if (cnt[nums[i]]++ == 0) {
                unique_count++;
            }
            if (unique_count > k) {
                --cnt[nums[j++]];
                prefix = 0;
                unique_count--;
            }
            while (cnt[nums[j]] > 1) {
                ++prefix;
                --cnt[nums[j++]];
            }
            if (unique_count == k) {
                res += prefix + 1;
            }
        }
        return res;
    }
}
