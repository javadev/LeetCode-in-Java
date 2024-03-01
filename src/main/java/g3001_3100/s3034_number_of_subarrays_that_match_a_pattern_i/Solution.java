package g3001_3100.s3034_number_of_subarrays_that_match_a_pattern_i;

// #Medium #Array #Hash_Function #String_Matching #Rolling_Hash
// #2024_03_01_Time_1_ms_(100.00%)_Space_43.9_MB_(97.20%)

public class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int n = nums.length;
        int m = pattern.length;
        int count = 0;
        for (int i = 0; i <= n - m - 1; i++) {
            int k = 0;
            while (k < m) {
                if (nums[i + k + 1] > nums[i + k] && pattern[k] == 1) {
                    k++;
                } else if (nums[i + k + 1] == nums[i + k] && pattern[k] == 0) {
                    k++;
                } else if (nums[i + k + 1] < nums[i + k] && pattern[k] == -1) {
                    k++;
                } else {
                    break;
                }
            }
            if (k == m) {
                count++;
            }
        }
        return count;
    }
}
