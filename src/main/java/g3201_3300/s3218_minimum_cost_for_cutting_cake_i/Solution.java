package g3201_3300.s3218_minimum_cost_for_cutting_cake_i;

// #Medium #Array #Dynamic_Programming #Sorting #Greedy
// #2024_07_18_Time_0_ms_(100.00%)_Space_42.4_MB_(32.85%)

@SuppressWarnings("java:S1172")
public class Solution {
    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        int sum = 0;
        for (int hc : horizontalCut) {
            sum += hc;
        }
        for (int vc : verticalCut) {
            sum += vc;
        }
        for (int hc : horizontalCut) {
            for (int vc : verticalCut) {
                sum += Math.min(hc, vc);
            }
        }
        return sum;
    }
}
