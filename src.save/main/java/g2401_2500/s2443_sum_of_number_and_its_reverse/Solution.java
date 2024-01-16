package g2401_2500.s2443_sum_of_number_and_its_reverse;

// #Medium #Math #Enumeration #2022_12_13_Time_265_ms_(80.33%)_Space_39.5_MB_(89.70%)

public class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for (int i = 0; i <= num; ++i) {
            int n = i;
            int r = 0;
            while (n != 0) {
                r = r * 10 + n % 10;
                n = n / 10;
            }
            if (r + i == num) {
                return true;
            }
        }
        return false;
    }
}
