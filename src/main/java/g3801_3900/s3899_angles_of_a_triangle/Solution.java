package g3801_3900.s3899_angles_of_a_triangle;

// #Medium #Array #Math #Geometry #Senior #Weekly_Contest_497
// #2026_09_17_Time_1_ms_(100.00%)_Space_49.33_MB_(42.62%)

public class Solution {
    public double[] internalAngles(int[] sides) {
        if (sides[0] + sides[1] <= sides[2]
                || sides[1] + sides[2] <= sides[0]
                || sides[0] + sides[2] <= sides[1]) {
            return new double[0];
        }
        double[] angle = new double[sides.length];
        angle[0] =
                Math.toDegrees(
                        Math.acos(
                                (double)
                                                (sides[1] * sides[1]
                                                        + sides[2] * sides[2]
                                                        - sides[0] * sides[0])
                                        / (2 * sides[1] * sides[2])));
        angle[1] =
                Math.toDegrees(
                        Math.acos(
                                (double)
                                                (sides[0] * sides[0]
                                                        + sides[2] * sides[2]
                                                        - sides[1] * sides[1])
                                        / (2 * sides[0] * sides[2])));
        angle[2] =
                Math.toDegrees(
                        Math.acos(
                                (double)
                                                (sides[1] * sides[1]
                                                        + sides[0] * sides[0]
                                                        - sides[2] * sides[2])
                                        / (2 * sides[1] * sides[0])));
        double max = angle[0];
        double mid = 0;
        double min = 0;
        for (int i = 1; i < angle.length; i++) {
            if (angle[i] > max) {
                min = mid;
                mid = max;
                max = angle[i];
            } else {
                if (angle[i] > mid) {
                    min = mid;
                    mid = angle[i];
                } else {
                    min = angle[i];
                }
            }
        }
        angle[0] = min;
        angle[1] = mid;
        angle[2] = max;
        return angle;
    }
}
