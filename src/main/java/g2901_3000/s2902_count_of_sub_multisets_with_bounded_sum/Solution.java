package g2901_3000.s2902_count_of_sub_multisets_with_bounded_sum;

// #Hard #Array #Hash_Table #Dynamic_Programming #Sliding_Window
// #2023_12_26_Time_2146_ms_(5.39%)_Space_70.7_MB_(23.08%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {
    private static final int MOD = (int) 1e9 + 7;
    private HashMap<Integer, Integer> map;
    private int[][] dp;

    private int solve(ArrayList<Integer> al, int l, int r, int index, int sum) {
        if (sum > r) {
            return 0;
        }
        long ans = 0;
        if (index >= al.size()) {
            return (int) ans;
        }
        if (dp[index][sum] != -1) {
            return dp[index][sum];
        }
        int cur = al.get(index);
        int count = map.get(cur);
        for (int i = 0; i <= count; i++) {
            int curSum = sum + cur * i;
            if (curSum > r) {
                break;
            }
            ans = ans + solve(al, l, r, index + 1, curSum);
            if (i != 0 && curSum >= l) {
                ans = ans + 1;
            }
            ans = ans % MOD;
        }
        dp[index][sum] = (int) ans;
        return (int) ans;
    }

    public int countSubMultisets(List<Integer> nums, int l, int r) {
        map = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        for (int cur : nums) {
            int count = map.getOrDefault(cur, 0) + 1;
            map.put(cur, count);
            if (count == 1) {
                al.add(cur);
            }
        }
        int n = al.size();
        dp = new int[n][r + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        Collections.sort(al);
        int ans = solve(al, l, r, 0, 0);
        if (l == 0) {
            ans = ans + 1;
        }
        ans = ans % MOD;
        return ans;
    }
}
