package g1901_2000.s1921_eliminate_maximum_number_of_monsters;

// #Medium #Array #Sorting #Greedy #2022_05_14_Time_19_ms_(90.78%)_Space_51.1_MB_(97.09%)

import java.util.Arrays;

public class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        for (int i = 0; i < dist.length; i++) {
            dist[i] = (dist[i] - 1) / speed[i] + 1;
        }
        Arrays.sort(dist);
        int ans = 1;
        int time = 1;
        for (int i = 1; i < dist.length; i++) {
            if (dist[i] > time) {
                ans++;
                time++;
            } else {
                return ans;
            }
        }
        return ans;
    }
}
