package g3001_3100.s3075_maximize_happiness_of_selected_children;

// #Medium #Array #Sorting #Greedy #2024_04_15_Time_34_ms_(97.43%)_Space_61.4_MB_(77.84%)

import java.util.Arrays;

public class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum = 0;
        for (int i = happiness.length - 1; i >= happiness.length - k; i--) {
            happiness[i] = Math.max(0, happiness[i] - (happiness.length - 1 - i));
            sum += happiness[i];
        }
        return sum;
    }
}
