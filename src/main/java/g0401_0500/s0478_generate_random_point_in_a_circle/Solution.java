package g0401_0500.s0478_generate_random_point_in_a_circle;

// #Medium #Math #Geometry #Randomized #Rejection_Sampling

import java.security.SecureRandom;

public class Solution {
    private final double radius;
    private final double x_center;
    private final double y_center;
    private final SecureRandom random = new SecureRandom();

    public Solution(double radius, double x_center, double y_center) {

        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }

    public double[] randPoint() {
        double x = getCoordinate(x_center);
        double y = getCoordinate(y_center);
        while (getDistance(x, y) >= radius * radius) {
            x = getCoordinate(x_center);
            y = getCoordinate(y_center);
        }
        return new double[] {x, y};
    }

    private double getDistance(double x, double y) {
        return (x_center - x) * (x_center - x) + (y_center - y) * (y_center - y);
    }

    private double getCoordinate(double center) {
        return center - radius + random.nextDouble() * 2 * radius;
    }
}
