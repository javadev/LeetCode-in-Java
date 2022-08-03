package g1301_1400.s1304_find_n_unique_integers_sum_up_to_zero;

// #Easy #Array #Math #2022_03_14_Time_0_ms_(100.00%)_Space_42.2_MB_(40.15%)

public class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int start = -n / 2;
        for (int i = 0; i < n / 2; i++) {
            result[i] = start++;
        }
        if (n % 2 == 0) {
            start++;
        }
        for (int i = n / 2; i < n; i++) {
            result[i] = start++;
        }
        return result;
    }
}
