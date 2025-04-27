package g3501_3600.s3533_concatenated_divisibility;

// #Hard #2025_04_27_Time_15_ms_(99.67%)_Space_45.97_MB_(94.68%)

import java.util.Arrays;

public class Solution {
    public int[] concatenatedDivisibility(int[] nums, int k) {
        Arrays.sort(nums);
        int digits = 0;
        int n = nums.length;
        int[] digCnt = new int[n];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            digits++;
            digCnt[i]++;
            while (num >= 10) {
                digits++;
                digCnt[i]++;
                num /= 10;
            }
        }
        int[] pow10 = new int[digits + 1];
        pow10[0] = 1;
        for (int i = 1; i <= digits; i++) {
            pow10[i] = (pow10[i - 1] * 10) % k;
        }
        int[] res = new int[n];
        return dfs(0, 0, k, digCnt, nums, pow10, new boolean[1 << n][k], 0, res, n)
                ? res
                : new int[0];
    }

    private boolean dfs(
            int mask,
            int residue,
            int k,
            int[] digCnt,
            int[] nums,
            int[] pow10,
            boolean[][] visited,
            int ansIdx,
            int[] ans,
            int n) {
        if (ansIdx == n) {
            return residue == 0;
        }
        if (visited[mask][residue]) {
            return false;
        }
        for (int i = 0, bit = 1; i < n; i++, bit <<= 1) {
            if ((mask & bit) == bit) {
                continue;
            }
            int newResidue = (residue * pow10[digCnt[i]] + nums[i]) % k;
            ans[ansIdx] = nums[i];
            if (dfs(mask | bit, newResidue, k, digCnt, nums, pow10, visited, ansIdx + 1, ans, n)) {
                return true;
            }
        }
        visited[mask][residue] = true;
        return false;
    }
}
