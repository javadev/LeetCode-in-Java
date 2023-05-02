package g2401_2500.s2446_determine_if_two_events_have_conflict;

// #Easy #Array #String #2022_12_14_Time_0_ms_(100.00%)_Space_40_MB_(87.07%)

public class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int aStart = getTimeSerial(event1[0]);
        int aEnd = getTimeSerial(event1[1]);
        int bStart = getTimeSerial(event2[0]);
        int bEnd = getTimeSerial(event2[1]);
        return (bStart >= aStart && bStart <= aEnd) || (bStart <= aStart && bEnd >= aStart);
    }

    private int getTimeSerial(String timestamp) {
        int hours = 0;
        int minutes = 0;
        boolean isHours = true;
        for (int i = 0; i < timestamp.length(); i += 1) {
            if (timestamp.charAt(i) == ':') {
                isHours = false;
            } else if (isHours) {
                hours = hours * 10 + Character.getNumericValue(timestamp.charAt(i));
            } else {
                minutes = minutes * 10 + Character.getNumericValue(timestamp.charAt(i));
            }
        }
        return 60 * hours + minutes;
    }
}
