package g1001_1100.s1090_largest_values_from_labels;

// #Medium #Array #Hash_Table #Sorting #Greedy #Counting
// #2022_02_23_Time_14_ms_(95.96%)_Space_43.2_MB_(80.43%)

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    private static class Node {
        int val;
        int label;

        Node(int val, int label) {
            this.val = val;
            this.label = label;
        }
    }

    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        PriorityQueue<Node> maxHeap =
                new PriorityQueue<>((a, b) -> b.val != a.val ? b.val - a.val : a.label - b.label);
        int n = values.length;
        for (int i = 0; i < n; i++) {
            maxHeap.offer(new Node(values[i], labels[i]));
        }
        int ans = 0;
        HashMap<Integer, Integer> labelAddedCount = new HashMap<>();
        while (!maxHeap.isEmpty() && numWanted > 0) {
            Node cur = maxHeap.poll();
            if (labelAddedCount.containsKey(cur.label)
                    && labelAddedCount.get(cur.label) >= useLimit) {
                continue;
            }
            if (cur.val > 0) {
                ans += cur.val;
                labelAddedCount.put(cur.label, labelAddedCount.getOrDefault(cur.label, 0) + 1);
                numWanted--;
            }
        }
        return ans;
    }
}
