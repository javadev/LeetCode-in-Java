package g2301_2400.s2359_find_closest_node_to_given_two_nodes;

// #Medium #Depth_First_Search #Graph #2022_08_14_Time_18_ms_(89.33%)_Space_112.3_MB_(69.17%)

public class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        final int n = edges.length;
        final Integer[] m1 = new Integer[n];
        final Integer[] m2 = new Integer[n];
        dfs(edges, m1, node1);
        dfs(edges, m2, node2);
        int index = -1;
        int dist = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (m1[i] != null && m2[i] != null && dist > Math.max(m1[i], m2[i])) {
                dist = Math.max(m1[i], m2[i]);
                index = i;
            }
        }
        return index;
    }

    private void dfs(int[] edges, Integer[] memo, int node) {
        int dist = 0;
        while (node != -1 && memo[node] == null) {
            memo[node] = dist++;
            node = edges[node];
        }
    }
}
