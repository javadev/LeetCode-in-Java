package g1301_1400.s1353_maximum_number_of_events_that_can_be_attended;

// #Medium #Array #Greedy #Heap_Priority_Queue
// #2022_08_19_Time_53_ms_(99.53%)_Space_99.5_MB_(52.91%)

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(e -> e[1]));
        int[] root = new int[events[events.length - 1][1] + 2];
        for (int i = 1; i < root.length; i++) {
            root[i] = i;
        }
        int res = 0;
        for (int[] e : events) {
            int nxtAvailable = find(root, e[0]);
            if (nxtAvailable <= e[1]) {
                res++;
                root[nxtAvailable] = find(root, nxtAvailable + 1);
            }
        }
        return res;
    }

    private int find(int[] root, int i) {
        if (root[i] != i) {
            root[i] = find(root, root[i]);
            return root[i];
        }
        return i;
    }
}
