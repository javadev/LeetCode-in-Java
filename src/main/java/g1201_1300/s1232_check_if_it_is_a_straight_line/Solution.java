package g1201_1300.s1232_check_if_it_is_a_straight_line;

// #Easy #Array #Math #Geometry #Programming_Skills_I_Day_5_Function
// #2022_03_12_Time_0_ms_(100.00%)_Space_44.2_MB_(26.46%)

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int deltaX1 = coordinates[0][0] - coordinates[1][0];
        int deltaY1 = coordinates[0][1] - coordinates[1][1];
        int[] prev = coordinates[1];
        for (int i = 2; i < coordinates.length; ++i) {
            int[] point = coordinates[i];
            int deltaX2 = point[0] - prev[0];
            int deltaY2 = point[1] - prev[1];
            if (deltaX1 * deltaY2 != deltaX2 * deltaY1) {
                return false;
            }
        }
        return true;
    }
}
