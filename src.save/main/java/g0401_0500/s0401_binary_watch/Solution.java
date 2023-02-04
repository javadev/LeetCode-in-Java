package g0401_0500.s0401_binary_watch;

// #Easy #Bit_Manipulation #Backtracking #2022_07_15_Time_1_ms_(99.26%)_Space_43.1_MB_(42.54%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> times = new ArrayList<>();
        for (int hour = 0; hour <= 11; hour++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                readBinaryWatchHelper(turnedOn, times, hour, minutes);
            }
        }
        return times;
    }

    private void readBinaryWatchHelper(
            int turnedOn, List<String> selectedTimes, int hour, int minutes) {
        if (isValidTime(turnedOn, hour, minutes)) {
            selectedTimes.add(getTimeString(hour, minutes));
        }
    }

    private String getTimeString(int hour, int minutes) {
        StringBuilder time = new StringBuilder();
        time.append(hour);
        time.append(':');
        if (minutes < 10) {
            time.append('0');
        }
        time.append(minutes);
        return time.toString();
    }

    private boolean isValidTime(int turnedOn, int hour, int minutes) {
        int counter = 0;
        while (hour != 0) {
            if ((hour & 1) == 1) {
                counter++;
            }
            hour >>>= 1;
        }
        if (counter > turnedOn) {
            return false;
        }
        while (minutes != 0) {
            if ((minutes & 1) == 1) {
                counter++;
            }
            minutes >>>= 1;
        }
        return counter == turnedOn;
    }
}
