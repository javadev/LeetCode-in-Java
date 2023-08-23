package g2501_2600.s2593_find_score_of_an_array_after_marking_all_elements;

// #Medium #Array #Sorting #Heap_Priority_Queue #Simulation
// #2023_08_23_Time_159_ms_(96.76%)_Space_56.2_MB_(68.11%)

import java.util.PriorityQueue;

public class Solution {
    private static class Point {
        int idx;
        int val;

        Point(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    }

    public long findScore(int[] arr) {
        PriorityQueue<Point> pq =
                new PriorityQueue<>((a, b) -> b.val == a.val ? a.idx - b.idx : a.val - b.val);
        int n = arr.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            pq.add(new Point(i, arr[i]));
        }
        long ans = 0;
        while (!pq.isEmpty()) {
            Point p = pq.remove();
            int idx = p.idx;
            if (!visited[idx]) {
                ans += p.val;
                visited[idx] = true;
                if (idx - 1 >= 0 && !visited[idx - 1]) {
                    visited[idx - 1] = true;
                }
                if (idx + 1 < n && !visited[idx + 1]) {
                    visited[idx + 1] = true;
                }
            }
        }
        return ans;
    }
}
