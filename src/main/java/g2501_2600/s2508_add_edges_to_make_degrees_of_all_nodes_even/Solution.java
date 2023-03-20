package g2501_2600.s2508_add_edges_to_make_degrees_of_all_nodes_even;

// #Hard #Hash_Table #Graph #2023_03_20_Time_33_ms_(100.00%)_Space_109.7_MB_(42.70%)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean isPossible(int n, List<List<Integer>> edges) {
        // first find odd edge nodes
        int[] degree = new int[n + 1];
        for (List<Integer> edge : edges) {
            degree[edge.get(0)]++;
            degree[edge.get(1)]++;
        }
        List<Integer> oddNodes = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((degree[i] & 1) == 1) {
                oddNodes.add(i);
            }
            if (oddNodes.size() > 4) {
                // cannot be larger than four
                return false;
            }
        }
        if ((oddNodes.size() & 1) == 1) {
            // can only have even numbers of odd nodes
            return false;
        } else if (oddNodes.isEmpty()) {
            // zero situation
            return true;
        }
        // find all edges of oddListNode
        Set[] adjList = new HashSet[oddNodes.size()];
        for (int i = 0; i < oddNodes.size(); i++) {
            adjList[i] = new HashSet<>();
        }
        for (List<Integer> edge : edges) {
            for (int i = 0; i < oddNodes.size(); i++) {
                if ((int) edge.get(0) == oddNodes.get(i)) {
                    adjList[i].add(edge.get(1));
                }
                if ((int) edge.get(1) == oddNodes.get(i)) {
                    adjList[i].add(edge.get(0));
                }
            }
        }
        // to see if it is two or four
        if (oddNodes.size() == 4) {
            // can only connect each other
            // have to detect if they have an edge or not
            return adjList[0].size() < (n - 1)
                    && adjList[1].size() < (n - 1)
                    && adjList[2].size() < (n - 1)
                    && adjList[3].size() < (n - 1)
                    && ((!adjList[0].contains(oddNodes.get(1))
                                    && !adjList[1].contains(oddNodes.get(0))
                                    && !adjList[2].contains(oddNodes.get(3))
                                    && !adjList[3].contains(oddNodes.get(2)))
                            || (!adjList[0].contains(oddNodes.get(2))
                                    && !adjList[2].contains(oddNodes.get(0))
                                    && !adjList[1].contains(oddNodes.get(3))
                                    && !adjList[3].contains(oddNodes.get(1)))
                            || (!adjList[0].contains(oddNodes.get(3))
                                    && !adjList[1].contains(oddNodes.get(2))
                                    && !adjList[2].contains(oddNodes.get(1))));
        } else {
            // if two dont have an edge, could use it
            if (adjList[0].contains(oddNodes.get(1))) {
                // need to find a spare node
                for (int i = 1; i <= n; i++) {
                    if (adjList[0].contains(i) || adjList[1].contains(i)) {
                        continue;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
    }
}
