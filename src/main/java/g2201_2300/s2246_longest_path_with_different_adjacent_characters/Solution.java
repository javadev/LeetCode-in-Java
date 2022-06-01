package g2201_2300.s2246_longest_path_with_different_adjacent_characters;

// #Hard #Array #String #Depth_First_Search #Tree #Graph #Topological_Sort
// #2022_06_01_Time_75_ms_(97.79%)_Space_127.1_MB_(47.45%)

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public int longestPath(int[] parent, String S) {
        // for first max length
        int[] f = new int[S.length()];
        Arrays.fill(f, 0);
        // for second max length
        int[] s = new int[S.length()];
        Arrays.fill(s, 0);
        // for number of children for this node
        int[] c = new int[S.length()];
        Arrays.fill(c, 0);
        for (int i = 1; i != S.length(); i++) {
            // calculate all children for each node
            c[parent[i]]++;
        }
        // for traversal from leafs to root
        LinkedList<Integer> st = new LinkedList<>();
        // put all leafs
        for (int i = 1; i != S.length(); i++) {
            if (c[i] == 0) {
                st.add(i);
            }
        }
        // traversal from leafs to root
        while (st.size() != 0) {
            // fetch current node
            int i = st.pollLast();
            // if we in root - ignore it
            if (i == 0) {
                continue;
            }
            if (--c[parent[i]] == 0) {
                // decrease number of children by parent node and if number of children
                st.add(parent[i]);
            }
            // is equal 0 - our parent became a leaf
            // if leterrs isnt equal
            if (S.charAt(parent[i]) != S.charAt(i)) {
                // fetch maximal path from node
                int maxi = 1 + Math.max(f[i], s[i]);
                // and update maximal first and second path from parent
                if (maxi >= f[parent[i]]) {
                    s[parent[i]] = f[parent[i]];
                    f[parent[i]] = maxi;
                } else if (s[parent[i]] < maxi) {
                    s[parent[i]] = maxi;
                }
            }
        }
        // fetch answer
        int ans = 0;
        for (int i = 0; i != S.length(); i++) {
            ans = Math.max(ans, f[i] + s[i]);
        }
        return ans + 1;
    }
}
