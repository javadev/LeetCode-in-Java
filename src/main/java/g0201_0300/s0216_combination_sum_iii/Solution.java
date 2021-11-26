package g0201_0300.s0216_combination_sum_iii;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        solve(k, n, new ArrayList<>(), res, 0, 1);
        return res;
    }

    private void solve(
            int k, int target, List<Integer> temp, List<List<Integer>> res, int sum, int start) {
        if (sum == target && temp.size() == k) {
            res.add(new ArrayList<Integer>(temp));
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
