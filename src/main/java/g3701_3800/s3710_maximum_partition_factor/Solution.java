package g3701_3800.s3710_maximum_partition_factor;

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Binary_Search #Graph #Union_Find
// #Biweekly_Contest_167 #2025_10_14_Time_46_ms_(99.31%)_Space_45.31_MB_(84.72%)

import java.util.Arrays;

public class Solution {
    public int maxPartitionFactor(int[][] points) {
        int n = points.length;
        if (n == 2) {
            return 0;
        }
        int[][] dist = new int[n][n];
        int maxDist = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int d =
                        Math.abs(points[i][0] - points[j][0])
                                + Math.abs(points[i][1] - points[j][1]);
                dist[i][j] = dist[j][i] = d;
                if (d > maxDist) {
                    maxDist = d;
                }
            }
        }
        int low = 0;
        int high = maxDist;
        while (low < high) {
            int mid = low + (high - low + 1) / 2;
            if (isFeasible(dist, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private boolean isFeasible(int[][] dist, int t) {
        int n = dist.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);
        int[] queue = new int[n];
        for (int i = 0; i < n; i++) {
            if (color[i] != -1) {
                continue;
            }
            int head = 0;
            int tail = 0;
            queue[tail++] = i;
            color[i] = 0;
            while (head < tail) {
                int u = queue[head++];
                for (int v = 0; v < n; v++) {
                    if (u == v || dist[u][v] >= t) {
                        continue;
                    }
                    if (color[v] == -1) {
                        color[v] = color[u] ^ 1;
                        queue[tail++] = v;
                    } else if (color[v] == color[u]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
