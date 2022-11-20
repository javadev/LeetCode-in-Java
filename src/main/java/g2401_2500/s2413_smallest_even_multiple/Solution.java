package g2401_2500.s2413_smallest_even_multiple;

// #Easy #Math #Number_Theory #2022_11_15_Time_0_ms_(100.00%)_Space_40.9_MB_(48.99%)

public class Solution {
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }
}
