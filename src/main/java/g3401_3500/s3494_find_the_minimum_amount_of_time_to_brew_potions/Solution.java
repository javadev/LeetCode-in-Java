package g3401_3500.s3494_find_the_minimum_amount_of_time_to_brew_potions;

// #Medium #2025_03_23_Time_115_ms_(91.61%)_Space_44.66_MB_(83.22%)

import java.util.Arrays;

public class Solution {
    public long minTime(int[] skill, int[] mana) {
        long[] endTime = new long[skill.length];
        Arrays.fill(endTime, 0);
        for (int k : mana) {
            long t = 0;
            long maxDiff = 0;
            for (int j = 0; j < skill.length; ++j) {
                maxDiff = Math.max(maxDiff, endTime[j] - t);
                t += (long) skill[j] * (long) k;
                endTime[j] = t;
            }
            for (int j = 0; j < skill.length; ++j) {
                endTime[j] += maxDiff;
            }
        }
        return endTime[endTime.length - 1];
    }
}
