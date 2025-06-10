package g3501_3600.s3572_maximize_ysum_by_picking_a_triplet_of_distinct_xvalues;

// #Medium #Array #Hash_Table #Sorting #Greedy #Heap_Priority_Queue
// #2025_06_10_Time_2_ms_(100.00%)_Space_64.25_MB_(40.62%)

public class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        int index = -1;
        int max = -1;
        int sum = 0;
        for (int i = 0; i < y.length; i++) {
            if (y[i] > max) {
                max = y[i];
                index = i;
            }
        }
        sum += max;
        if (max == -1) {
            return -1;
        }
        int index2 = -1;
        max = -1;
        for (int i = 0; i < y.length; i++) {
            if (y[i] > max && x[i] != x[index]) {
                max = y[i];
                index2 = i;
            }
        }
        sum += max;
        if (max == -1) {
            return -1;
        }
        max = -1;
        for (int i = 0; i < y.length; i++) {
            if (y[i] > max && x[i] != x[index] && x[i] != x[index2]) {
                max = y[i];
            }
        }
        if (max == -1) {
            return -1;
        }
        sum += max;
        return sum;
    }
}
