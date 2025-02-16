package g3401_3500.s3453_separate_squares_i;

// #Medium #2025_02_16_Time_123_ms_(100.00%)_Space_87.97_MB_(_%)

public class Solution {
    private double helper(double line, int[][] squares) {
        double aAbove = 0;
        double aBelow = 0;
        for (int[] square : squares) {
            int y = square[1];
            int l = square[2];
            double total = (double) l * l;
            if (line <= y) {
                aAbove += total;
            } else if (line >= y + l) {
                aBelow += total;
            } else {
                // The line intersects the square.
                double aboveHeight = (y + l) - line;
                double belowHeight = line - y;
                aAbove += l * aboveHeight;
                aBelow += l * belowHeight;
            }
        }
        return aAbove - aBelow;
    }

    public double separateSquares(int[][] squares) {
        double lo = 0;
        double hi = 2 * 1e9;
        for (int i = 0; i < 60; i++) {
            double mid = (lo + hi) / 2.0;
            double diff = helper(mid, squares);
            if (diff > 0) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        return hi;
    }
}
