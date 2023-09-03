package g1001_1100.s1037_valid_boomerang;

// #Easy #Array #Math #Geometry #2022_02_27_Time_0_ms_(100.00%)_Space_41.7_MB_(21.15%)

public class Solution {
    public boolean isBoomerang(int[][] points) {
        return (points[1][1] - points[0][1]) * (points[2][0] - points[0][0])
                != (points[2][1] - points[0][1]) * (points[1][0] - points[0][0]);
    }
}
