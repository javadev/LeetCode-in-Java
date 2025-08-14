package g3601_3700.s3638_maximum_balanced_shipments;

// #Medium #Array #Dynamic_Programming #Greedy #Stack #Monotonic_Stack #Weekly_Contest_461
// #2025_08_14_Time_2_ms_(100.00%)_Space_62.34_MB_(68.23%)

public class Solution {
    public int maxBalancedShipments(int[] weight) {
        int res = 0;
        int maxa = 0;
        for (int a : weight) {
            maxa = Math.max(maxa, a);
            if (a < maxa) {
                res++;
                maxa = 0;
            }
        }
        return res;
    }
}
