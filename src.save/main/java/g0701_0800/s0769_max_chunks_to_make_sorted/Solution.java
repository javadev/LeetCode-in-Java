package g0701_0800.s0769_max_chunks_to_make_sorted;

// #Medium #Array #Sorting #Greedy #Stack #Monotonic_Stack
// #2022_03_26_Time_0_ms_(100.00%)_Space_41.8_MB_(23.34%)

public class Solution {
    public int maxChunksToSorted(int[] arr) {
        int ans = 0;
        int max = 0;
        for (int i = 0; i < arr.length; ++i) {
            max = Math.max(max, arr[i]);
            if (max == i) {
                ans++;
            }
        }
        return ans;
    }
}
