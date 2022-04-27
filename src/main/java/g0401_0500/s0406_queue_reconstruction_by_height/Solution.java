package g0401_0500.s0406_queue_reconstruction_by_height;

// #Medium #Array #Sorting #Greedy #Segment_Tree #Binary_Indexed_Tree
// #2022_03_16_Time_9_ms_(74.45%)_Space_54.6_MB_(43.92%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> a[0] != b[0] ? -a[0] + b[0] : a[1] - b[1]);
        List<int[]> res = new ArrayList<>();
        for (int[] a : people) {
            res.add(a[1], a);
        }
        return res.toArray(new int[people.length][]);
    }
}
