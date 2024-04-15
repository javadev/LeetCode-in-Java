package g1501_1600.s1515_best_position_for_a_service_centre;

// #Hard #Math #Geometry #Randomized #2022_04_09_Time_6_ms_(87.14%)_Space_43_MB_(5.71%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public double getMinDistSum(int[][] positions) {
        double minX = Integer.MAX_VALUE;
        double minY = Integer.MAX_VALUE;
        double maxX = Integer.MIN_VALUE;
        double maxY = Integer.MIN_VALUE;
        for (int[] pos : positions) {
            maxX = Math.max(maxX, pos[0]);
            maxY = Math.max(maxY, pos[1]);
            minX = Math.min(minX, pos[0]);
            minY = Math.min(minY, pos[1]);
        }
        double xMid = minX + (maxX - minX) / 2;
        double yMid = minY + (maxY - minY) / 2;

        double jump = Math.max(maxX - minX, maxY - minY);

        double ans = getTotalDistance(xMid, yMid, positions);

        while (jump > 0.00001) {
            List<double[]> list = getFourCorners(xMid, yMid, jump);
            boolean found = false;
            for (double[] point : list) {
                double pointAns = getTotalDistance(point[0], point[1], positions);
                if (ans > pointAns) {
                    xMid = point[0];
                    yMid = point[1];
                    ans = pointAns;
                    found = true;
                }
            }

            if (!found) {
                jump = jump / 2;
            }
        }

        return ans;
    }

    private List<double[]> getFourCorners(double xMid, double yMid, double jump) {
        List<double[]> list = new ArrayList<>();
        list.add(new double[] {xMid - jump, yMid + jump});
        list.add(new double[] {xMid + jump, yMid + jump});
        list.add(new double[] {xMid - jump, yMid - jump});
        list.add(new double[] {xMid + jump, yMid - jump});

        return list;
    }

    private double getTotalDistance(double x, double y, int[][] positions) {
        double totalDistanceSum = 0;
        for (int[] point : positions) {
            double xDistance = x - point[0];
            double yDistance = y - point[1];
            totalDistanceSum += Math.sqrt(xDistance * xDistance + yDistance * yDistance);
        }

        return totalDistanceSum;
    }
}
