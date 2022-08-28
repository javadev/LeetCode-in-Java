package g0601_0700.s0667_beautiful_arrangement_ii;

// #Medium #Array #Math #2022_03_22_Time_1_ms_(84.62%)_Space_42.4_MB_(81.82%)

public class Solution {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        int left = 1;
        int right = n;
        for (int i = 0; i < n; i++) {
            res[i] = k % 2 == 0 ? left++ : right--;
            if (k > 1) {
                k--;
            }
        }
        return res;
    }
}
