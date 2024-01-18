package g1501_1600.s1519_number_of_nodes_in_the_sub_tree_with_the_same_label;

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Counting
// #2022_04_09_Time_60_ms_(98.13%)_Space_107.7_MB_(97.66%)

import java.util.ArrayList;

public class Solution {
    public int[] countSubTrees(int n, int[][] edges, String labelsString) {
        int[] labelsCount = new int[n];
        if (n <= 0 || edges == null || labelsString == null) {
            return labelsCount;
        }

        int[] labels = new int[n];
        int nodeNumber = 0;
        for (char label : labelsString.toCharArray()) {
            labels[nodeNumber++] = label - 'a';
        }

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int parent = edge[0];
            int child = edge[1];
            graph.get(parent).add(child);
            graph.get(child).add(parent);
        }

        getLabelsFrequency(0, graph, labels, labelsCount, 0);

        return labelsCount;
    }

    private int[] getLabelsFrequency(
            int root,
            ArrayList<ArrayList<Integer>> graph,
            int[] labels,
            int[] labelsCount,
            int parent) {
        int[] labelsFrequency = new int[26];
        int rootLabel = labels[root];
        labelsFrequency[rootLabel]++;

        for (int child : graph.get(root)) {
            if (child == parent) {
                continue;
            }
            int[] childLabelsFrequency =
                    getLabelsFrequency(child, graph, labels, labelsCount, root);
            for (int i = 0; i < childLabelsFrequency.length; i++) {
                labelsFrequency[i] += childLabelsFrequency[i];
            }
        }

        labelsCount[root] = labelsFrequency[rootLabel];
        return labelsFrequency;
    }
}
