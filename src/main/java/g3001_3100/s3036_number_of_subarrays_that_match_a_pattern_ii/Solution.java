package g3001_3100.s3036_number_of_subarrays_that_match_a_pattern_ii;

// #Hard #Array #Hash_Function #String_Matching #Rolling_Hash
// #2024_03_01_Time_5_ms_(98.27%)_Space_172.1_MB_(75.77%)

public class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int n = nums.length;
        int m = pattern.length;
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                arr[i] = 1;
            } else if (nums[i + 1] < nums[i]) {
                arr[i] = -1;
            }
        }
        int hash = 0;
        int pHash = 0;
        int base = 1;
        for (int i = 0; i < m; i++) {
            hash = hash * 3 + arr[i] + 1;
            pHash = pHash * 3 + pattern[i] + 1;
            base *= 3;
        }
        int count = 0;
        for (int i = 0; i <= n - 1 - m; i++) {
            if (hash == pHash) {
                count++;
            }

            if (i < n - 1 - m) {
                hash = hash * 3 - base * (arr[i] + 1) + arr[i + m] + 1;
            }
        }
        return count;
    }
}
