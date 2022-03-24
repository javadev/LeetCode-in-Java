package g0801_0900.s0836_rectangle_overlap;

// #Easy #Math #Geometry #2022_03_24_Time_0_ms_(100.00%)_Space_41.6_MB_(35.43%)

public class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[0] < rec2[2] && rec2[0] < rec1[2] && rec1[1] < rec2[3] && rec2[1] < rec1[3];
    }
}
