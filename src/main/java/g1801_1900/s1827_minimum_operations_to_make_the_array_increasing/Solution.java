package g1801_1900.s1827_minimum_operations_to_make_the_array_increasing;

// #Easy #Array #Greedy #2022_05_06_Time_4_ms_(35.67%)_Space_49.5_MB_(20.66%)

public class Solution {
    public int minOperations(int[] nums) {
        int minsOps = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                minsOps += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }
        return minsOps;
    }
}
