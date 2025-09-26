package g3601_3700.s3679_minimum_discards_to_balance_inventory;

// #Medium #Array #Hash_Table #Simulation #Counting #Sliding_Window #Biweekly_Contest_165
// #2025_09_26_Time_2_ms_(100.00%)_Space_61.06_MB_(68.83%)

public class Solution {
    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        int n = arrivals.length;
        int dis = 0;
        boolean[] removed = new boolean[n];
        int maxVal = 0;
        for (int v : arrivals) {
            maxVal = Math.max(maxVal, v);
        }
        int[] freq = new int[maxVal + 1];
        for (int i = 0; i < n; i++) {
            int outIdx = i - w;
            if (outIdx >= 0 && !removed[outIdx]) {
                int oldVal = arrivals[outIdx];
                freq[oldVal]--;
            }
            int val = arrivals[i];
            if (freq[val] >= m) {
                dis++;
                removed[i] = true;
            } else {
                freq[val]++;
            }
        }
        return dis;
    }
}
