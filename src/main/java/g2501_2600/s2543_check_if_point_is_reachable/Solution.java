package g2501_2600.s2543_check_if_point_is_reachable;

// #Hard #Math #Number_Theory #2023_05_11_Time_0_ms_(100.00%)_Space_39.3_MB_(70.37%)

public class Solution {
    public boolean isReachable(int x, int y) {
        int g = gcd(x, y);
        return (g & (g - 1)) == 0;
    }

    private int gcd(int x, int y) {
        while (x != 0) {
            int tmp = x;
            x = y % x;
            y = tmp;
        }
        return y;
    }
}
