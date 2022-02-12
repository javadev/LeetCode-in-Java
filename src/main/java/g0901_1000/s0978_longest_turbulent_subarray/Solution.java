package g0901_1000.s0978_longest_turbulent_subarray;

// #Medium #Array #Dynamic_Programming #Sliding_Window

public class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        int ans = 1;
        int l;
        int r;
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return arr[0] == arr[1] ? 1 : 2;
        }
        for (l = 0, r = 1; r < n - 1; r++) {
            int dif_l = arr[r] - arr[r - 1], dif_r = arr[r] - arr[r + 1];
            if (dif_l == 0 && dif_r == 0) {
                l = r + 1;
            } else if (dif_l == 0) {
                ans = Math.max(ans, r - l);
                l = r;
            } else if (!((dif_l < 0 && dif_r < 0) || (dif_l > 0 && dif_r > 0))) {
                ans = Math.max(ans, r - l + 1);
                l = r;
            }
        }
        return Math.max(ans, r - l + 1);
    }
}
