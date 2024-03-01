package g2501_2600.s2571_minimum_operations_to_reduce_an_integer_to_0;

// #Medium #Dynamic_Programming #Greedy #Bit_Manipulation
// #2023_08_21_Time_0_ms_(100.00%)_Space_39.4_MB_(38.98%)

public class Solution {
    public int minOperations(int n) {
        int cnt = 1;
        while (n != 0) {
            int num = 1;
            while (num <= n) {
                if (num == n) {
                    return cnt;
                }
                num *= 2;
            }
            n = Math.min(num - n, n - num / 2);
            cnt++;
        }
        return cnt;
    }
}
