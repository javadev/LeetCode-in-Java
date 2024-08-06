package g3201_3300.s3244_shortest_distance_after_road_addition_queries_ii;

// #Hard #Array #Greedy #Graph #Ordered_Set #2024_08_06_Time_5_ms_(97.43%)_Space_78.1_MB_(80.21%)

public class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int[] flag = new int[n];
        int[] res = new int[queries.length];
        for (int i = 0; i < n; i++) {
            flag[i] = i + 1;
        }
        for (int k = 0; k < queries.length; k++) {
            int[] query = queries[k];
            int preRes = k == 0 ? (n - 1) : res[k - 1];
            if (flag[query[0]] >= query[1]) {
                res[k] = preRes;
                continue;
            }
            int subDis = 0;
            int curr = query[0];
            while (curr < query[1]) {
                int next = flag[curr];
                subDis += 1;
                flag[curr] = query[1];
                curr = next;
            }
            res[k] = preRes + 1 - subDis;
        }
        return res;
    }
}
