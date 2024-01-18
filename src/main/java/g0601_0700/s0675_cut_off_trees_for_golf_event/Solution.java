package g0601_0700.s0675_cut_off_trees_for_golf_event;

// #Hard #Array #Breadth_First_Search #Matrix #Heap_Priority_Queue
// #2022_03_22_Time_417_ms_(73.86%)_Space_118.5_MB_(22.75%)

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    private int r = 0;
    private int c = 0;

    public int cutOffTree(List<List<Integer>> forest) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (List<Integer> integers : forest) {
            for (int v : integers) {
                if (v > 1) {
                    pq.add(v);
                }
            }
        }
        int steps = 0;
        while (!pq.isEmpty()) {
            int count = minSteps(forest, pq.poll());
            if (count == -1) {
                return -1;
            }
            steps += count;
        }
        return steps;
    }

    private int minSteps(List<List<Integer>> forest, int target) {
        int steps = 0;
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean[][] visited = new boolean[forest.size()][forest.get(0).size()];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {this.r, this.c});
        visited[r][c] = true;
        while (!q.isEmpty()) {
            int qsize = q.size();
            for (int i = 0; i < qsize; i++) {
                int[] curr = q.poll();
                if (forest.get(Objects.requireNonNull(curr)[0]).get(curr[1]) == target) {
                    this.r = curr[0];
                    this.c = curr[1];
                    return steps;
                }
                for (int k = 0; k < 4; k++) {
                    int[] dir = dirs[k];
                    int nr = dir[0] + curr[0];
                    int nc = dir[1] + curr[1];

                    if (nr < 0
                            || nr == visited.length
                            || nc < 0
                            || nc == visited[0].length
                            || visited[nr][nc]
                            || forest.get(nr).get(nc) == 0) {
                        continue;
                    }
                    q.add(new int[] {nr, nc});
                    visited[nr][nc] = true;
                }
            }
            steps++;
        }
        return -1;
    }
}
