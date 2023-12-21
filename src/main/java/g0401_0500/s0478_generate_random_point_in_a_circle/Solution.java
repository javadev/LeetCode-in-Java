package g0401_0500.s0478_generate_random_point_in_a_circle;

// #Medium #Math #Geometry #Randomized #Rejection_Sampling
// #2022_07_20_Time_342_ms_(56.21%)_Space_128_MB_(45.56%)

import java.util.Random;

@SuppressWarnings("java:S2245")
public class Solution {
    private final double radius;
    private final double xCenter;
    private final double yCenter;
    private final Random random = new Random();

    public Solution(double radius, double xCenter, double yCenter) {
        this.radius = radius;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public double[] randPoint() {
        double x = getCoordinate(xCenter);
        double y = getCoordinate(yCenter);
        while (getDistance(x, y) >= radius * radius) {
            x = getCoordinate(xCenter);
            y = getCoordinate(yCenter);
        }
        return new double[] {x, y};
    }

    private double getDistance(double x, double y) {
        return (xCenter - x) * (xCenter - x) + (yCenter - y) * (yCenter - y);
    }

    private double getCoordinate(double center) {
        return center - radius + random.nextDouble() * 2 * radius;
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */
