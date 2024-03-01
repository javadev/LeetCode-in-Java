package g2201_2300.s2279_maximum_bags_with_full_capacity_of_rocks;

// #Medium #Array #Sorting #Greedy #2022_06_18_Time_17_ms_(91.12%)_Space_84.5_MB_(81.15%)

import java.util.Arrays;

public class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int len = capacity.length;
        for (int i = 0; i < len; i++) {
            capacity[i] -= rocks[i];
        }
        Arrays.sort(capacity);
        int total = 0;
        for (int i = 0; i < len && additionalRocks > 0; i++) {
            if (capacity[i] <= additionalRocks) {
                additionalRocks -= capacity[i];
                total++;
            }
        }
        return total;
    }
}
