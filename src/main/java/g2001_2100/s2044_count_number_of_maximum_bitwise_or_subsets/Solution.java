package g2001_2100.s2044_count_number_of_maximum_bitwise_or_subsets;

// #Medium #Array #Bit_Manipulation #Backtracking
// #2022_05_26_Time_12_ms_(58.97%)_Space_41.6_MB_(60.00%)

public class Solution {
    private int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        int lookfor = 0;
        for (int i : nums) {
            lookfor = lookfor | i;
        }
        countsub(nums, 0, lookfor, 0);
        return count;
    }

    private void countsub(int[] nums, int index, int lookfor, int sofar) {
        if (lookfor == sofar) {
            count++;
        }
        if (index >= nums.length) {
            return;
        }

        for (int start = index; start < nums.length; start++) {
            countsub(nums, start + 1, lookfor, sofar | nums[start]);
        }
    }
}
