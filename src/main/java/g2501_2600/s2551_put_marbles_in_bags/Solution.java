package g2501_2600.s2551_put_marbles_in_bags;

// #Hard #Array #Sorting #Greedy #Heap_Priority_Queue
// #2023_08_15_Time_33_ms_(99.82%)_Space_55.1_MB_(97.58%)

import java.util.Arrays;

public class Solution {
    public long putMarbles(int[] weights, int k) {
        long minAns = weights[0] + (long) weights[weights.length - 1];
        long maxAns = weights[0] + (long) weights[weights.length - 1];
        long[] arr = new long[weights.length - 1];
        for (int i = 1; i < weights.length; i++) {
            arr[i - 1] = weights[i] + (long) weights[i - 1];
        }
        Arrays.sort(arr);
        for (int i = 0; i < k - 1; i++) {
            minAns = minAns + arr[i];
        }
        for (int i = arr.length - 1; i > arr.length - k; i--) {
            maxAns = maxAns + arr[i];
        }
        return maxAns - minAns;
    }
}
