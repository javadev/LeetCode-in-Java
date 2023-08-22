package g2501_2600.s2575_find_the_divisibility_array_of_a_string;

// #Medium #Array #String #Math #2023_08_22_Time_6_ms_(100.00%)_Space_56.4_MB_(49.79%)

public class Solution {
    public int[] divisibilityArray(String word, int m) {
        int n = word.length();
        long modulo = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int numericValue = word.charAt(i) - '0';
            modulo = (modulo * 10 + numericValue) % m;
            if (modulo == 0) {
                result[i] = 1;
            }
        }
        return result;
    }
}
