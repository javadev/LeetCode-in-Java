package g3801_3900.s3862_find_the_smallest_balanced_index;

// #Medium #Array #Prefix_Sum #Senior #Weekly_Contest_492
// #2026_07_27_Time_3_ms_(100.00%)_Space_143.54_MB_(51.17%)

public class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long lsum = 0;
        for (int x : nums) {
            lsum += x;
        }
        long rprod = 1;
        for (int i = nums.length - 1; i >= 0; --i) {
            lsum -= nums[i];
            if (lsum == rprod) {
                return i;
            }
            if (rprod > lsum / nums[i]) {
                break;
            }
            rprod *= nums[i];
        }
        return -1;
    }
}
