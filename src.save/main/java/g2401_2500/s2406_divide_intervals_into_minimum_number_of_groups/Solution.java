package g2401_2500.s2406_divide_intervals_into_minimum_number_of_groups;

// #Medium #Array #Sorting #Greedy #Two_Pointers #Heap_Priority_Queue #Prefix_Sum
// #2022_10_23_Time_144_ms_(71.27%)_Space_151.1_MB_(13.30%)

public class Solution {
    public int minGroups(int[][] intervals) {
        int maxElement = 0;
        for (int[] i : intervals) {
            maxElement = Math.max(maxElement, i[0]);
            maxElement = Math.max(maxElement, i[1]);
        }
        long[] prefixSum = new long[maxElement + 2];
        for (int[] i : intervals) {
            prefixSum[i[0]] += 1;
            prefixSum[i[1] + 1] -= 1;
        }
        long ans = 0;
        for (int i = 1; i <= maxElement + 1; i++) {
            prefixSum[i] += prefixSum[i - 1];
            ans = Math.max(ans, prefixSum[i]);
        }
        return (int) ans;
    }
}
