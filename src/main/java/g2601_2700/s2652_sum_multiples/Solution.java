package g2601_2700.s2652_sum_multiples;

// #Easy #Array #Math #Number_Theory #2023_09_06_Time_1_ms_(99.87%)_Space_39.6_MB_(64.42%)

public class Solution {
    public int sumOfMultiples(int n) {
        return sumOfDivisible(n, 3)
                + sumOfDivisible(n, 5)
                + sumOfDivisible(n, 7)
                - (sumOfDivisible(n, 15) + sumOfDivisible(n, 35) + sumOfDivisible(n, 21))
                + sumOfDivisible(n, 105);
    }

    private int sumOfDivisible(int n, int value) {
        int high = (n / value) * value;
        int count = (high + value - value) / value;
        return (value + high) * count / 2;
    }
}
