package g3801_3900.s3814_maximum_capacity_within_budget;

// #Medium #Array #Sorting #Binary_Search #Two_Pointers #Senior #Weekly_Contest_485
// #2026_06_09_Time_8_ms_(100.00%)_Space_162.19_MB_(100.00%)

public class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int[] mxCap = new int[budget];
        int maxCap = 0;
        for (int i = 0; i < costs.length; i++) {
            int cost = costs[i];
            int cap = capacity[i];
            if (cost >= budget) {
                continue;
            }
            maxCap = Math.max(maxCap, cap);
            if (cost * 2 < budget) {
                maxCap = Math.max(maxCap, mxCap[cost] + cap);
            }
            if (cap > mxCap[cost]) {
                mxCap[cost] = cap;
            }
        }
        int[] preSum = new int[budget];
        for (int i = 1; i < budget; i++) {
            int rem = Math.min(budget - i - 1, i - 1);
            maxCap = Math.max(maxCap, mxCap[i] + preSum[rem]);
            preSum[i] = Math.max(preSum[i - 1], mxCap[i]);
        }
        return maxCap;
    }
}
