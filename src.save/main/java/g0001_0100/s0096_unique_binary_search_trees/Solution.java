package g0001_0100.s0096_unique_binary_search_trees;

// #Medium #Top_100_Liked_Questions #Dynamic_Programming #Math #Tree #Binary_Tree
// #Binary_Search_Tree #Acceptance_58.4% #Dynamic_Programming_I_Day_11
// #2022_02_21_Time_0_ms_(100.00%)_Space_41.5_MB_(6.36%)

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
