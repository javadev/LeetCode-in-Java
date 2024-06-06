package g3101_3200.s3169_count_days_without_meetings;

// #Medium #Array #Sorting #2024_06_06_Time_11_ms_(99.96%)_Space_113.7_MB_(5.10%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int countDays(int days, int[][] meetings) {
        List<int[]> availableDays = new ArrayList<>();
        availableDays.add(new int[] {1, days});
        // Iterate through each meeting
        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            List<int[]> newAvailableDays = new ArrayList<>();
            // Iterate through available days and split the intervals
            for (int[] interval : availableDays) {
                if (start > interval[1] || end < interval[0]) {
                    // No overlap, keep the interval
                    newAvailableDays.add(interval);
                } else {
                    // Overlap, split the interval
                    if (interval[0] < start) {
                        newAvailableDays.add(new int[] {interval[0], start - 1});
                    }
                    if (interval[1] > end) {
                        newAvailableDays.add(new int[] {end + 1, interval[1]});
                    }
                }
            }
            availableDays = newAvailableDays;
        }
        // Count the remaining available days
        int availableDaysCount = 0;
        for (int[] interval : availableDays) {
            availableDaysCount += interval[1] - interval[0] + 1;
        }
        return availableDaysCount;
    }
}
