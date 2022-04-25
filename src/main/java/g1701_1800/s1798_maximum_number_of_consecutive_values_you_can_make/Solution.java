package g1701_1800.s1798_maximum_number_of_consecutive_values_you_can_make;

// #Medium #Array #Greedy #2022_04_25_Time_11_ms_(96.30%)_Space_75.3_MB_(5.19%)

public class Solution {
    public int getMaximumConsecutive(int[] coins) {
        int[] count = new int[40001];
        for (int c : coins) {
            count[c]++;
        }
        int res = 1;
        for (int i = 1; i < count.length && i <= res; i++) {
            res += i * count[i];
        }
        return res;
    }
}
