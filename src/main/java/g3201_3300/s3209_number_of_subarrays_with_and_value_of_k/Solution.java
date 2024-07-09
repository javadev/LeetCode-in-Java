package g3201_3300.s3209_number_of_subarrays_with_and_value_of_k;

// #Hard #Array #Binary_Search #Bit_Manipulation #Segment_Tree
// #2024_07_09_Time_7_ms_(100.00%)_Space_62.9_MB_(11.74%)

public class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            for (int j = i - 1; j >= 0 && (nums[j] & x) != nums[j]; j--) {
                nums[j] &= x;
            }
            while (left <= i && nums[left] < k) {
                left++;
            }
            while (right <= i && nums[right] <= k) {
                right++;
            }
            ans += right - left;
        }
        return ans;
    }
}
