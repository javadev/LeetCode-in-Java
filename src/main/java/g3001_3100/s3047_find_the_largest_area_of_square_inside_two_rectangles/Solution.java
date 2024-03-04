package g3001_3100.s3047_find_the_largest_area_of_square_inside_two_rectangles;

// #Medium #Array #Math #Geometry #2024_03_04_Time_50_ms_(97.63%)_Space_44.7_MB_(98.11%)

public class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        int n = bottomLeft.length;
        long maxArea = 0;
        for (int i = 0; i < n; i++) {
            int ax = bottomLeft[i][0];
            int ay = bottomLeft[i][1];
            int bx = topRight[i][0];
            int by = topRight[i][1];
            for (int j = i + 1; j < n; j++) {
                int cx = bottomLeft[j][0];
                int cy = bottomLeft[j][1];
                int dx = topRight[j][0];
                int dy = topRight[j][1];
                int x1 = Math.max(ax, cx);
                int y1 = Math.max(ay, cy);
                int x2 = Math.min(bx, dx);
                int y2 = Math.min(by, dy);
                int minSide = Math.min(x2 - x1, y2 - y1);
                long area = (long) Math.pow(Math.max(minSide, 0), 2);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
