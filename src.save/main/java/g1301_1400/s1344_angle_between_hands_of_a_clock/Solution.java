package g1301_1400.s1344_angle_between_hands_of_a_clock;

// #Medium #Math #2022_03_19_Time_0_ms_(100.00%)_Space_39_MB_(81.98%)

public class Solution {
    public double angleClock(int hour, int minutes) {
        double minAngle = minutes * 360.0 / 60;
        double hourAnglePart1 = hour != 12 ? (hour * 360.0) / 12 : 0;
        double hourAnglePart2 = (double) (30 * minutes) / (double) 60;
        double hourAngle = hourAnglePart1 + hourAnglePart2;
        double preResult = Math.abs(minAngle - (hourAngle));
        return preResult > 180 ? 360 - preResult : preResult;
    }
}
