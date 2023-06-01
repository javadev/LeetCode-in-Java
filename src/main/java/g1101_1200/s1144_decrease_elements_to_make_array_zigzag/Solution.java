package g1101_1200.s1144_decrease_elements_to_make_array_zigzag;

// #Medium #Array #Greedy #2023_06_01_Time_0_ms_(100.00%)_Space_40.2_MB_(45.78%)

public class Solution {
    public int movesToMakeZigzag(int[] nums) {
        int ans;
        int n = nums.length;
        int cur = 0;
        if (n == 1) {
            return 0;
        }
        int[] clone = nums.clone();
        for (int i = 0; i < n; i += 2) {
            if (i == 0) {
                if (nums[i] <= nums[i + 1]) {
                    cur += (nums[i + 1] - nums[i] + 1);
                    nums[i + 1] = nums[i] - 1;
                }
            } else if (i == n - 1) {
                if (nums[i] <= nums[i - 1]) {
                    cur += (nums[i - 1] - nums[i] + 1);
                }
            } else {
                if (nums[i] <= nums[i + 1]) {
                    cur += (nums[i + 1] - nums[i] + 1);
                    nums[i + 1] = nums[i] - 1;
                }
                if (nums[i] <= nums[i - 1]) {
                    cur += (nums[i - 1] - nums[i] + 1);
                }
            }
        }
        ans = cur;
        cur = 0;
        nums = clone;
        for (int i = 1; i < n; i += 2) {
            if (i != n - 1 && nums[i] <= nums[i + 1]) {
                cur += (nums[i + 1] - nums[i] + 1);
                nums[i + 1] = nums[i] - 1;
            }

            if (nums[i] <= nums[i - 1]) {
                cur += (nums[i - 1] - nums[i] + 1);
            }
        }
        ans = Math.min(ans, cur);
        return ans;
    }
}
