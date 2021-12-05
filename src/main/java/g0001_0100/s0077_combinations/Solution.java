package g0001_0100.s0077_combinations;

// #Medium #Array #Backtracking

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@SuppressWarnings("java:S1149")
public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        // Boundary case
        if (n > 20 || k < 1 || k > n) {
            return ans;
        }
        backtrack(ans, n, k, 1, new Stack<>());
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, int n, int k, int s, Stack<Integer> stack) {
        // Base case
        // If k becomes 0
        if (k == 0) {
            ans.add(new ArrayList<>(stack));
            return;
        }
        // Start with s till n-k+1
        for (int i = s; i <= (n - k) + 1; i++) {
            stack.push(i);
            // Update start for recursion and decrease k by 1
            backtrack(ans, n, k - 1, i + 1, stack);
            stack.pop();
        }
    }
}
