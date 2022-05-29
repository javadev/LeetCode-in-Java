package g2001_2100.s2064_minimized_maximum_of_products_distributed_to_any_store;

// #Medium #Array #Binary_Search #2022_05_29_Time_65_ms_(70.18%)_Space_51.3_MB_(95.03%)

public class Solution {
    public int minimizedMaximum(int n, int[] q) {
        int min = 1;
        int max = maxi(q);
        int ans = 0;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (condition(q, mid, n)) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }

    private boolean condition(int[] arr, int mid, int n) {
        int ans = 0;
        for (int num : arr) {
            ans += (num) / mid;
            if (num % mid != 0) {
                ans++;
            }
        }
        return ans <= n;
    }

    private int maxi(int[] arr) {
        int ans = 0;
        for (int n : arr) {
            ans = Math.max(ans, n);
        }
        return ans;
    }
}
