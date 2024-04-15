package g0201_0300.s0216_combination_sum_iii;

// #Medium #Array #Backtracking #Udemy_Backtracking/Recursion
// #2022_07_02_Time_1_ms_(81.35%)_Space_41.8_MB_(46.36%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S5413")
public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        solve(k, n, new ArrayList<>(), res, 0, 1);
        return res;
    }

    private void solve(
            int k, int target, List<Integer> temp, List<List<Integer>> res, int sum, int start) {
        if (sum == target && temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }
        if (temp.size() >= k) {
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = start; i <= 9; i++) {
            temp.add(i);
            solve(k, target, temp, res, sum + i, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
