package g0201_0300.s0223_rectangle_area;

// #Medium #Math #Geometry

@SuppressWarnings("java:S107")
public class Solution {
    public int computeArea(int a, int b, int c, int d, int e, int f, int g, int h) {
        long left = Math.max(a, e);
        long right = Math.min(c, g);
        long top = Math.min(d, h);
        long bottom = Math.max(b, f);

        long area = (right - left) * (top - bottom);
        // if not overlaping, either of these two will be non-posittive
        // if right - left = 0, are will automtically be 0 as well
        if (right - left < 0 || top - bottom < 0) {
            area = 0;
        }
        return (int) ((c - a) * (d - b) + (g - e) * (h - f) - area);
    }
}
