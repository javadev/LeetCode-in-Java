package g2101_2200.s2126_destroying_asteroids;

// #Medium #Array #Sorting #Greedy #2022_06_03_Time_25_ms_(83.82%)_Space_54.6_MB_(93.38%)

import java.util.Arrays;

public class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long m = mass;
        for (int ele : asteroids) {
            if (m < ele) {
                return false;
            }
            m += ele;
        }
        return true;
    }
}
