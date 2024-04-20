package g3101_3200.s3101_count_alternating_subarrays;

// #Medium #Array #Math #2024_04_20_Time_3_ms_(97.51%)_Space_56.4_MB_(31.27%)

public class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        long count = 0;
        long length;
        int start = 0;
        int end = 1;
        while (end < nums.length) {
            if (nums[end] != nums[end - 1]) {
                end++;
            } else {
                length = end - (long) start;
                count += (length * (length + 1)) / 2;
                start = end;
                end++;
            }
        }
        length = end - (long) start;
        count += (length * (length + 1)) / 2;
        return count;
    }
}
