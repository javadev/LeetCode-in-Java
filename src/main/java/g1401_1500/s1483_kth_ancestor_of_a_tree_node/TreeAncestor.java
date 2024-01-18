package g1401_1500.s1483_kth_ancestor_of_a_tree_node;

// #Hard #Dynamic_Programming #Depth_First_Search #Breadth_First_Search #Tree #Binary_Search #Design
// #2022_04_05_Time_60_ms_(93.28%)_Space_82.3_MB_(88.81%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeAncestor {
    private final List<Integer> steps;
    private final Map<Integer, int[]> stepMap;

    public TreeAncestor(int n, int[] parent) {
        steps = new ArrayList<>();
        stepMap = new HashMap<>();
        steps.add(1);
        stepMap.put(1, parent);
        int stepBase = 10;
        int step = stepBase;
        while (step * 2 < n) {
            int[] stepArr = new int[n];
            int[] lastStepArr = stepMap.get(steps.get(steps.size() - 1));
            for (int i = 0; i < n; i++) {
                int cur = i;
                for (int repeat = 0; repeat < stepBase && cur != -1; repeat++) {
                    cur = lastStepArr[cur];
                }
                stepArr[i] = cur;
            }
            steps.add(step);
            stepMap.put(step, stepArr);
            step *= stepBase;
        }
    }

    public int getKthAncestor(int node, int k) {
        int index = steps.size() - 1;
        while (k > 0 && node != -1 && index >= 0) {
            int step = steps.get(index);
            int[] stepArr = stepMap.get(step);
            while (k >= step && node != -1) {
                node = stepArr[node];
                k -= step;
            }
            index--;
        }
        return node;
    }
}
