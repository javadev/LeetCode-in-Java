package g2601_2700.s2602_minimum_operations_to_make_all_array_elements_equal;

// #Medium #Array #Sorting #Binary_Search #Prefix_Sum
// #2023_08_29_Time_41_ms_(97.39%)_Space_59.4_MB_(83.66%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
        Arrays.sort(nums);
        long[] sum = new long[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            sum[i] = sum[i - 1] + nums[i];
        }
        List<Long> res = new ArrayList<>();
        for (int query : queries) {
            res.add(getOperations(sum, nums, query));
        }
        return res;
    }

    private long getOperations(long[] sum, int[] nums, int target) {
        long res = 0;
        int index = getIndex(nums, target);
        int rightCounts = nums.length - 1 - index;
        if (index > 0) {
            res += (long) index * target - sum[index - 1];
        }
        if (rightCounts > 0) {
            res += sum[nums.length - 1] - sum[index] - (long) rightCounts * target;
        }
        res += Math.abs(target - nums[index]);
        return res;
    }

    private int getIndex(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if (index < 0) {
            index = -(index + 1);
        }
        if (index == nums.length) {
            --index;
        }
        return index;
    }
}
