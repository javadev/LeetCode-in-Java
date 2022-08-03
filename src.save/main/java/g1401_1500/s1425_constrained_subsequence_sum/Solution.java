package g1401_1500.s1425_constrained_subsequence_sum;

// #Hard #Array #Dynamic_Programming #Heap_Priority_Queue #Sliding_Window #Queue #Monotonic_Queue
// #2022_03_28_Time_69_ms_(30.52%)_Space_129.5_MB_(19.86%)

import java.util.LinkedList;

public class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int n = nums.length;
        int res = Integer.MIN_VALUE;
        LinkedList<int[]> mono = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int take = nums[i];

            while (!mono.isEmpty() && i - mono.getFirst()[0] > k) {
                mono.removeFirst();
            }
            if (!mono.isEmpty()) {
                int mx = Math.max(0, mono.getFirst()[1]);
                take += mx;
            }
            while (!mono.isEmpty() && take > mono.getLast()[1]) {
                mono.removeLast();
            }

            mono.add(new int[] {i, take});
            res = Math.max(res, take);
        }
        return res;
    }
}
