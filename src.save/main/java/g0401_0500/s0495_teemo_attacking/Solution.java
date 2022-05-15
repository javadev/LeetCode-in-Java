package g0401_0500.s0495_teemo_attacking;

// #Easy #Array #Simulation #Acceptance_56.9% #2022_03_19_Time_4_ms_(26.85%)_Space_53.7_MB_(50.49%)

public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (duration == 0) {
            return 0;
        }
        int start = timeSeries[0];
        int end = timeSeries[0] + duration - 1;
        int poisonDuration = end - start + 1;
        for (int i = 1; i < timeSeries.length; i++) {
            if (timeSeries[i] <= end) {
                poisonDuration += (duration - (end - timeSeries[i] + 1));
                end += (duration - (end - timeSeries[i] + 1));
            } else {
                start = timeSeries[i];
                end = timeSeries[i] + duration - 1;
                poisonDuration += end - start + 1;
            }
        }
        return poisonDuration;
    }
}
