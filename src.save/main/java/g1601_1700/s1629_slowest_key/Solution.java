package g1601_1700.s1629_slowest_key;

// #Easy #Array #String #2023_09_03_Time_1_ms_(94.07%)_Space_43.9_MB_(9.16%)

@SuppressWarnings("java:S3824")
public class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxIndex = 0;
        int maxValue = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            final int newVal = releaseTimes[i] - releaseTimes[i - 1];
            if (newVal > maxValue) {
                maxValue = newVal;
                maxIndex = i;
            } else if (newVal == maxValue && keysPressed.charAt(i) > keysPressed.charAt(maxIndex)) {
                maxIndex = i;
            }
        }
        return keysPressed.charAt(maxIndex);
    }
}
