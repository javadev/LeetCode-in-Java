package g0001_0100.s0096_unique_binary_search_trees;

public class Solution {
    public int numTrees(int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= 2 * n - i;
            result /= i + 1;
        }
        result /= n + 1;
        return (int) result;
    }
}
