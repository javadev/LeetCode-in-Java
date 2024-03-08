package g1401_1500.s1401_circle_and_rectangle_overlapping;

// #Medium #Math #Geometry #2022_04_29_Time_0_ms_(100.00%)_Space_40.5_MB_(68.97%)

public class Solution {
    public boolean checkOverlap(
            int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        // Find the closest point to the circle within the rectangle
        int closestX = clamp(xCenter, x1, x2);
        int closestY = clamp(yCenter, y1, y2);
        // Calculate the distance between the circle's center and this closest point
        int distanceX = xCenter - closestX;
        int distanceY = yCenter - closestY;
        // If the distance is less than the circle's radius, an intersection occurs
        int distanceSquared = distanceX * distanceX + distanceY * distanceY;
        return distanceSquared <= radius * radius;
    }

    private int clamp(int val, int min, int max) {
        return Math.max(min, Math.min(max, val));
    }
}
