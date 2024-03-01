package g1301_1400.s1319_number_of_operations_to_make_network_connected;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #Graph_Theory_I_Day_8_Standard_Traversal #2022_03_19_Time_9_ms_(67.64%)_Space_64.6_MB_(49.60%)

import java.util.Arrays;

public class Solution {

    private static final int IMPOSSIBLE_TO_CONNECT = -1;
    private int disconnectedComputers;
    private int[] parent;
    private int[] rank;

    public int makeConnected(int totalNumberOfComputers, int[][] connections) {
        if (connections.length < totalNumberOfComputers - 1) {
            return IMPOSSIBLE_TO_CONNECT;
        }

        disconnectedComputers = totalNumberOfComputers;
        rank = new int[totalNumberOfComputers];
        parent = new int[totalNumberOfComputers];
        Arrays.setAll(parent, intFromZero -> intFromZero++);

        for (final int[] connection : connections) {
            unionFind(connection[0], connection[1]);
        }

        return disconnectedComputers - 1;
    }

    private void unionFind(int first, int second) {
        int parentFirst = findParent(first);
        int parentSecond = findParent(second);

        if (parentFirst != parentSecond) {
            joinByRank(parentFirst, parentSecond);
            disconnectedComputers--;
        }
    }

    private int findParent(int index) {
        if (parent[index] != index) {
            parent[index] = findParent(parent[index]);
        }
        return parent[index];
    }

    private void joinByRank(int first, int second) {
        if (rank[first] < rank[second]) {
            parent[first] = second;
        } else if (rank[second] < rank[first]) {
            parent[second] = first;
        } else {
            parent[first] = second;
            rank[second]++;
        }
    }
}
