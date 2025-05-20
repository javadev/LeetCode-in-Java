package g3501_3600.s3550_smallest_index_with_digit_sum_equal_to_index;

// #Easy #Array #Math #2025_05_20_Time_1_ms_(100.00%)_Space_44.55_MB_(45.19%)

public class Solution {
    private int sum(int num) {
        int s = 0;
        while (num > 0) {
            s += num % 10;
            num /= 10;
        }
        return s;
    }

    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == sum(nums[i])) {
                return i;
            }
        }
        return -1;
    }
}
