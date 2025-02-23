package g3401_3500.s3464_maximize_the_distance_between_points_on_a_square;

// #Hard #2025_02_23_Time_222_ms_(100.00%)_Space_52.33_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public int maxDistance(int sideLength, int[][] points, int requiredPoints) {
        long perimeter = 4L * sideLength;
        int numPoints = points.length;
        long[] mappedPositions = new long[numPoints];
        for (int i = 0; i < numPoints; i++) {
            mappedPositions[i] = mapToPerimeter(sideLength, points[i][0], points[i][1]);
        }
        Arrays.sort(mappedPositions);
        long low = 0;
        long high = perimeter;
        while (low < high) {
            long mid = (low + high + 1) / 2;
            if (isValidDistance(mid, requiredPoints, mappedPositions, perimeter)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return (int) low;
    }

    private long mapToPerimeter(int sideLength, int x, int y) {
        if (y == sideLength) {
            return x;
        }
        if (x == sideLength) {
            return sideLength + (sideLength - y);
        }
        if (y == 0) {
            return 2L * sideLength + (sideLength - x);
        }
        return 3L * sideLength + y;
    }

    private boolean isValidDistance(
            long minDistance, int requiredPoints, long[] mappedPositions, long perimeter) {
        int numPoints = mappedPositions.length;
        long[] extendedPositions = new long[2 * numPoints];
        for (int i = 0; i < numPoints; i++) {
            extendedPositions[i] = mappedPositions[i];
            extendedPositions[i + numPoints] = mappedPositions[i] + perimeter;
        }
        for (int i = 0; i < numPoints; i++) {
            if (canSelectRequiredPoints(
                    i,
                    minDistance,
                    requiredPoints,
                    mappedPositions,
                    extendedPositions,
                    perimeter)) {
                return true;
            }
        }
        return false;
    }

    private boolean canSelectRequiredPoints(
            int startIndex,
            long minDistance,
            int requiredPoints,
            long[] mappedPositions,
            long[] extendedPositions,
            long perimeter) {
        int selectedCount = 1;
        long previousPosition = mappedPositions[startIndex];
        int currentIndex = startIndex;
        for (int i = 1; i < requiredPoints; i++) {
            long targetPosition = previousPosition + minDistance;
            int left = currentIndex + 1;
            int right = startIndex + mappedPositions.length;
            int nextIndex = lowerBound(extendedPositions, left, right, targetPosition);
            if (nextIndex >= right) {
                return false;
            }
            selectedCount++;
            previousPosition = extendedPositions[nextIndex];
            currentIndex = nextIndex;
        }
        return selectedCount == requiredPoints
                && (previousPosition - mappedPositions[startIndex] <= perimeter - minDistance);
    }

    private int lowerBound(long[] arr, int left, int right, long target) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
