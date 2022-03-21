package g1301_1400.s1362_closest_divisors;

// #Medium #Math #2022_03_21_Time_8_ms_(84.91%)_Space_39.9_MB_(79.25%)

public class Solution {
    public int[] closestDivisors(int num) {
        int sqrt1 = (int) Math.sqrt(num + 1.0);
        int sqrt2 = (int) Math.sqrt(num + 2.0);
        if (sqrt1 * sqrt1 == num + 1) {
            return new int[] {sqrt1, sqrt1};
        }
        if (sqrt2 * sqrt2 == num + 2) {
            return new int[] {sqrt2, sqrt2};
        }
        int[] ans1 = new int[2];
        for (int i = sqrt1; i >= 1; i--) {
            if ((num + 1) % i == 0) {
                ans1 = new int[] {i, (num + 1) / i};
                break;
            }
        }
        int[] ans2 = new int[2];
        for (int i = sqrt2; i >= 1; i--) {
            if ((num + 2) % i == 0) {
                ans2 = new int[] {i, (num + 2) / i};
                break;
            }
        }
        return Math.abs(ans2[0] - ans2[1]) < Math.abs(ans1[0] - ans1[1]) ? ans2 : ans1;
    }
}
