package g2401_2500.s2485_find_the_pivot_integer;

// #Easy #Math #Prefix_Sum #2023_01_26_Time_1_ms_(95.67%)_Space_39.2_MB_(91.00%)

public class Solution {
    public int pivotInteger(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int ad = 0;
        for (int i = 1; i <= n; i++) {
            ad += i - 1;
            sum -= i;
            if (sum == ad) {
                return i;
            }
        }
        return -1;
    }
}
