package g3201_3300.s3296_minimum_number_of_seconds_to_make_mountain_height_zero;

// #Medium #Array #Math #Binary_Search #2024_09_24_Time_6_ms_(100.00%)_Space_45.2_MB_(90.23%)

public class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 0;
        long right = (long) mountainHeight * (mountainHeight + 1) / 2 * workerTimes[0];
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (canReduceMountain(workerTimes, mountainHeight, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canReduceMountain(int[] workerTimes, int mountainHeight, long timeLimit) {
        long totalHeightReduced = 0;
        for (int workerTime : workerTimes) {
            long maxHeightThisWorker =
                    (long) (Math.sqrt(2.0 * timeLimit / workerTime + 0.25) - 0.5);
            totalHeightReduced += maxHeightThisWorker;
            if (totalHeightReduced >= mountainHeight) {
                return true;
            }
        }
        return totalHeightReduced >= mountainHeight;
    }
}
