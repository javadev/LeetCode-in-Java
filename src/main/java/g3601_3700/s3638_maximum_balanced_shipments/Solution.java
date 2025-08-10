package g3601_3700.s3638_maximum_balanced_shipments;

// #Medium #Weekly_Contest_461 #2025_08_03_Time_3_ms_(100.00%)_Space_62.17_MB_(100.00%)

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
