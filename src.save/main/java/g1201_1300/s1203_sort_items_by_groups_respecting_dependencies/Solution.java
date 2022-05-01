package g1201_1300.s1203_sort_items_by_groups_respecting_dependencies;

// #Hard #Depth_First_Search #Breadth_First_Search #Graph #Topological_Sort
// #2022_03_08_Time_44_ms_(88.89%)_Space_56.3_MB_(95.56%)

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@SuppressWarnings("java:S1149")
public class Solution {

    private static int[] topoSort(int temp, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[temp];
        for (ArrayList<Integer> edges : adj) {
            for (Integer edge : edges) {
                indegree[edge]++;
            }
        }
        Stack<Integer> q = new Stack<>();
        for (int i = 0; i < temp; ++i) {
            if (indegree[i] == 0) {
                q.push(i);
            }
        }
        if (q.isEmpty()) {
            return new int[0];
        }
        ArrayList<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int v = q.pop();
            topo.add(v);
            ArrayList<Integer> edges = adj.get(v);
            for (int nbr : edges) {
                indegree[nbr]--;
                if (indegree[nbr] == 0) {
                    q.push(nbr);
                }
            }
        }
        if (topo.size() != temp) {
            return new int[0];
        } else {
            int[] ans = new int[topo.size()];
            for (int i = 0; i < topo.size(); ++i) {
                ans[i] = topo.get(i);
            }
            return ans;
        }
    }

    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int nodes = n + 2 * m;
        for (int i = 0; i < nodes; ++i) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < n; ++i) {
            List<Integer> before = beforeItems.get(i);
            if (group[i] == -1 && before.isEmpty()) {
                // continue
            } else if (before.isEmpty()) {
                int groupStart = n + group[i] * 2;
                int ge = n + group[i] * 2 + 1;
                graph.get(groupStart).add(i);
                graph.get(i).add(ge);
            } else if (group[i] == -1) {
                for (int temp : before) {
                    if (group[temp] == -1) {
                        graph.get(temp).add(i);
                    } else {
                        int ge = n + group[temp] * 2 + 1;
                        graph.get(ge).add(i);
                    }
                }
            } else {
                int groupStart = n + group[i] * 2;
                int groupEnd = n + group[i] * 2 + 1;
                graph.get(groupStart).add(i);
                graph.get(i).add(groupEnd);
                for (int temp : before) {
                    if (group[temp] == -1) {
                        graph.get(temp).add(groupStart);
                    } else {
                        if (group[temp] == group[i]) {
                            graph.get(temp).add(i);
                        } else {
                            groupEnd = n + group[temp] * 2 + 1;
                            graph.get(groupEnd).add(groupStart);
                        }
                    }
                }
            }
        }
        int[] temp = topoSort(nodes, graph);
        if (temp.length == 0) {
            return temp;
        }
        int[] ans = new int[n];
        int j = 0;
        for (int k : temp) {
            if (k < n) {
                ans[j++] = k;
            }
        }
        return ans;
    }
}
