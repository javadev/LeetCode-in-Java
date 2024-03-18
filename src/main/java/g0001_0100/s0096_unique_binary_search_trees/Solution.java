package g0001_0100.s0096_unique_binary_search_trees;

// #Medium #Dynamic_Programming #Math #Tree #Binary_Tree #Binary_Search_Tree
// #Dynamic_Programming_I_Day_11 #Big_O_Time_O(n)_Space_O(1)
// #2022_06_21_Time_0_ms_(100.00%)_Space_40.4_MB_(72.43%)

public class Solution {
    public int numTrees(int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= 2L * n - i;
            result /= i + 1;
        }
        result /= n + 1;
        return (int) result;
    }
}
