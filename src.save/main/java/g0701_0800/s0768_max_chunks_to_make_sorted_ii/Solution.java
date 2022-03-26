package g0701_0800.s0768_max_chunks_to_make_sorted_ii;

// #Hard #Array #Sorting #Greedy #Stack #Monotonic_Stack
// #2022_03_26_Time_1_ms_(87.58%)_Space_45.9_MB_(14.40%)

public class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int[] lmax = new int[n];
        int[] rmin = new int[n + 1];
        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], arr[i]);
        }
        rmin[n] = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            rmin[i] = Math.min(rmin[i + 1], arr[i]);
        }
        int chunks = 0;
        for (int i = 0; i < n; i++) {
            if (lmax[i] <= rmin[i + 1]) {
                chunks++;
            }
        }
        return chunks;
    }
}
