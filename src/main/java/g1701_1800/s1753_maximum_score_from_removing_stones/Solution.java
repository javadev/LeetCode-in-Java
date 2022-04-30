package g1701_1800.s1753_maximum_score_from_removing_stones;

// #Medium #Math #Greedy #Heap_Priority_Queue #2022_04_30_Time_0_ms_(100.00%)_Space_41.5_MB_(70.96%)

import java.util.Arrays;

public class Solution {
    public int maximumScore(int a, int b, int c) {
        int[] nums = new int[] {a, b, c};
        Arrays.sort(nums);
        if (nums[0] + nums[1] < nums[2]) {
            return nums[0] + nums[1];
        } else {
            return (nums[0] + nums[1] + nums[2]) / 2;
        }
    }
}
