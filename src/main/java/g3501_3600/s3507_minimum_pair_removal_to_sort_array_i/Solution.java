package g3501_3600.s3507_minimum_pair_removal_to_sort_array_i;

// #Easy #2025_04_06_Time_1_ms_(100.00%)_Space_43.18_MB_(31.56%)

public class Solution {
    public int minimumPairRemoval(int[] nums) {
        int operations = 0;
        while (!isNonDecreasing(nums)) {
            int minSum = Integer.MAX_VALUE;
            int index = 0;
            // Find the leftmost pair with minimum sum
            for (int i = 0; i < nums.length - 1; i++) {
                int sum = nums[i] + nums[i + 1];
                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }
            // Merge the pair at index
            int[] newNums = new int[nums.length - 1];
            int j = 0;
            int i = 0;
            while (i < nums.length) {
                if (i == index) {
                    newNums[j++] = nums[i] + nums[i + 1];
                    // Skip the next one since it's merged
                    i++;
                } else {
                    newNums[j++] = nums[i];
                }
                i++;
            }
            nums = newNums;
            operations++;
        }
        return operations;
    }

    private boolean isNonDecreasing(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
