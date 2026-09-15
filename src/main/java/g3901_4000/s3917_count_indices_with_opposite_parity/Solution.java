package g3901_4000.s3917_count_indices_with_opposite_parity;

// #Easy #Array #Mid_Level #Weekly_Contest_500
// #2026_09_15_Time_1_ms_(100.00%)_Space_46.74_MB_(66.61%)

public class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int odd = 0;
        int even = 0;
        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if ((nums[i] & 1) == 1) {
                result[i] = even;
                odd++;
            } else {
                result[i] = odd;
                even++;
            }
        }
        return result;
    }
}
