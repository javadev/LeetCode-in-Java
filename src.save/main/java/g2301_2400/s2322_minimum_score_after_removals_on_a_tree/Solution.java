package g2301_2400.s2322_minimum_score_after_removals_on_a_tree;

// #Hard #Array #Depth_First_Search #Tree #Bit_Manipulation
// #2022_06_30_Time_255_ms_(70.70%)_Space_117.2_MB_(57.14%)

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Solution {
    private int ans = Integer.MAX_VALUE;

    // function to travel 2nd time on the tree and find the second edge to be removed
    private int helper(
            int src, ArrayList<Integer>[] graph, int[] arr, int par, int block, int xor1, int tot) {
        // Setting the value for the current subtree's XOR value
        int myXOR = arr[src];
        for (int nbr : graph[src]) {
            // If the current nbr is niether the parent of this node nor the blocked node  , then
            // only we'll proceed
            if (nbr != par && nbr != block) {
                int nbrXOR = helper(nbr, graph, arr, src, block, xor1, tot);
                // 'src <----> nbr' is the second edge to be removed
                // Getting the XOR value of the current neighbor
                int xor2 = nbrXOR;
                // The XOR of the remaining component
                int xor3 = (tot ^ xor1) ^ xor2;
                // Getting the minimum of the three values
                int max = Math.max(xor1, Math.max(xor2, xor3));
                // Getting the maximum of the three value
                int min = Math.min(xor1, Math.min(xor2, xor3));
                ans = Math.min(ans, max - min);
                // Including the neighbour subtree's XOR value in the XOR value of the subtree
                // rooted at src node
                myXOR ^= nbrXOR;
            }
        }
        // Returing the XOR value of the current subtree rooted at the src node
        return myXOR;
    }

    // function to travel 1st time on the tree and find the first edge to be removed and
    // then block the node at which the edge ends to avoid selecting the same node again
    private int dfs(int src, ArrayList<Integer>[] graph, int[] arr, int par, int tot) {
        // Setting the value for the current subtree's XOR value
        int myXOR = arr[src];
        for (int nbr : graph[src]) {
            // If the current nbr is not the parent of this node, then only we'll proceed
            if (nbr != par) {
                // After selecting 'src <----> nbr' as the first edge, we block 'nbr' node and then
                // make a call to try all the second edges
                int nbrXOR = dfs(nbr, graph, arr, src, tot);
                // Calling the helper to find the try all the second edges after blocking the
                // current node
                helper(0, graph, arr, -1, nbr, nbrXOR, tot);
                // Including the neighbour subtree's XOR value in the XOR value of the subtree
                // rooted at src node
                myXOR ^= nbrXOR;
            }
        }
        // Returing the XOR value of the current subtree rooted at the src node
        return myXOR;
    }

    public int minimumScore(int[] arr, int[][] edges) {
        int n = arr.length;
        ArrayList<Integer>[] graph = new ArrayList[n];
        int tot = 0;
        for (int i = 0; i < n; i++) {
            // Initializing the graph and finding the total XOR
            graph[i] = new ArrayList<>();
            tot ^= arr[i];
        }
        for (int[] edge : edges) {
            // adding the edges
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }
        ans = Integer.MAX_VALUE;
        dfs(0, graph, arr, -1, tot);
        return ans;
    }
}
