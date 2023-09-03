package g1801_1900.s1878_get_biggest_three_rhombus_sums_in_a_grid;

// #Medium #Array #Math #Sorting #Matrix #Heap_Priority_Queue #Prefix_Sum
// #2022_05_11_Time_41_ms_(82.03%)_Space_54.2_MB_(58.98%)

import java.util.PriorityQueue;

public class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int capicity = 3;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int m = grid.length;
        int n = grid[0].length;
        int[][][] preSum = new int[m][n][2];
        int maxLen = Math.min(m, n) / 2;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                addToMinHeap(minHeap, grid[r][c], capicity);
                preSum[r][c][0] +=
                        valid(m, n, r - 1, c - 1)
                                ? grid[r][c] + preSum[r - 1][c - 1][0]
                                : grid[r][c];
                preSum[r][c][1] +=
                        valid(m, n, r - 1, c + 1)
                                ? grid[r][c] + preSum[r - 1][c + 1][1]
                                : grid[r][c];
            }
        }
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                for (int l = 1; l <= maxLen; l++) {
                    if (!valid(m, n, r - l, c - l)
                            || !valid(m, n, r - l, c + l)
                            || !valid(m, n, r - 2 * l, c)) {
                        break;
                    }
                    int rhombus = preSum[r][c][0] - preSum[r - l][c - l][0];
                    rhombus += preSum[r][c][1] - preSum[r - l][c + l][1];
                    rhombus += preSum[r - l][c - l][1] - preSum[r - 2 * l][c][1];
                    rhombus += preSum[r - l][c + l][0] - preSum[r - 2 * l][c][0];
                    rhombus += -grid[r][c] + grid[r - 2 * l][c];
                    addToMinHeap(minHeap, rhombus, capicity);
                }
            }
        }
        int size = minHeap.size();
        int[] res = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            res[i] = minHeap.poll();
        }
        return res;
    }

    private void addToMinHeap(PriorityQueue<Integer> minHeap, int num, int capicity) {
        if (minHeap.isEmpty() || (minHeap.size() < capicity && !minHeap.contains(num))) {
            minHeap.offer(num);
        } else {
            if (num > minHeap.peek() && !minHeap.contains(num)) {
                minHeap.poll();
                minHeap.offer(num);
            }
        }
    }

    private boolean valid(int m, int n, int r, int c) {
        return 0 <= r && r < m && 0 <= c && c < n;
    }
}
