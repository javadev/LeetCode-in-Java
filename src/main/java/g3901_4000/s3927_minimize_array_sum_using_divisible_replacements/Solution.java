package g3901_4000.s3927_minimize_array_sum_using_divisible_replacements;

// #Medium #Array #Hash_Table #Math #Greedy #Number_Theory #Staff #Weekly_Contest_501
// #2026_09_29_Time_11_ms_(96.83%)_Space_130.23_MB_(43.65%)

public class Solution {
    public long minArraySum(int[] nums) {
        int max = 0;
        long sum = 0;
        for (int num : nums) {
            if (num == 1) {
                return nums.length;
            }
            if (num > max) {
                max = num;
            }
        }
        int[] min = new int[max + 1];
        for (int num : nums) {
            min[num] = num;
        }
        for (int num : nums) {
            if (min[num] < num) {
                continue;
            }
            for (int i = num; i <= max; i += num) {
                if (num < min[i]) {
                    min[i] = num;
                }
            }
        }
        for (int num : nums) {
            sum += min[num];
        }
        return sum;
    }
}
