package g0501_0600.s0539_minimum_time_difference;

// #Medium #Array #String #Math #Sorting #2022_08_02_Time_2_ms_(99.62%)_Space_44.5_MB_(75.58%)

import java.util.Arrays;
import java.util.List;

public class Solution {
    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size() < 300) {
            return smallInputSize(timePoints);
        }
        return largeInputSize(timePoints);
    }

    private int largeInputSize(List<String> timePoints) {
        boolean[] times = new boolean[60 * 24];
        for (String time : timePoints) {
            int hours = Integer.parseInt(time.substring(0, 2));
            int minutes = Integer.parseInt(time.substring(3, 5));
            if (times[hours * 60 + minutes]) {
                return 0;
            }
            times[hours * 60 + minutes] = true;
        }
        int prev = -1;
        int min = 60 * 24;
        for (int i = 0; i < (times.length + times.length / 2); i++) {
            if (i < times.length) {
                if (times[i] && prev == -1) {
                    prev = i;
                } else if (times[i]) {
                    min = Math.min(min, i - prev);
                    prev = i;
                }
            } else {
                if (times[i - times.length] && prev == -1) {
                    prev = i;
                } else if (times[i - times.length]) {
                    min = Math.min(min, i - prev);
                    prev = i;
                }
            }
        }
        return min;
    }

    private int smallInputSize(List<String> timePoints) {
        int[] times = new int[timePoints.size()];
        int j = 0;
        for (String time : timePoints) {
            int hours = Integer.parseInt(time.substring(0, 2));
            int minutes = Integer.parseInt(time.substring(3, 5));
            times[j++] = hours * 60 + minutes;
        }
        Arrays.sort(times);
        int min = 60 * 24;
        for (int i = 1; i <= times.length; i++) {
            if (i == times.length) {
                min = Math.min(min, (times[0] + 60 * 24) - times[times.length - 1]);
            } else {
                min = Math.min(min, times[i] - times[i - 1]);
            }
            if (min == 0) {
                return 0;
            }
        }
        return min;
    }
}
