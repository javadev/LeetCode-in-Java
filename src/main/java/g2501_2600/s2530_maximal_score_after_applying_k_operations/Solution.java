package g2501_2600.s2530_maximal_score_after_applying_k_operations;

// #Medium #Array #Greedy #Heap_Priority_Queue #2023_04_20_Time_168_ms_(67.97%)_Space_60_MB_(30.08%)

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            p.add(nums[nums.length - i - 1]);
        }
        long score = 0;
        while (k != 0) {
            int v1 = p.poll();
            score += v1;
            int v2 = (int) Math.ceil((double) v1 / 3);
            p.add(v2);
            k--;
        }
        return score;
    }
}
