package g1901_2000.s1952_three_divisors;

// #Easy #Math #2022_05_18_Time_3_ms_(6.76%)_Space_39.9_MB_(72.52%)

public class Solution {
    public boolean isThree(int n) {
        int divisors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors++;
            }
        }
        return divisors == 3;
    }
}
