package g1901_2000.s1968_array_with_elements_not_equal_to_average_of_neighbors;

// #Medium #Array #Sorting #Greedy #2022_05_21_Time_6_ms_(92.86%)_Space_64.9_MB_(77.92%)

import java.security.SecureRandom;
import java.util.Random;

public class Solution {
    public int[] rearrangeArray(int[] nums) {
        Random random = new SecureRandom();
        while (true) {
            int i;
            for (i = 1; i < nums.length - 1; i++) {
                if (2 * nums[i] == nums[i - 1] + nums[i + 1]) {
                    break;
                }
            }
            if (i == nums.length - 1) {
                return nums;
            }
            for (i = 0; i < nums.length; i++) {
                int j = i + random.nextInt(nums.length - i);
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
    }
}
