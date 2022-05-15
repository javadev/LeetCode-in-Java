package g0301_0400.s0398_random_pick_index;

// #Medium #Hash_Table #Math #Randomized #Reservoir_Sampling #Acceptance_63.6%
// #2022_03_18_Time_75_ms_(74.64%)_Space_68.8_MB_(76.92%)

/*
 * Using Reservoir Sampling
 *
 * Suppose the indexes of the target element in array are from 1 to N. You have
 * already picked i-1 elements. Now you are trying to pick ith element. The
 * probability to pick it is 1/i. Now you do not want to pick any future
 * numbers.. Thus, the final probability for ith element = 1/i * (1 - 1/(i+1)) *
 * (1 - 1/(i+2)) * .. * (1 - 1/N) = 1 / N.
 *
 * Time Complexity:
 * 1) Solution() Constructor -> O(1)
 * 2) pick() -> O(N)
 *
 * Space Complexity: O(1)
 *
 * N = Length of the input array.
 */

import java.util.Random;

@SuppressWarnings("java:S2245")
public class Solution {
    private final int[] nums;
    private final Random random;

    public Solution(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }

    public int pick(int target) {
        int idx = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
                if (random.nextInt(count) == 0) {
                    idx = i;
                }
            }
        }
        return idx;
    }
}
