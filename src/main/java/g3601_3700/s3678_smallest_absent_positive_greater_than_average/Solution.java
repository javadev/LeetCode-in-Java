package g3601_3700.s3678_smallest_absent_positive_greater_than_average;

// #Easy #Biweekly_Contest_165 #2025_09_14_Time_10_ms_(100.00%)_Space_45.27_MB_(100.00%)

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int smallestAbsent(int[] nums) {
        double avg;
        double sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            sum += num;
            set.add(num);
        }
        int n = nums.length;
        Arrays.sort(nums);
        avg = sum / n;
        double j;
        if (avg < 0) {
            j = 1;
        } else if (Math.ceil(avg) == avg) {
            j = avg + 1;
        } else {
            j = Math.ceil(avg);
        }
        for (int i = (int) j; i <= 100; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return nums[n - 1] + 1;
    }
}
