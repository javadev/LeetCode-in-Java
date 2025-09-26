package g3601_3700.s3689_maximum_total_subarray_value_i;

// #Medium #Array #Greedy #Weekly_Contest_468
// #2025_09_26_Time_1_ms_(100.00%)_Space_55.58_MB_(71.81%)

public class Solution {
    public long maxTotalValue(int[] num, int k) {
        int mxv = Integer.MIN_VALUE;
        int mnv = Integer.MAX_VALUE;
        for (int val : num) {
            mxv = Math.max(mxv, val);
            mnv = Math.min(mnv, val);
        }
        return (long) (mxv - mnv) * k;
    }
}
