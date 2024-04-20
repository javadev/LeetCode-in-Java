package g2801_2900.s2833_furthest_point_from_origin;

// #Easy #Array #Counting #2023_12_11_Time_1_ms_(100.00%)_Space_41.4_MB_(50.89%)

public class Solution {
    public int furthestDistanceFromOrigin(String m) {
        int count = 0;
        int res = 0;
        for (int i = 0; i < m.length(); i++) {
            if (m.charAt(i) == 'L') {
                res -= 1;
            } else if (m.charAt(i) == 'R') {
                res += 1;
            } else {
                count++;
            }
        }
        return Math.abs(res) + count;
    }
}
