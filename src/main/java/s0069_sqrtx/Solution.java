package s0069_sqrtx;

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
