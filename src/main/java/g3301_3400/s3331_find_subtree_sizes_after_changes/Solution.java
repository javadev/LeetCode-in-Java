package g3301_3400.s3331_find_subtree_sizes_after_changes;

// #Medium #Array #String #Hash_Table #Depth_First_Search #Tree
// #2024_10_29_Time_166_ms_(52.73%)_Space_86.3_MB_(8.86%)

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    private int[] finalAns;

    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        char[] arr = s.toCharArray();
        int[] newParent = new int[n];
        finalAns = new int[n];
        HashMap<Integer, ArrayList<Integer>> tree = new HashMap<>();

        for (int i = 1; i < n; i++) {
            int parentNode = parent[i];
            newParent[i] = parentNode;
            while (parentNode != -1) {
                if (arr[parentNode] == arr[i]) {
                    newParent[i] = parentNode;
                    break;
                }
                parentNode = parent[parentNode];
            }
        }

        for (int i = 1; i < n; i++) {
            if (!tree.containsKey(newParent[i])) {
                tree.put(newParent[i], new ArrayList<>());
            }

            tree.get(newParent[i]).add(i);
        }

        findNodes(0, tree);
        return finalAns;
    }

    private int findNodes(int parent, HashMap<Integer, ArrayList<Integer>> tree) {
        int count = 1;
        if (tree.containsKey(parent)) {
            for (int i : tree.get(parent)) {
                count += findNodes(i, tree);
            }
        }
        finalAns[parent] = count;
        return count;
    }
}
