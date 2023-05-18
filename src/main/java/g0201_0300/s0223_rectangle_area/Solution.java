package g0201_0300.s0223_rectangle_area;

// #Medium #Math #Geometry #2022_07_04_Time_4_ms_(65.35%)_Space_43.4_MB_(31.18%)

@SuppressWarnings("java:S107")
public class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        long left = Math.max(ax1, bx1);
        long right = Math.min(ax2, bx2);
        long top = Math.min(ay2, by2);
        long bottom = Math.max(ay1, by1);
        long area = (right - left) * (top - bottom);
        // if not overlaping, either of these two will be non-posittive
        // if right - left = 0, are will automtically be 0 as well
        if (right - left < 0 || top - bottom < 0) {
            area = 0;
        }
        return (int) ((ax2 - ax1) * (ay2 - ay1) + (bx2 - bx1) * (by2 - by1) - area);
    }
}
