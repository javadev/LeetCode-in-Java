package g2101_2200.s2177_find_three_consecutive_integers_that_sum_to_a_given_number;

// #Medium #Math #Simulation #2022_06_06_Time_1_ms_(78.46%)_Space_42_MB_(56.19%)

public class Solution {
    public long[] sumOfThree(long num) {
        if (num % 3 == 0) {
            return new long[] {num / 3 - 1, num / 3, num / 3 + 1};
        }
        return new long[0];
    }
}
