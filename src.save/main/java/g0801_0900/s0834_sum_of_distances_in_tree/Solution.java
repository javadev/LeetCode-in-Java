package g0801_0900.s0834_sum_of_distances_in_tree;

// #Hard #Dynamic_Programming #Depth_First_Search #Tree #Graph
// #2022_03_24_Time_52_ms_(91.09%)_Space_96.7_MB_(75.86%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    private int n;
    private int[] count;
    private int[] answer;
    private List<Integer>[] graph;

    private void postorder(int node, int parent) {
        for (int child : graph[node]) {
            if (child != parent) {
                postorder(child, node);
                count[node] += count[child];
                answer[node] += answer[child] + count[child];
            }
        }
    }

    private void preorder(int node, int parent) {

        for (int child : graph[node]) {
            if (child != parent) {
                answer[child] = answer[node] - count[child] + n - count[child];
                preorder(child, node);
            }
        }
    }

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        this.n = n;
        count = new int[n];
        answer = new int[n];
        graph = new List[n];
        Arrays.fill(count, 1);
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        postorder(0, -1);
        preorder(0, -1);
        return answer;
    }
}
