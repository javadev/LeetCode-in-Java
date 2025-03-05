package g0001_0100.s0069_sqrtx;

// #Easy #Top_Interview_Questions #Math #Binary_Search #Binary_Search_I_Day_4
// #Top_Interview_150_Math #2025_03_05_Time_1_ms_(86.67%)_Space_41.11_MB_(29.05%)

public class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x / 2;
        int sqrt = start + (end - start) / 2;
        if (x == 0) {
            return 0;
        }
        while (start <= end) {
            if (sqrt == x / sqrt) {
                return sqrt;
            } else if (sqrt > x / sqrt) {
                end = sqrt - 1;
            } else if (sqrt < x / sqrt) {
                start = sqrt + 1;
            }
            sqrt = start + (end - start) / 2;
        }
        if (sqrt > x / sqrt) {
            return sqrt - 1;
        } else {
            return sqrt;
        }
    }
}
