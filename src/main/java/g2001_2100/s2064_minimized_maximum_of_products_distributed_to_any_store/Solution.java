package g2001_2100.s2064_minimized_maximum_of_products_distributed_to_any_store;

class Solution {
    public int minimizedMaximum(int n, int[] Q) {
        int min = 1, max = maxi(Q), ans = 0;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (condition(Q, mid, n)) {
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
            if (num % mid != 0) { // for ceil purpose.
                ans++;
            }
        }
        return ans <= n;
    }

    private int maxi(int[] arr) {
        int ans = 0;
        for (int n : arr) ans = Math.max(ans, n);
        return ans;
    }
}
