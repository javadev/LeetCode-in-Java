package g1601_1700.s1672_richest_customer_wealth;

// #Easy #Array #Matrix #Programming_Skills_I_Day_6_Array
// #2022_04_23_Time_0_ms_(100.00%)_Space_44.1_MB_(7.31%)

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
