package g2301_2400.s2302_count_subarrays_with_score_less_than_k;

// #Hard #Array #Binary_Search #Prefix_Sum #Sliding_Window
// #2022_06_16_Time_4_ms_(88.77%)_Space_104.2_MB_(27.29%)

public class Solution {
    public long countSubarrays(int[] nums, long k) {
        long sum = 0;
        long count = 0;
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            sum += nums[i];
            while (sum * (i - j + 1) >= k) {
                sum -= nums[j++];
            }
            count += i++ - j + 1;
        }
        return count;
    }
}
