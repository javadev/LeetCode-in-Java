package g3901_4000.s3986_number_of_elapsed_seconds_between_two_times;

// #Easy #String #Math #Mid_Level #Weekly_Contest_510
// #2026_11_03_Time_2_ms_(72.94%)_Space_43.63_MB_(98.57%)

public class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int startSec = 0;
        int endSec = 0;
        int sSec = 0;
        int eSec = 0;
        int colon = 2;
        for (int i = 0; i < 8; i++) {
            if (startTime.charAt(i) == ':') {
                startSec = (int) (startSec + sSec * Math.pow(60, colon));
                endSec = (int) (endSec + eSec * Math.pow(60, colon));
                colon--;
                sSec = 0;
                eSec = 0;
                continue;
            }
            sSec = sSec * 10 + (startTime.charAt(i) - '0');
            eSec = eSec * 10 + (endTime.charAt(i) - '0');
        }
        startSec = (int) (startSec + sSec * Math.pow(60, colon));
        endSec = (int) (endSec + eSec * Math.pow(60, colon));
        return endSec - startSec;
    }
}
