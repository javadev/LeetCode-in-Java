package g2401_2500.s2498_frog_jump_ii;

// #Medium #Array #Greedy #Binary_Search #2023_02_12_Time_1_ms_(100.00%)_Space_55.8_MB_(66.50%)

public class Solution {
    public int maxJump(int[] stones) {
        int n = stones.length;
        int max = 0;
        for (int i = 2; i < n; i++) {
            int gap = stones[i] - stones[i - 2];
            if (gap > max) {
                max = gap;
            }
        }
        if (n > 2) {
            return max;
        } else {
            return stones[1] - stones[0];
        }
    }
}
