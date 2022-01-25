package g0101_0200.s0152_maximum_product_subarray;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming

public class Solution {
    public int maxProduct(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int cprod = 1;
        for (int i = 0; i < arr.length; i++) {
            cprod = cprod * arr[i];
            ans = Math.max(ans, cprod);
            if (cprod == 0) {
                cprod = 1;
            }
        }
        cprod = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            cprod = cprod * arr[i];
            ans = Math.max(ans, cprod);
            if (cprod == 0) {
                cprod = 1;
            }
        }
        return ans;
    }
}
