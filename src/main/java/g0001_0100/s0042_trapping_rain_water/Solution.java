package g0001_0100.s0042_trapping_rain_water;

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming #Two_Pointers #Stack #Monotonic_Stack

public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }
        int l = 0;
        int r = height.length - 1;
        int maxL = height[l];
        int maxR = height[r];
        int res = 0;
        while (l < r) {
            if (maxL < maxR) {
                maxL = Math.max(height[++l], maxL);
                res += maxL - height[l];
            } else {
                maxR = Math.max(height[--r], maxR);
                res += maxR - height[r];
            }
        }
        return res;
    }
}
