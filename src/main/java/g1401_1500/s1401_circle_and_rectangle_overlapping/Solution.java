package g1401_1500.s1401_circle_and_rectangle_overlapping;

// #Medium #Math #Geometry #2022_03_25_Time_2_ms_(6.67%)_Space_41.2_MB_(25.00%)

public class Solution {
    public boolean checkOverlap(
            int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        if (x1 <= xCenter && x2 >= xCenter && y1 <= yCenter && y2 >= yCenter) {
            return true;
        }
        int circleDistance = radius * radius;
        for (int x = x1; x <= x2; x++) {
            if (dist(x, y1, xCenter, yCenter) <= circleDistance) {
                return true;
            }
        }
        for (int x = x1; x <= x2; x++) {
            if (dist(x, y2, xCenter, yCenter) <= circleDistance) {
                return true;
            }
        }
        for (int y = y1; y <= y2; y++) {
            if (dist(x1, y, xCenter, yCenter) <= circleDistance) {
                return true;
            }
        }
        for (int y = y1; y <= y2; y++) {
            if (dist(x2, y, xCenter, yCenter) <= circleDistance) {
                return true;
            }
        }
        return false;
    }

    private int dist(int x1, int y1, int x2, int y2) {
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }
}
