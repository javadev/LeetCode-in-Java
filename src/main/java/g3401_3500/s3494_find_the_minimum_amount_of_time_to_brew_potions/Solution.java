package g3401_3500.s3494_find_the_minimum_amount_of_time_to_brew_potions;

// #Medium #Array #Simulation #Prefix_Sum #2025_03_24_Time_113_ms_(90.95%)_Space_44.81_MB_(64.17%)

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
