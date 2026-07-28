package g3801_3900.s3864_minimum_cost_to_partition_a_binary_string;

// #Hard #String #Prefix_Sum #Divide_and_Conquer #Senior_Staff #Weekly_Contest_492
// #2026_07_28_Time_28_ms_(100.00%)_Space_47.92_MB_(60.00%)

public class Solution {
    private int encCost;
    private int flatCost;
    private int[] pre;

    public long minCost(String s, int encCost, int flatCost) {
        pre = new int[s.length() + 1];
        for (int i = 1; i < pre.length; i++) {
            pre[i] = pre[i - 1] + (s.charAt(i - 1) - '0');
        }
        this.encCost = encCost;
        this.flatCost = flatCost;
        return helper(0, s.length());
    }

    private long helper(int l, int r) {
        int gap = r - l;
        int x = pre[r] - pre[l];
        if (x == 0) {
            return flatCost;
        }
        long cost = (long) gap * x * encCost;
        if (gap % 2 == 0) {
            int mid = l + (r - l) / 2;
            cost = Math.min(cost, helper(l, mid) + helper(mid, r));
        }
        return cost;
    }
}
