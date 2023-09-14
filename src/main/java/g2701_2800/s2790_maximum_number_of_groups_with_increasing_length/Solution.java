package g2701_2800.s2790_maximum_number_of_groups_with_increasing_length;

// #Hard #Array #Math #Sorting #Greedy #Binary_Search
// #2023_09_14_Time_14_ms_(99.59%)_Space_55.6_MB_(52.28%)

import java.util.Arrays;
import java.util.List;

public class Solution {
    public int maxIncreasingGroups(List<Integer> usageLimits) {
        int n = usageLimits.size();
        long total = 0;
        long k = 0;
        int[] count = new int[n + 1];
        Arrays.fill(count, 0);
        for (int a : usageLimits) {
            int localA = (int) Math.min(a, (double) n);
            count[localA]++;
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < count[i]; j++) {
                total += i;
                if (total >= (k + 1) * (k + 2) / 2) {
                    k++;
                }
            }
        }
        return (int) k;
    }
}
