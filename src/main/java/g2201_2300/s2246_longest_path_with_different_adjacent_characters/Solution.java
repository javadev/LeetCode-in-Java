package g2201_2300.s2246_longest_path_with_different_adjacent_characters;

// #Hard #Array #String #Depth_First_Search #Tree #Graph #Topological_Sort
// #2022_06_01_Time_75_ms_(97.79%)_Space_127.1_MB_(47.45%)

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public int longestPath(int[] parent, String s) {
        // for first max length
        int[] first = new int[s.length()];
        Arrays.fill(first, 0);
        // for second max length
        int[] second = new int[s.length()];
        Arrays.fill(second, 0);
        // for number of children for this node
        int[] children = new int[s.length()];
        Arrays.fill(children, 0);
        for (int i = 1; i != s.length(); i++) {
            // calculate all children for each node
            children[parent[i]]++;
        }
        // for traversal from leafs to root
        LinkedList<Integer> st = new LinkedList<>();
        // put all leafs
        for (int i = 1; i != s.length(); i++) {
            if (children[i] == 0) {
                st.add(i);
            }
        }
        // traversal from leafs to root
        while (!st.isEmpty()) {
            // fetch current node
            int i = st.pollLast();
            // if we in root - ignore it
            if (i == 0) {
                continue;
            }
            if (--children[parent[i]] == 0) {
                // decrease number of children by parent node and if number of children
                st.add(parent[i]);
            }
            // is equal 0 - our parent became a leaf
            // if letters isn't equal
            if (s.charAt(parent[i]) != s.charAt(i)) {
                // fetch maximal path from node
                int maxi = 1 + Math.max(first[i], second[i]);
                // and update maximal first and second path from parent
                if (maxi >= first[parent[i]]) {
                    second[parent[i]] = first[parent[i]];
                    first[parent[i]] = maxi;
                } else if (second[parent[i]] < maxi) {
                    second[parent[i]] = maxi;
                }
            }
        }
        // fetch answer
        int ans = 0;
        for (int i = 0; i != s.length(); i++) {
            ans = Math.max(ans, first[i] + second[i]);
        }
        return ans + 1;
    }
}
