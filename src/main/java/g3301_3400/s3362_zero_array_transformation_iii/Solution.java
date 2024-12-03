package g3301_3400.s3362_zero_array_transformation_iii;

// #Medium #Array #Sorting #Greedy #Heap_Priority_Queue #Prefix_Sum
// #2024_12_03_Time_68_ms_(91.99%)_Space_93.6_MB_(45.88%)

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        Arrays.sort(queries, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> last = new PriorityQueue<>((a, b) -> b - a);
        int[] diffs = new int[nums.length + 1];
        int idx = 0;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            while (idx < queries.length && queries[idx][0] == i) {
                last.add(queries[idx][1]);
                idx++;
            }
            cur += diffs[i];
            while (cur < nums[i] && !last.isEmpty() && last.peek() >= i) {
                cur++;
                diffs[last.poll() + 1]--;
            }
            if (cur < nums[i]) {
                return -1;
            }
        }
        return last.size();
    }
}
