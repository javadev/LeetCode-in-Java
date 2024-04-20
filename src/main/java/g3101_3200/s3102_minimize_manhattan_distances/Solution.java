package g3101_3200.s3102_minimize_manhattan_distances;

// #Hard #Array #Math #2024_04_20_Time_3_ms_(99.73%)_Space_82.4_MB_(44.95%)

public class Solution {
    private int manhattan(int[][] points, int i, int j) {
        return Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
    }

    private int[] maxManhattanDistance(int[][] points, int remove) {
        int n = points.length;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        int minDiff = Integer.MAX_VALUE;
        int maxSumIndex = -1;
        int minSumIndex = -1;
        int maxDiffIndex = -1;
        int minDiffIndex = -1;
        for (int i = 0; i < n; i++) {
            if (i != remove) {
                int sum = points[i][0] + points[i][1];
                int diff = points[i][0] - points[i][1];
                if (sum > maxSum) {
                    maxSumIndex = i;
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSumIndex = i;
                    minSum = sum;
                }
                if (diff > maxDiff) {
                    maxDiffIndex = i;
                    maxDiff = diff;
                }
                if (diff < minDiff) {
                    minDiffIndex = i;
                    minDiff = diff;
                }
            }
        }
        return Math.max(maxSum - minSum, maxDiff - minDiff) == maxSum - minSum
                ? new int[] {maxSumIndex, minSumIndex}
                : new int[] {maxDiffIndex, minDiffIndex};
    }

    public int minimumDistance(int[][] points) {
        int[] m = maxManhattanDistance(points, -1);
        int[] m1 = maxManhattanDistance(points, m[0]);
        int[] m2 = maxManhattanDistance(points, m[1]);
        return Math.min(manhattan(points, m1[0], m1[1]), manhattan(points, m2[0], m2[1]));
    }
}
