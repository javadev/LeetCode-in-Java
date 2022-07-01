package g1601_1700.s1654_minimum_jumps_to_reach_home;

// #Medium #Array #Dynamic_Programming #Breadth_First_Search
// #Graph_Theory_I_Day_11_Breadth_First_Search
// #2022_04_23_Time_6_ms_(99.87%)_Space_42.4_MB_(93.67%)

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private static class Pair {
        int i;
        boolean backward;

        public Pair(int i, boolean b) {
            this.i = i;
            this.backward = b;
        }
    }

    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        int limit = 2000 + 2 * b + 1;
        boolean[] v = new boolean[limit];
        for (int num : forbidden) {
            v[num] = true;
        }
        int step = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, false));
        v[0] = true;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Pair c = q.poll();
                if (c.i == x) {
                    return step;
                }
                if (!c.backward) {
                    int backward = c.i - b;
                    if (backward == x) {
                        return step + 1;
                    }
                    if (backward > 0 && !v[backward]) {
                        q.offer(new Pair(backward, true));
                        v[backward] = true;
                    }
                }
                int forward = c.i + a;
                if (forward == x) {
                    return step + 1;
                }
                if (forward < limit && !v[forward]) {
                    q.offer(new Pair(forward, false));
                    v[forward] = true;
                }
            }
            step++;
        }
        return -1;
    }
}
